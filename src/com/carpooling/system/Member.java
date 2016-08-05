package com.carpooling.system;

public abstract class Member 
{
	public void becomeMember()
	{
		createMember();
		retrieveMember();
		updateMemberCredentials();
		deleteMember();
	}
	
	abstract public void createMember();
	abstract public void retrieveMember();
	abstract public void updateMemberCredentials();
	abstract public void deleteMember();

}
