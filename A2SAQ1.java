package Assingnment2;

      class Point {

			protected int x, y;

		   
		    public Point() {
		        this.x = 0;
		        this.y = 0;
		    }

		   
		    public Point(int x, int y) {
		        this.x = x;
		        this.y = y;
		    }

		   
		    public void display() {
		        System.out.println("Point Coordinates: (x=" + x + ", y=" + y + ")");
		    }
		}

		
		class ColorPoint extends Point {
		    private String color;

		    
		    public ColorPoint() {
		        super();
		        this.color = "Black";
		    }

		    
		    public ColorPoint(int x, int y, String color) {
		        super(x, y);
		        this.color = color;
		    }

		    
		    @Override
		    public void display() {
		        System.out.println("ColorPoint Coordinates: (x=" + x + ", y=" + y + "), Color: " + color);
		    }
		}

		
		class Point3D extends Point {
		    private int z;

		    
		    public Point3D() {
		        super();
		        this.z = 0;
		    }

		    
		    public Point3D(int x, int y, int z) {
		        super(x, y);
		        this.z = z;
		    }

		  
		    @Override
		    public void display() {
		        System.out.println("Point3D Coordinates: (x=" + x + ", y=" + y + ", z=" + z + ")");
		    }
		}

		
		public class A2SAQ1 {
		    public static void main(String[] args) {
		        Point p = new Point(2, 3);
		        ColorPoint cp = new ColorPoint(5, 6, "Red");
		        Point3D p3d = new Point3D(1, 4, 7);

		        p.display();
		        cp.display();
		        p3d.display();
		    }
		}