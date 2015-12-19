package General;

public class RobotPathCircular {

	final int NORTH = 0;
	final int EAST  = 1;
	final int SOUTH = 2;
	final int WEST  = 3;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//char path[] = {'G','L','G','L','G','L','G' };
		char path[] = {'G','L','L','G' };
		RobotPathCircular robot = new RobotPathCircular();
		boolean isCiruclar = robot.isCircularPath(path);
		System.out.println("Is path circular : " + isCiruclar);
		
	}

	private boolean isCircularPath(char[] path) {
		// TODO Auto-generated method stub
		
		int x = 0;
		int y = 0;
		
		int direction = NORTH;
		
		for(int i =0 ; i < path.length ; i++)
		{
			char move = path[i];
			
			if(move == 'R')
			{
				direction = (direction + 1 ) % 4;
			}
			else if (move == 'L')
			{
				direction = (direction + 3) % 4;
			}
			else
			{
				
				if(direction == NORTH)
				{
					y++;
				}
				else if(direction == EAST)
				{
					x++;
				}
				else if(direction == SOUTH)
				{
					y--;
				}
				else
				{
					x--;
				}
			}
			
		}
		
		if( x == 0 && y==0)
		{
			return true;
		}
		return false;
	}

}
