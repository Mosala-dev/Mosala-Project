import java.util.Scanner;

public class SteersIceCream

{

	private char holder;

	private char size;

	private boolean flake;

	private char dipSauce;

	public SteersIceCream()

	{

		holder = 'c';

		size = 'g';

		flake = false;

		dipSauce = 'n';

	}

	public SteersIceCream(char size)

	{

		this.size = size;

		holder = 'c';

		flake = false;

		dipSauce = 'n';

	}

	public SteersIceCream(char size, char holder)

	{

		this.size = size;

		this.holder = holder;

		flake = false;

		dipSauce = 'n';

	}

	public SteersIceCream(char size, char holder, boolean flake, char dipSauce)

	{

		this.size = size;

		this.holder = holder;

		this.flake = flake;

		this.dipSauce = dipSauce;

	}

	public void setHolder(char p_holder)

	{

		holder = p_holder;

	}

	public void setSize(char p_size)

	{

		size = p_size;

	}

	public void setFlake(boolean flake)

	{

		this.flake = flake;

	}

	public void setDipSauce(char dipSauce)

	{

		this.dipSauce = dipSauce;

	}

	public char getHolder()

	{

		return holder;

	}

	public char getSize()

	{

		return size;

	}

	public boolean getFlake()

	{

		return flake;

	}

	public char getDipsauce()

	{

		return dipSauce;

	}

	public double price()

	{

		double price = 0;

		switch(size)

		{

			case 'g': price += 5.50;

			break;

			case 'm': price += 7.65;

			break;

			case 'l': price += 10.45;

			break;

			default: System.out.print("Invalid option");

		}

		switch(holder)

		{

			case 'c': price += 1.25;

			break;

			case 'C': price += 2.75;

			break;

			default: System.out.print("Invalid option");

		}

		if(flake)

		{

			price += 2.00;

		}

		if(dipSauce == 'y')

		{

			price += 1.75;

		}

		return price;

	}

	public String details()

	{

		Scanner sc = new Scanner(System.in);

		String details = "";

		String flavour = "";

		if(dipSauce == 'y')

		{

			System.out.println("Select dip flavour c/C");

			char input = sc.next().charAt(0);

			switch(input)

			{

				case 'c': flavour = "chocolate";

				break;

				case 'C': flavour = "caramel";

				break;

			}

		}

		else

		{

			flavour = "no";

		}

		String sz = "";

		switch(size)

		{

			case 'g': sz = "general";

			break;

			case 'm': sz = "medium";

			break;

			case 'l': sz = "large";

			break;

		}

		String hd = "";

		switch(holder)

		{

			case 'c': hd = "cone";

			break;

			case 'C': hd = "cup";

			break;

		}


		details = "Size: " + sz + "\nHolder: "+ hd + "\nFlake: "+flake+"\nDip Sauce: "+ flavour +"\nPrice: R"+ price();

		return details;

	}

}
 