import java.io.*;
import java.lang.*;
import java.util.*;
public class Exercise1{
	
	static double distance(Point A, Point B){
		return Math.sqrt(Math.pow(A.getX()-B.getX(),2)+Math.pow(A.getY()-B.getY(),2));
	}
	
	static double maxDistance( List<Point> points ){
		
		double Ymax =points.get(0).getY();
		double Ymin =points.get(0).getY();
		double Xmax =points.get(0).getX();
		double Xmin =points.get(0).getX();
		int listSize=points.size();
		for(int i=1; i<listSize; i++){
			if(points.get(i).getY() > Ymax){
				Ymax=points.get(i).getY();
            }
			else if(points.get(i).getY() < Ymin){
				Ymin=points.get(i).getY();
			}
			if(points.get(i).getX() > Xmax){
				Xmax=points.get(i).getX();
            }
			else if(points.get(i).getX() < Xmin){
				Xmin=points.get(i).getX();
			}
		}	
		

		double Yedge = distance(new Point(0,Ymax),new Point(0,Ymin));
		double Xedge = distance(new Point(Xmin,0),new Point(Xmax,0));
		List<Point> aux= new ArrayList<Point>();
		if(Yedge>Xedge){
			boolean found=false;
			int i=0;
			while(!found){
				if(points.get(i).getY() == Ymin){
					aux.add(points.get(i));
					found=true;
				}
				i++;
			}
			found=false;
			i=0;
			while(!found){
				if(points.get(i).getY() == Ymax){
					aux.add(points.get(i));
					found=true;
				}
				i++;
			}
		}
		else{
			boolean found=false;
			int i=0;
			while(!found){
				if(points.get(i).getX() == Xmin){
					aux.add(points.get(i));
					found=true;
				}
				i++;
			}
			found=false;
			i=0;
			while(!found){
				if(points.get(i).getX() == Xmax){
					aux.add(points.get(i));
					found=true;
				}
				i++;
			}
		}
		
		return distance(aux.get(0),aux.get(1));
		
	}
}
