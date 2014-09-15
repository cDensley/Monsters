package monsters.controller;

import monsters.model.MarshmallowMonster;
import monsters.view.MonsterView;

public class MonsterAppController
{
	private MonsterView appView;
	private MarshmallowMonster myMonster;
	
	public MonsterAppController()
	{
		appView = new MonsterView(this);
		myMonster = new MarshmallowMonster("Bart", .667, 3.01, 1, 7, 2, false);
	}
	
	public void start()
	{
		appView.displayInformation();
	}
	
	public MarshmallowMonster getMyMonster()
	{
		return myMonster;
	}
	
}
