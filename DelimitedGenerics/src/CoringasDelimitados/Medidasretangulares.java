package CoringasDelimitados;

public class Medidasretangulares {
	
	package entities;

	public class Circle implements Shape {

		private double radius;

		public Circle(double radius) {
			super();
			this.radius = radius;
		}

		public double getRadius() {
			return radius;
		}

		public void setRadius(double radius) {
			this.radius = radius;
		}

		@Override
		public double area() {
			return Math.PI * radius * radius;
		}
	}
	
	//------------------------------------------------------------------------
	
	package entities;

	public class Rectangle implements Shape {

		private double width;
		private double height;
		
		public Rectangle(double width, double height) {
			this.width = width;
			this.height = height;
		}

		public double getWidth() {
			return width;
		}

		public void setWidth(double width) {
			this.width = width;
		}

		public double getHeight() {
			return height;
		}

		public void setHeight(double height) {
			this.height = height;
		}

		@Override
		public double area() {
			return width * height;
		}
	}
	//--------------------------------------------------------
	
	package entities;

	public interface Shape {

		double area();
	}
}
