package vollyball;

public abstract class Player {
	public String name;
	public int miss;
	public int block;
	public int foul;
	public int goal;
	
	public abstract void setName(String name);
	public abstract String getName();
	public abstract void setGoal(int goal);
	public abstract int getGoal();
	public abstract void setBlock(int block);
	public abstract int getBlock();
	public abstract void setMiss(int miss);
	public abstract int getMiss();
	public abstract void setFoul(int foul);
	public abstract int getFoul();
	public abstract void setAttack(int attack);
	public abstract int getAttack();
	public abstract void setBlocked(int blocked);
	public abstract int getBlocked();
	public abstract void setOut(int out);
	public abstract int getOut();
	public abstract void setRaise(int raise);
	public abstract int getRaise();
	public abstract void setDrop(int drop);
	public abstract int getDrop();
	public abstract void setFast(int fast);
	public abstract int getFast();
}

