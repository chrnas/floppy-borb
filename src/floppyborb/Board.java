package floppyborb;

import floppyborb.epicbirdobjects.Bird;
import floppyborb.epicbirdobjects.Enemy;
import floppyborb.epicbirdobjects.Pipe;
import floppyborb.epicbirdobjects.Powerup;
import floppyborb.enums.EpicBirdType;
import floppyborb.enums.SquareType;
import floppyborb.objectmakers.BirdMaker;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Holds all of the objects in the game, executes major key functions of the game
 */
public class Board
{
    public final static int GAME_WIDTH = 1920;

    public final static int GAME_HEIGHT = 1080;

    //Counters
    private int tickCounter;
    private int spawnObjectCounter;
    //Other
    public int points = 0;
    public boolean gameRunning = true;
    private Bird bird;
    private Random random = new Random();
    private BirdMaker maker = new BirdMaker();
    private CollisionHandler collisionHandler;
    private GenericSpawnerForObjects spawner;

    //Lists for gameobjects
    private List<EpicBirdObject> epicBirds;

    public Board(){
        this.tickCounter = 0;
        this.collisionHandler = new CollisionHandler(this);
        this.spawner = new GenericSpawnerForObjects(this);

        //Construct lists for objects
        this.epicBirds = new ArrayList<>();

        SquareType[][] birdSquares = {{}};
        this.bird = new Bird(new Point(0,0), birdSquares, EpicBirdType.BIRD, 1, 10);
    }

    //Getters//
    public List<EpicBirdObject> getEpicBirds() {
        return epicBirds;
    }

    public GenericSpawnerForObjects getSpawner() {
        return spawner;
    }

    public CollisionHandler getCollisionHandler() {
        return collisionHandler;
    }

    public Bird getBird() {
        return bird;
    }

    public BirdMaker getMaker() {
        return maker;
    }
    ///Game functions///

    //Gets called every TIME_DELAY of the game
    public void tick() {
        if (gameRunning) {
            if (bird.isFlyingUp()) {
                    bird.moveUp();
            }
            else{
                bird.moveObject();
            }
            //Counters
            tickCounter += 1;
            spawnObjectCounter += 1;
            
            epicBirdEvents();
            birdEvents();
            spawnObjectsPeriodically();
            grantPoints();
        }
    }
    public void epicBirdEvents() {
        if (checkIfEpicBirdObjectNotEmpty()) {
            for (int i = 0; i < epicBirds.size(); i++) {
                EpicBirdObject birdObject = epicBirds.get(i);
                birdObject.moveObject();
                //if (birdObject.getEpicBirdType() == EpicBirdType.POWERUP)
                if (birdObject.getEpicBirdType() == EpicBirdType.POWERUP ){
                    checkActivatedPowerup((Powerup) birdObject);
                }
                //else if (birdObject.getEpicBirdType() == EpicBirdType.ENEMY)
                else if ( birdObject.getEpicBirdType() == EpicBirdType.ENEMY ){
                    if (tickCounter % 5 == 0) {
                        ((Enemy) birdObject).moveAfterPlayer(bird);
                    }
                    if(tickCounter % 50 == 0) {
                        ((Enemy) birdObject).spawnBullet(this);
                    }
                }
                    if (collisionHandler.checkPossibleCollision(bird, birdObject)) {
                        gameRunning = birdObject.collisionEvent();
                        if (!gameRunning) {
                            break;
                        }
                    }
                    if (epicBirds.get(i).checkIfOutOfBounds()) {
                        epicBirds.remove(i);
                        i -= 1;
                    }
                }
            }
        }
    public void birdEvents(){
        if(bird.checkIfOutOfBounds()){
            bird.outOfBoundsEvent();
        }
    }
    //Powerup Functions//

    public void checkActivatedPowerup(Powerup powerup){
        if(powerup.powerupActivated){
            switch (powerup.getPowerupType()) {
                case SPAWNOBSTACLES:
                    spawner.spawnObstacle();
                    break;
                case MOVEBIRDRIGHT:
                    bird.position.x += Bird.MOVEMENT_SPEED;
                    break;
                case MOVEBIRDLEFT:
                    bird.position.x -= Bird.MOVEMENT_SPEED*2;
                    break;
                case INCPOINTS:
                    int bonusPoint = 10;
                    points += bonusPoint;
                    break;
            }
        }
    }

    public void spawnObjectsPeriodically() {
        /**
         * Spawns an object depending on how many ticks since last it was spawned.
         */
        if(spawnObjectCounter == 30){
            spawner.spawnObstacle();
        }

        else if (spawnObjectCounter == 50){
            int maybeSpawnMeteor = random.nextInt(5);
            if(maybeSpawnMeteor == 1){
                spawner.spawnMeteor();
            }
        }
        else if(spawnObjectCounter == 40){
            spawner.spawnPowerup();
        }

        else if(spawnObjectCounter == 60){
            spawner.spawnEnemy();
        }

        else if (spawnObjectCounter == 100) {
            spawner.spawnPipe();
            spawnObjectCounter = 0;
        }
    }

    public void grantPoints(){
        for ( EpicBirdObject pipeObject : epicBirds) {
            if (bird.getPositionX() == pipeObject.getPositionX() && pipeObject instanceof Pipe) {
                points += 1;
            }
        }
    }

    public boolean checkIfEpicBirdObjectNotEmpty(){
        return (epicBirds.size() >= 1);
    }
    public void addEpicbird(EpicBirdObject epicBirdObject) {
        epicBirds.add(epicBirdObject);
    }

    public void resetGame(){
        epicBirds.clear();
        points = 0;
        bird.position.x = 700;
        bird.position.y = 350;
        gameRunning = true;
        initializeGame();
    }

    public void initializeGame(){
        spawner.spawnObstacle();
        spawner.spawnObstacle();
        spawner.spawnObstacle();
        spawner.spawnEnemy();
        spawner.spawnPowerup();
    }

    public void initializeBird(int birdType){
        BirdMaker maker = new BirdMaker();
        this.bird = new Bird(new Point(600, 90), maker.makeBirdSquares(birdType),EpicBirdType.BIRD,1,250);
    }
}
