package com.zp.facade;

public class HomeTheaterFacade {

//定义各个子系统对象
	private TheaterLight theaterLight;
	private Popcorn popcorn;
	private Screen screen;
	private Stereo stereo;
	private Projector projector;
	private DVDPlayer dvdPlayer;

	// 构造器
	public HomeTheaterFacade() {
		super();
		this.theaterLight = TheaterLight.getInstance();
		this.popcorn = Popcorn.getInstance();
		this.screen = Screen.getInstance();
		this.stereo = Stereo.getInstance();
		this.projector = Projector.getInstance();
		this.dvdPlayer = DVDPlayer.getInstance();
	}

	public void ready() {
		popcorn.on();
		popcorn.off();
		screen.down();
		projector.on();
		stereo.on();
		dvdPlayer.on();
		theaterLight.dim();
	}

	public void play() {
		dvdPlayer.play();
	}

	public void pause() {
		dvdPlayer.pause();
	}

	public void end() {
		popcorn.off();
		theaterLight.bright();
		screen.up();
		projector.off();
		stereo.off();
		dvdPlayer.off();

	}

}
