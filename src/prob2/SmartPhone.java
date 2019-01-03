package prob2;

public class SmartPhone extends MusicPhone {
	protected void playMusic() {
		System.out.println("다운로드해서 음악재생");
	}
	@Override
	public void execute( String function ) {
		if ( function.equals("앱") ) {
			app();
			return;
		}
		
		super.execute( function );
	}
	
	public void app() {
		System.out.println("앱실행");
	}
	
}
