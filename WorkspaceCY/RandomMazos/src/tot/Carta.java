package tot;

public class Carta {
	private String name;
	private boolean show;
	private int elixir;
	
	public Carta(){};
	public Carta(String _name, boolean _show, int _elixir){
		setName(_name);
		setShow(_show);
		setElixir(_elixir);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isShow() {
		return show;
	}
	public void setShow(boolean show) {
		this.show = show;
	}
	public int getElixir() {
		return elixir;
	}
	public void setElixir(int elixir) {
		this.elixir = elixir;
	}
}
