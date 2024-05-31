package floppyborb;

import floppyborb.epicbirdobjects.Enemy;
import floppyborb.epicbirdobjects.Meteor;
import floppyborb.epicbirdobjects.Obstacle;
import floppyborb.epicbirdobjects.Pipe;
import floppyborb.epicbirdobjects.Powerup;
import floppyborb.enums.EpicBirdType;
import floppyborb.enums.PowerUpType;
import floppyborb.enums.SquareType;
import floppyborb.objectmakers.EnemyMaker;
import floppyborb.objectmakers.MeteorMaker;
import floppyborb.objectmakers.ObstacleMovePatternMaker;
import floppyborb.objectmakers.ObstaclesMaker;
import floppyborb.objectmakers.PipeMaker;
import floppyborb.objectmakers.PowerupMaker;

import java.awt.*;
import java.util.Random;
import java.util.Timer;

/**
 * Adds functions for spawning in different objects in the game
 */
public class GenericSpawnerForObjects
{
    private Board topClass;
    private Random random = new Random();
    private PipeMaker pipemaker = new PipeMaker();
    private ObstaclesMaker obstaclesMaker = new ObstaclesMaker();
    private MeteorMaker meteorMaker = new MeteorMaker();
    private Timer timer = null;
    private ObstacleMovePatternMaker movepatternmaker = new ObstacleMovePatternMaker();
    private PowerupMaker powerupmaker = new PowerupMaker();
    private EnemyMaker enemyMaker = new EnemyMaker();

    // Some constants used for spawning differnet objects on the screen.
    private final static int MIDDLE_OF_SCREEN = 300;
    private final static int MULTIPLIER = 100;

    public GenericSpawnerForObjects(final Board topclass) {
	this.topClass = topclass;
    }

    public void spawnPipe(){
	int edgeOfScreen = 1920;
	int randomPipePositionUpDown = random.nextInt(2);
	int pipePositionY;
	if (randomPipePositionUpDown == 1){
	    pipePositionY = 0;
	}
	else{
	    pipePositionY = 600;
	}
	Pipe pipe = new Pipe(new Point(edgeOfScreen, pipePositionY), pipemaker.makePipe(), EpicBirdType.PIPE);
	topClass.addEpicbird(pipe);
    }

    public void spawnObstacle(){
	//Obstacles will always spawn far right in the middle of the screen
	int randomObstacleType = random.nextInt(3);
	int randomObstaclePositionY = (random.nextInt(3) * MULTIPLIER);
	int randomMovePatternType = random.nextInt(3);
	Obstacle obstacle = new Obstacle(new Point(Board.GAME_WIDTH, MIDDLE_OF_SCREEN + randomObstaclePositionY), obstaclesMaker.makeObstaclesSquares(randomObstacleType), EpicBirdType.OBSTACLE, movepatternmaker.makeMovePattern(randomMovePatternType));
	topClass.addEpicbird(obstacle);
    }

    public void spawnEnemy(){
	int randomEnemyType = random.nextInt(3);
	Enemy enemy = new Enemy(new Point(Board.GAME_WIDTH, MIDDLE_OF_SCREEN), enemyMaker.makeEnemySquares(randomEnemyType), EpicBirdType.ENEMY);
	topClass.addEpicbird(enemy);
    }

    public void spawnMeteor() {
	int randomMeteorType = random.nextInt(3);
	Meteor meteor = new Meteor(new Point(900, 0), meteorMaker.makeMeteor(randomMeteorType), EpicBirdType.METEOR, 10);
	if(topClass.getBird().getPositionY() > meteor.getSafeZone()){
	    topClass.addEpicbird(meteor);
	}
    }

    public void spawnPowerup() {
	int randomPowerupPositionY = (random.nextInt(3) * (2*MULTIPLIER));
	int randomPowerupType = random.nextInt(4);
	PowerUpType poweruptype = null;
	SquareType[][] powerupSquares = powerupmaker.makePowerup(randomPowerupType);
	int timerdelay = 0;
	switch (randomPowerupType){
	    case 0:
		timerdelay = 300;
		poweruptype = PowerUpType.SPAWNOBSTACLES;
		break;
	    case 1:
		timerdelay = 500;
		poweruptype = PowerUpType.MOVEBIRDLEFT;
		break;
	    case 2:
		timerdelay = 500;
		poweruptype = PowerUpType.MOVEBIRDRIGHT;
		break;
	    case 3:
		timerdelay = 20;
		poweruptype = PowerUpType.INCPOINTS;
		break;
	}
	Powerup newPowerup = new Powerup(new Point(1530, MIDDLE_OF_SCREEN + randomPowerupPositionY), powerupSquares, EpicBirdType.POWERUP, timerdelay, poweruptype);
	topClass.addEpicbird(newPowerup);
    }
}

