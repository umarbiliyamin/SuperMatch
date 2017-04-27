package MainPackage;

abstract class NetworkManager {

	protected String s;

	protected GameLogic gameLogic;

	NetworkManager(GameLogic gameLogic) {
		this.gameLogic = gameLogic;
	}

	abstract void connect(String ip);

	abstract void disconnect();

	abstract void send(PlayerStatus playerStatus);
}