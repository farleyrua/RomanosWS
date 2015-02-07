package co.edu.udea.appsempresariales.logic;

public class ConvertidorNumerosRomanos {
	public static int cero = 0;
	private String[] reprUnidades = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
	private String[] reprDecenas = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
	private String[] reprCentenas = {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
	private String[] reprMil = {"M"};
	public static String entradaInvalida = "Error";

	public String convertirAromanos(int entradaNumero) 
	{
		if (entradaNumero <= 0 || entradaNumero >= 1001) 
		{
			return (entradaInvalida);
		}

		StringBuilder numeroRomano = new StringBuilder();

		if (entradaNumero < 10) 
		{
			numeroRomano.append(reprUnidades[entradaNumero - 1]);
		} 
		else 
		{
			int unidades = entradaNumero % 10;
			numeroRomano.append(this.unidadesRomano(unidades));
			int aux = entradaNumero / 10;
			int decenas;
			if (entradaNumero < 100) 
			{
				decenas = aux;
				numeroRomano.insert(cero, reprDecenas[decenas - 1]);
			} 
			else 
			{
				decenas = aux % 10;
				numeroRomano.insert(cero, this.decenasRomano(decenas));
				aux = aux / 10;
				int centenas;
				if (entradaNumero < 1000) 
				{
					centenas = aux;
					numeroRomano.insert(cero,reprCentenas[centenas - 1]);
				} 
				if(entradaNumero==1000)
				{
					numeroRomano.insert(cero, reprMil[0]);
				}
			}
		}
		return numeroRomano.toString();
	}

	private String unidadesRomano(int unidades) 
	{
		if (unidades != 0) 
		{
			return (reprUnidades[unidades - 1]);
		}
		return "";
	}

	private String decenasRomano(int decenas) 
	{
		if (decenas != 0) 
		{
			return (reprDecenas[decenas - 1]);
		}
		return "";
	}
	
	public ConvertidorNumerosRomanos()
	{
		super();
	}
}