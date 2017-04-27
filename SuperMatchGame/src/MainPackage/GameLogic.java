package MainPackage;


public class GameLogic  {

	public enum NextPlayer{
		Player
	}

	public enum PlayerStatus{
		Winner,Loser,NotWinner
	}

    private Interface gameInterface;
    private NetworkManager nm = null;
    private NextPlayer nextPlayer;
    private PlayerStatus playerStatus; 

    private int player1Score;
	




  public GameLogic(){
//game logic constructor
  	this.nextPlayer = NextPlayer.Player;
  	this.playerStatus = PlayerStatus.NotWinner;
  	playerScore = 0;
  	


  }


  public void setGameInterface (Interface gameInterface) {

  	this.gameInterface = gameInterface;

  }


  public void startServer (){
  	if (nm != null)
			nm.disconnect();
		nm = new TCPServer(this);
		nm.connect("localhost");
  }

  public void startClient() {
		if (nm != null)
			nm.disconnect();
		nm = new TCPClient(this);
		nm.connect("localhost");
	}
//game rules can be put here so players start playing

	public void 

	public void sendPlayerStatus(){
		if (playerScore > 0)
			playerStatus = PlayerStatus.Winner;
		else
			playerStatus = PlayerStatus.NotWinner;
		nm.send(playerStatus);
	}

	public PlayerStatus playerStatusReceived(PlayerStatus playerStatus){
		if (this.playerStatus!=PlayerStatus.Winner)
			//player will play
		else
			//end game	

		return playerStatus;
	}

	
	
}