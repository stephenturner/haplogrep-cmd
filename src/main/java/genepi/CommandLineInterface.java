package genepi;

import genepi.base.Toolbox;
import genepi.distance.DistanceCheck;
import genepi.haplogrep.main.Haplogrep;

public class CommandLineInterface extends Toolbox {

	public CommandLineInterface(String command, String[] args) {
		super(command, args);
		printHeader();
	}

	private void printHeader() {
		System.out.println();
		System.out.println("https://haplogrep.i-med.ac.at");

	
	}

	public static void main(String[] args) throws Exception {
		CommandLineInterface toolbox = new CommandLineInterface("haplogrep", args);
		toolbox.addTool("distance", DistanceCheck.class);
		toolbox.addTool("classify", Haplogrep.class);
		toolbox.start();

	}
}