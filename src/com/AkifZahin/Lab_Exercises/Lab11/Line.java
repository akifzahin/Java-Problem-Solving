package com.AkifZahin.Lab_Exercises.Lab11;

public class Line 
{
	private Point start = new Point();
	private Point end = new Point();
	
	public Line(Point start, Point end) 
	{
		this.start = start;
		this.end = end;
	}

	public Line(int x1, int y1, int x2, int y2)
	{
		this.start = new Point(x1,y1);
		this.end = new Point(x2,y2);
		
		
	}

	public Point getStart() {
		return start;
	}

	public void setStart(Point start) {
		this.start = start;
	}

	public Point getEnd() {
		return end;
	}

	public void setEnd(Point end) {
		this.end = end;
	}

	@Override
	public String toString() 
	{
		return "Line [start= " + start + ", end= " + end + "]";
	}
	
	public double getLength()
	{
		return Math.sqrt( Math.pow( (end.getY() - start.getY() ),2 ) + Math.pow( (end.getX() - start.getX()),2 )) ;
	}
	
	





}
