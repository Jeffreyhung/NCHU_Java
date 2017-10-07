package vollyball;

public final class SetterPlayer extends Player{
	private int raise;
	private int drop;
	private int fast;
	
	public SetterPlayer(){
		setName("");
		setGoal(0);
		setMiss(0);
		setBlock(0);
		setFoul(0);
		setRaise(0);
		setDrop(0);
		setFast(0);
	}

	public SetterPlayer(String nam, int g, int m, int b ,int fo,int r, int d, int f){
		setName(nam);
		setGoal(g);
		setMiss(m);
		setBlock(b);
		setFoul(fo);
		setRaise(r);
		setDrop(d);
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

	public void setRaise(int r){
		raise = r;
	}

	public void setDrop(int d){
		drop = d;
	}

	public void setFast(int f){
		fast = f;
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
	public int getRaise(){
		return raise;
	}

	public int getDrop(){
		return drop;
	}

	public int getFast(){
		return fast;
	}

        public int getAttack(){
		return 0;
	}

	public int getOut(){
		return 0;
	}

        public void setAttack(int a){
	}

	public void setOut(int o){
	}

        public void setBlocked(int b){
	}

	public int getBlocked(){
		return 0;
	}
}