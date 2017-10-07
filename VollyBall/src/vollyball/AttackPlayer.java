package vollyball;

public final class AttackPlayer extends Player{
	private int blocked;
	private int attack;
	private int out;

	public AttackPlayer(){
		setName("");
		setGoal(0);
		setMiss(0);
		setBlock(0);
		setFoul(0);
		setBlocked(0);
		setAttack(0);
		setOut(0);
	}

	public AttackPlayer(String nam,int g, int m, int bl ,int f,int b, int a, int o){
		setName(nam);
		setGoal(g);
		setMiss(m);
		setBlock(bl);
		setFoul(f);
		setBlocked(b);
		setAttack(a);
		setOut(o);
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

	public void setAttack(int a){
		attack = a;
	}

	public void setOut(int o){
		out = o;
	}

	public int getBlocked(){
		return blocked;
	}

	public int getAttack(){
		return attack;
	}

	public int getOut(){
		return out;
	}

        public int getFast(){
		return 0;
	}

        public int getRaise(){
		return 0;
	}

	public int getDrop(){
		return 0;
	}
        
	public void setRaise(int r){
	}

	public void setDrop(int d){
	}

	public void setFast(int f){
	}

}