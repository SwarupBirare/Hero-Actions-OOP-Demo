abstract class Hero{
	abstract void action();
}
class Talk extends Hero{
	@Override
	void action(){
		System.out.println("Hero is talking");
	}
}
class Walk extends Hero{
	@Override
	void action(){
		System.out.println("Hero is walking");
	}
}
class Run extends Hero{
	@Override
	void action(){
		System.out.println("Hero is running");
	}
}
class Fly extends Hero{
	@Override
	void action(){
		System.out.println("Hero is flying");
	}
}
class Fight extends Hero{
	@Override
	void action(){
		System.out.println("Hero is fighting");
	}
}
class Save extends Hero{
	@Override
	void action(){
		System.out.println("Hero is saving needy people");
	}
}
class Award extends Hero{
	@Override
	void action(){
		System.out.println("Hero is wins Award...!!!");
	}
}
class App{
	static void movie(Hero h){
		h.action();
	}
	public static void main(String[] args) {
		movie(new Talk());
		movie(new Walk());
		movie(new Run());
		movie(new Fly());
		movie(new Fight());
		movie(new Save());
		movie(new Award());
	}
}