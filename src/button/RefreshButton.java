package button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import config.PlayerStatus;
import main.Main;
import render.Resource;
import ui.GameScreen;

public class RefreshButton extends RoundButton {
	public RefreshButton() {
		super(Resource.refreshButton);
		setSize(70, 70);
		
		addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Main.gameWindow.switchScreen(new GameScreen());
			}
		});
	}
}