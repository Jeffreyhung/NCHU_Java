package vollyball;

public final class BlockerPlayer extends Player{
	private int blocked;
	private int out;
	private int fast;

	public BlockerPlayer(){
		setName("");
		setGoal(0);
		setMiss(0);
		setBlock(0);
		setFoul(0);
		setBlocked(0);
		setOut(0);
		setFast(0);
	}

	public BlockerPlayer(String nam,int g, int m, int bl ,int fo,int b, int o, int f){
		setName(nam);
		setGoal(g);
		setMiss(m);
		setBlock(bl);
		setFoul(fo);
		setBlocked(b);
		setOut(o);
		setFast(f);
	}

	public void setName(String n) {
		name = n;
	}

	public void setGoal(int g) {
		goal = g;
	}
	
	public void setMiss (int m){
		miss = m;
	}

	public void setBlock (int b){
		block = b;
	}

	public void setFoul (int f ){
		foul = f;
	}

	public String getName() {
		return name;
	}

	public int getGoal() {
		return goal;
	}
	
	public int getMiss() {
		return miss;
	}

	public int getBlock() {
		return block;
	}

	public int getFoul() {
		return foul;
	}
	
	public void setBlocked(int b){
		blocked = b;
	}

	public void setOut(int o){
		out = o;
	}

	public void setFast(int f){
		fast = f;
	}

	public int getBlocked(){
		return blocked;
	}

	public int getOut(){
		return out;
	}

	public int getFast(){
		return fast;
	}
        public int getRaise(){
		return 0;
	}

	public int getDrop(){
		return 0;
	}

        public int getAttack(){
		return 0;
	}

	public void setRaise(int r){
	}

	public void setDrop(int d){
	}

	public void setAttack(int a){
	}


}
