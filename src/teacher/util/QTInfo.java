/**
 * Author: Chaoyang Liu
 * E-main: chaoyanglius@outlook.com
 *
 * Software License Agreement (GPL License)
 * This util is definition of quadruples.
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
package teacher.util;

public class QTInfo {

	public static int innerIdSeqen = 0; // numbers of all quadruples globally
	private int innerId; 		// index of current quadruple
	private String operator;	// first field of quadruple
	private String arg1;		// second field of quadruple
	private String arg2;		// third field of quadruple 
	private String result;		// forth field of quadruple

	public QTInfo(String operator, String arg1, String arg2, String result) {
		super();
		this.innerId = ++innerIdSeqen;
		this.operator = operator;
		this.arg1 = arg1;
		this.arg2 = arg2;
		this.result = result;
	}

	public QTInfo(String operator, String arg1, String arg2, int result) {
		this(operator, arg1, arg2, result + "");
	}

	public String getOperator() {
		return this.operator;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public void setResult(int result) {
		this.result = "" + result;
	}

	public String getResult() {
		return this.result;
	}

	public void setInnerId(int innerID) {
		this.innerId = innerID;
	}

	public int getInnerIdSeqen() {
		return innerIdSeqen;
	}

	public String toString() {
		// format output of quadruples
		return this.innerId + ":\t(\t" + this.operator + ",\t" + this.arg1
				+ ",\t" + this.arg2 + ",\t" + this.result + "\t)\n";
	}
}
