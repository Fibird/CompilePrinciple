/**
 * Author: Chaoyang Liu
 * E-main: chaoyanglius@outlook.com
 *
 * Software License Agreement (GPL License)
 * Practice of course "Principles of Compilers" using JavaCC
 * Copyright (c) 2017, Chaoyang Liu
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 ************************************************************************/
package grammar.genTree.parser;
import java.io.FileReader;

import java.io.FileNotFoundException;
public class MainTest {
	public static void main(String args []) throws FileNotFoundException {
		// The files used to be tested are:
		// assign.c, if_block.c, if_else.c, nested_if_else.c, while_block.c
		FileReader Fr = new FileReader("test/if_elif.c"); 
	    new Parser2(Fr);
	    try
	    {
	      SimpleNode n = Parser2.Start();
	      n.dump("");
	      Parser2.qtTable.printQTTable();
	      System.out.println("Thank you.");
	    }
	    catch (Exception e)
	    {
	      System.out.println("Oops.");
	      System.out.println(e.getMessage());
	    }
	  }	  
}
