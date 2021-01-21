
import java.util.Scanner;

// https://stackoverflow.com/questions/56679782/how-to-use-ansi-escape-sequence-color-codes-for-psreadlineoption-v2-in-powershel
// https://i.stack.imgur.com/KTSQa.png

public class MMV_U1_REDUC{

	public static void main(String[] args){

		int[][] elMundo = {
			{3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,7,7,2,2,3,3,3,3,3,3,3,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,7,2,2,2,3,3,3,3,3,3,2,6,2,3,3,3,3,2,7,3,3,3,3,3,3,3,7,7,7,3,3,3,3,3,3,3,3,3,3,3,3,3,7,7,2,3,3,3,3,3,3,3,7,7,3,3,3,3,9,9,3,3,3,3,3,3,3,3,2,3,2,2,3,3,3,3,3},
			{3,3,3,3,3,3,3,7,7,2,2,2,3,3,3,3,3,2,2,3,3,3,3,9,9,7,7,3,3,3,3,3,3,7,7,7,3,3,3,3,3,3,3,3,3,3,3,3,7,7,7,2,2,3,3,3,3,7,7,7,7,3,3,3,7,0,7,9,2,9,3,3,3,3,2,2,2,2,2,3,3,3,3,3},
			{3,3,3,3,3,3,7,7,7,9,2,2,3,3,3,3,3,3,3,3,3,3,3,2,0,7,7,7,3,3,3,3,3,2,7,7,3,3,3,3,3,3,3,3,3,3,3,3,7,7,7,7,2,2,3,2,2,2,7,7,7,3,3,3,9,9,7,7,9,9,3,3,3,3,2,2,2,2,3,3,3,3,3,3},
			{3,3,3,3,3,3,7,9,9,9,9,2,2,3,3,3,3,3,3,3,3,3,2,2,2,7,7,7,2,3,3,3,3,3,7,7,2,3,3,3,3,3,3,3,3,3,3,3,7,9,7,7,2,2,2,2,2,7,7,7,7,3,3,2,9,7,9,7,9,9,2,3,3,3,2,2,2,2,3,3,3,3,3,3},
			{3,3,3,3,3,3,7,7,9,0,9,2,2,2,3,3,3,3,3,3,3,2,2,2,2,7,7,9,7,3,3,3,3,3,2,7,2,3,3,3,3,3,3,3,3,3,3,3,2,7,9,7,7,2,2,2,7,7,7,7,7,3,3,7,7,7,9,9,9,7,7,3,3,2,2,2,2,2,3,3,3,3,3,3},
			{3,3,3,3,3,3,7,7,7,2,7,2,2,2,2,3,3,3,3,3,3,2,2,2,2,2,7,9,7,9,3,3,3,3,2,2,3,3,3,3,3,3,3,3,3,3,3,3,2,2,9,7,7,2,2,2,2,7,7,7,7,3,3,7,7,9,7,9,7,9,7,3,2,7,7,2,2,2,3,3,3,3,3,3},
			{3,3,3,3,3,3,2,7,7,7,7,2,2,2,2,2,2,2,2,3,2,2,2,2,2,2,7,9,9,7,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,9,0,7,7,2,2,2,2,7,7,7,2,3,3,2,9,9,7,9,7,9,3,3,9,9,7,2,2,2,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,2,7,7,2,2,2,2,2,2,2,2,2,3,3,2,2,2,2,2,2,7,7,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,9,7,2,2,2,2,2,2,7,7,2,3,3,2,9,7,7,9,9,3,3,3,9,3,7,7,2,2,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,2,7,7,2,2,2,2,2,2,2,2,2,2,3,2,2,2,2,2,7,7,7,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,9,7,2,2,2,2,2,2,7,7,2,3,3,3,7,7,9,9,9,3,3,3,3,3,3,7,2,2,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,2,2,2,2,2,2,2,2,2,2,2,2,3,3,3,2,2,2,7,7,7,7,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,9,2,2,2,2,2,2,2,2,7,2,3,3,3,7,7,7,7,9,3,3,3,3,3,9,7,2,2,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,2,2,2,2,2,2,2,2,2,2,2,2,2,3,3,2,2,2,7,9,7,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,2,2,2,2,2,2,2,2,7,2,3,3,3,2,7,7,7,2,9,3,3,3,3,9,2,2,2,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,2,2,2,2,2,2,2,2,2,2,2,2,3,3,2,2,2,9,9,7,7,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,2,2,2,2,2,2,2,2,2,3,3,3,3,9,7,9,9,7,9,3,3,3,3,9,9,2,2,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,9,9,9,2,2,2,2,3,3,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,9,9,9,7,9,3,3,7,3,3,9,2,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,9,9,9,2,2,2,5,3,3,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,9,3,3,3,7,3,5,9,2,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,2,2,2,2,2,2,2,3,2,2,2,2,2,2,2,2,2,2,2,2,9,2,2,2,2,3,3,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,2,2,2,2,3,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,7,7,7,7,2,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,2,2,2,2,2,2,3,3,3,2,2,2,9,2,2,2,2,2,2,2,2,9,2,2,2,3,3,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,2,2,2,3,3,2,2,2,3,3,9,3,3,3,3,3,3,3,3,2,2,7,7,7,2,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,2,7,2,2,2,2,3,3,3,2,2,2,9,2,2,7,2,2,2,2,2,9,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,2,2,3,3,3,2,3,3,3,9,3,3,3,7,3,3,3,2,2,2,2,7,7,2,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,2,7,7,2,2,2,3,3,3,2,2,9,9,9,7,7,7,2,2,2,2,2,2,9,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,2,2,3,3,3,2,3,3,3,0,3,3,3,3,7,3,3,2,2,2,2,7,7,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,2,7,7,2,2,2,2,3,3,1,9,9,7,9,9,7,2,2,2,2,2,2,9,9,9,9,9,7,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,2,2,2,3,3,9,3,3,3,9,3,3,3,3,7,7,3,2,2,2,2,7,7,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,7,7,7,2,2,2,2,2,9,3,3,3,7,7,9,7,5,7,2,2,2,2,7,7,9,9,7,7,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,2,2,2,3,3,9,3,3,3,9,3,3,3,3,3,7,7,2,2,2,2,2,7,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,7,7,7,7,2,2,2,2,9,3,3,3,7,7,7,7,7,7,7,2,2,2,9,9,7,9,7,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,2,2,2,2,1,3,3,3,3,3,3,3,3,3,7,3,7,7,2,2,2,2,3,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,7,7,7,7,7,2,2,2,2,9,3,3,3,3,7,7,7,7,7,7,2,2,2,9,7,7,7,7,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,2,2,2,2,9,3,3,3,3,3,3,3,3,3,7,7,3,7,2,2,2,2,3,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,7,7,7,7,7,7,2,2,3,3,3,3,3,3,7,7,7,7,7,7,2,2,2,9,7,7,7,7,2,2,3,3,3,3,3,3,3,3,3,3,3,3,2,3,3,2,2,2,2,2,2,9,3,3,3,3,3,3,3,3,3,2,7,7,7,2,2,2,2,3,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,7,7,7,7,7,2,2,3,3,3,3,3,3,3,7,2,7,7,7,2,2,2,2,2,9,9,7,7,2,2,3,3,3,3,3,3,3,3,3,3,3,3,2,3,3,2,2,2,2,2,2,9,3,3,3,3,3,3,3,3,3,3,2,7,7,2,2,2,2,3,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,7,7,7,2,2,2,3,3,3,3,3,3,3,3,7,2,2,7,7,2,2,2,2,2,2,9,7,7,2,2,3,3,3,3,3,3,3,3,3,3,3,3,6,3,3,2,2,2,2,2,2,9,3,3,3,3,3,3,3,3,3,3,2,7,2,2,2,2,2,3,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,7,7,5,3,3,3,3,3,3,3,3,3,3,2,2,2,2,2,2,2,2,2,2,2,2,9,7,2,2,3,3,3,3,3,3,3,3,3,3,3,3,2,3,3,3,2,2,2,2,2,7,3,3,3,3,3,3,3,3,3,3,3,7,2,2,2,2,2,3,3,3,9,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,2,2,2,2,2,2,2,2,2,2,9,7,7,2,3,3,3,3,3,3,3,3,3,3,3,3,2,3,3,3,2,2,2,2,9,7,7,3,3,3,3,3,7,2,3,3,3,2,2,2,2,9,9,3,3,9,2,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,3,3,3,3,3,3,9,9,3,3,3,3,2,2,2,2,2,2,2,2,2,2,2,2,9,7,7,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,9,7,7,7,3,3,3,5,7,7,3,3,3,3,2,2,2,9,2,3,3,9,2,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,3,3,3,3,3,3,9,9,3,3,3,3,2,2,2,2,2,2,2,2,2,2,2,2,2,2,7,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,3,3,2,2,2,9,7,7,7,3,2,2,3,7,2,3,3,3,3,2,2,9,2,3,3,9,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,3,3,3,3,3,3,9,9,3,3,3,3,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,3,2,2,2,9,7,7,3,3,2,2,3,3,2,3,3,3,3,2,2,2,2,3,9,9,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,7,2,3,3,3,3,3,3,3,3,3,3,2,7,7,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,2,3,2,2,2,9,7,7,3,3,2,7,3,3,7,3,3,3,3,3,2,9,2,3,9,2,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,7,7,9,7,2,3,3,3,3,3,3,3,3,3,7,7,7,2,2,2,2,2,2,2,2,2,3,3,3,7,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,2,3,2,2,7,9,7,7,3,3,2,7,3,2,7,3,3,3,3,3,9,2,3,3,9,2,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,9,7,9,7,2,3,3,3,3,3,3,3,7,3,3,7,7,7,2,2,2,2,2,2,2,2,5,3,7,7,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,2,2,2,2,7,7,7,7,2,3,2,7,7,2,7,3,3,3,3,3,9,3,3,3,9,2,3,3,3,3,3,3},
			{3,3,3,3,3,3,9,9,7,7,7,7,9,2,3,3,3,3,3,7,7,7,7,7,7,2,2,2,2,2,2,2,2,2,7,7,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,2,2,2,2,2,2,2,7,7,7,3,3,7,7,7,7,3,3,3,3,3,2,3,3,3,2,2,9,3,3,3,3,3},
			{3,3,3,3,3,3,9,9,7,9,7,7,9,2,3,3,3,3,3,2,7,3,2,7,7,2,2,2,2,2,2,2,2,2,7,7,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,2,2,2,2,2,2,2,7,7,7,3,3,3,7,7,7,3,3,3,3,3,3,3,3,3,2,2,9,3,3,3,3,3},
			{3,3,3,3,3,3,9,7,9,7,9,7,9,2,3,3,3,3,3,2,7,7,7,7,7,2,2,2,2,2,2,2,2,7,7,2,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,2,2,2,2,2,2,2,7,7,7,3,3,3,7,7,3,3,3,3,3,3,3,3,3,3,2,2,9,3,3,3,3,3},
			{3,3,3,3,3,3,9,7,9,7,9,7,9,2,7,3,3,3,2,2,2,7,7,7,2,2,2,2,2,2,2,2,7,7,7,2,2,3,3,3,3,3,3,3,3,3,3,3,2,0,2,2,2,2,2,2,2,2,7,7,7,3,3,3,7,7,3,3,3,3,3,3,3,3,3,3,2,9,3,3,3,3,3,3},
			{3,3,3,3,3,3,9,7,7,7,9,7,2,2,7,3,3,3,2,2,2,2,7,2,2,2,2,2,2,2,2,7,7,7,7,7,2,3,3,3,3,3,3,3,3,3,3,3,7,9,2,2,2,9,2,2,2,2,7,7,2,3,3,3,3,7,3,3,3,3,3,2,2,3,3,3,2,9,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,7,9,9,9,7,9,2,2,7,7,2,2,2,2,2,2,2,2,2,2,2,2,2,7,7,7,7,7,7,2,3,3,3,3,3,3,3,3,3,3,3,7,7,7,2,2,7,2,2,2,2,7,7,2,3,3,3,3,3,3,3,3,2,2,2,2,3,3,3,2,9,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,7,9,7,7,7,9,2,2,7,3,7,2,2,2,2,2,2,2,2,2,2,2,2,7,9,7,3,7,7,2,3,3,3,3,3,3,3,3,3,3,3,2,7,7,2,2,7,9,2,2,2,2,2,2,2,3,3,3,3,3,3,2,2,2,2,2,2,3,3,2,9,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,9,9,7,9,2,7,2,2,7,3,7,2,2,2,2,2,2,2,2,2,2,2,2,7,0,7,3,7,2,3,3,3,3,3,3,3,3,3,3,3,3,3,7,7,7,7,9,9,2,2,2,2,2,2,2,3,3,3,3,2,2,2,2,2,2,2,2,2,5,2,9,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,9,7,9,2,9,9,2,2,7,3,7,7,2,2,2,2,2,2,2,2,2,2,2,2,2,3,3,3,2,3,3,3,3,3,3,3,3,3,3,3,3,3,7,7,7,7,7,9,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,9,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,9,7,9,2,9,9,2,2,2,7,7,7,2,2,2,2,2,2,2,2,2,2,2,9,9,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,7,9,9,7,7,9,9,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,2,7,7,2,2,2,2,2,2,7,3,2,2,2,2,2,2,2,2,2,2,2,2,9,9,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,7,9,7,7,7,9,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,2,7,2,2,2,2,2,2,2,7,7,2,2,2,2,2,2,2,2,2,2,2,9,3,9,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,7,9,7,2,9,2,9,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,2,2,2,2,2,2,2,2,2,2,7,7,2,2,2,2,2,2,2,2,2,2,3,3,9,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,9,2,2,9,2,9,9,9,2,2,2,2,2,2,2,2,2,2,2,3,2,2,2,2,2,2,2,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,7,2,2,2,2,2,9,9,9,2,2,2,2,2,2,2,2,2,2,9,2,2,2,2,2,2,2,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,2,2,2,2,2,7,2,2,2,2,2,2,2,2,2,9,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,2,2,2,2,9,0,9,2,2,2,2,2,2,2,7,2,2,9,2,2,2,2,2,7,2,9,3,3,3,3,3},
			{3,3,3,3,3,3,3,2,2,9,2,3,7,7,2,2,2,2,2,2,2,2,9,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,2,2,2,9,9,7,2,2,2,2,2,2,2,7,7,9,3,3,2,2,2,2,7,2,9,3,3,3,3,3},
			{3,3,3,3,3,3,3,2,2,9,3,3,3,7,2,2,2,2,2,2,2,9,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,2,2,9,7,9,2,2,2,2,2,2,2,7,9,9,3,9,2,2,2,2,7,2,9,3,3,3,3,3},
			{3,3,3,3,3,3,3,2,2,9,3,3,3,7,2,2,2,2,2,9,9,9,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,2,2,9,7,7,9,2,2,2,2,2,2,7,0,9,9,2,2,2,2,2,7,7,9,3,3,3,3,3},
			{3,3,3,3,3,3,3,2,7,9,2,3,2,7,7,2,2,2,9,9,9,9,2,2,2,2,2,2,2,2,2,2,3,3,3,3,9,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,2,2,9,7,7,9,2,2,2,2,2,7,7,2,2,2,2,2,2,3,7,7,7,2,3,3,3,3,3},
			{3,3,3,3,3,3,2,2,2,7,2,9,2,7,7,7,2,2,2,9,2,2,2,3,3,3,2,2,2,2,2,2,3,3,3,2,9,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,3,2,9,9,7,7,9,2,2,2,2,7,7,7,3,3,3,3,3,3,3,7,7,2,3,3,3,3,3},
			{3,3,3,3,3,3,2,2,2,7,7,7,2,2,7,7,7,2,3,3,3,3,3,3,3,3,3,2,2,2,2,2,3,3,3,2,9,3,3,3,3,3,3,3,3,3,3,3,2,3,3,3,3,3,2,3,2,9,7,7,7,9,7,2,2,2,7,7,3,3,3,3,3,3,3,3,7,7,7,3,3,3,3,3},
			{3,3,3,3,3,3,2,2,2,2,7,2,9,7,7,7,3,3,3,3,3,3,3,3,3,3,5,2,2,2,2,2,3,3,2,5,9,3,3,3,3,3,3,3,3,3,3,3,7,2,3,3,3,3,3,3,2,9,7,7,7,7,2,3,5,2,7,7,3,3,3,3,3,3,3,3,7,7,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,2,2,2,2,2,9,7,7,7,3,3,3,3,3,3,3,3,2,2,2,2,2,2,2,7,7,7,7,2,9,3,3,3,3,3,3,3,3,3,3,3,7,7,3,3,3,3,3,3,2,9,7,2,2,7,2,3,3,7,7,7,3,3,3,3,3,3,3,3,7,7,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,2,2,2,2,2,2,2,2,3,3,3,3,3,3,9,9,2,2,2,2,2,2,2,7,7,7,7,7,2,9,3,3,3,3,3,3,3,3,3,3,3,7,7,2,3,3,3,3,2,2,7,2,2,2,7,7,3,3,7,7,7,7,3,3,3,3,3,3,2,7,7,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,2,2,2,2,2,2,2,3,3,3,3,3,3,9,2,9,2,2,2,2,2,2,2,7,7,7,7,7,9,3,3,3,3,3,3,3,3,3,3,3,3,7,7,7,3,3,3,3,2,2,2,2,2,2,2,7,3,3,7,2,7,7,3,3,3,3,3,3,2,7,9,3,3,3,3,3,3},
			{3,3,3,3,3,3,2,2,2,2,2,2,3,3,3,3,3,3,3,9,9,2,2,2,9,9,9,2,2,2,2,7,7,7,7,9,3,3,3,3,3,3,3,3,3,3,3,3,7,7,7,3,3,3,2,2,2,2,2,2,2,2,2,3,7,7,2,7,2,3,3,3,3,3,2,5,2,9,3,3,3,3,3,3},
			{3,3,3,3,3,3,2,2,2,2,3,3,3,3,3,3,3,3,3,0,2,2,9,2,9,3,3,9,9,9,2,2,7,7,9,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,2,3,3,3,2,2,2,2,2,2,2,3,3,3,7,3,2,7,2,3,3,3,3,3,2,2,9,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,2,3,3,3,3,3,3,3,3,3,3,3,3,2,3,3,3,9,3,3,3,3,3,3,9,9,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,3,3,3,3,2,2,2,2,3,3,3,3,3,7,3,2,2,3,3,3,3,3,3,9,9,9,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,9,9,9,3,3,3,3,2,2,2,2,3,3,3,3,3,7,3,2,2,3,3,3,3,3,3,9,9,9,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,7,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,3,3,3,3,3,3,3,3,2,2,7,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,9,2,2,9,3,3,2,2,2,2,2,2,2,3,3,3,7,3,2,7,2,3,3,3,3,3,2,2,9,3,3,3,3,3,3,3,3,3,3,3,3,3,2,7,7,2,3,3,3,3,3,3,2,7,3,3,3,3,3,2,2,3,3,3,3,3,3,2,2,2,7,7,3,3,3,3,3,3},
			{3,3,3,3,3,3,7,7,7,9,3,3,2,2,2,2,2,2,2,2,2,3,7,7,2,7,2,3,3,3,3,3,2,5,2,9,3,3,3,3,3,3,3,3,3,3,3,3,2,6,7,2,3,3,3,3,3,2,7,9,9,3,3,3,3,3,2,3,3,3,3,3,3,2,2,2,7,7,3,3,3,3,3,3},
			{3,3,3,3,3,3,7,7,7,9,3,3,3,2,2,2,2,2,2,2,7,3,3,7,2,7,7,3,3,3,3,3,3,2,7,9,3,3,3,3,3,3,3,3,3,3,3,3,2,7,7,3,3,3,3,3,2,7,7,9,2,2,3,3,3,3,3,3,3,3,3,3,2,2,2,2,9,7,3,3,3,3,3,3},
			{3,3,3,3,3,3,7,7,2,9,3,3,3,2,2,7,2,2,2,7,7,3,3,7,7,7,7,3,3,3,3,3,3,2,7,7,3,3,3,3,3,3,3,3,3,3,3,3,7,7,2,3,3,3,3,3,7,7,7,7,2,2,2,3,3,3,3,3,3,3,3,3,2,2,9,9,9,7,3,3,3,3,3,3},
			{3,3,3,3,3,3,7,7,9,9,3,3,3,3,2,9,7,2,2,7,2,3,3,7,7,7,3,3,3,3,3,3,3,3,7,7,3,3,3,3,3,3,3,3,3,3,3,3,2,7,3,3,3,3,3,2,7,7,7,2,2,2,2,3,3,3,3,3,3,3,2,2,2,9,9,9,7,7,3,3,3,3,3,3},
			{3,3,3,3,3,3,7,2,9,3,3,3,3,3,2,9,7,7,7,7,2,3,5,2,7,7,3,3,3,3,3,3,3,3,7,7,3,3,3,3,3,3,3,3,3,3,3,3,3,2,3,3,3,3,9,9,2,7,7,2,2,2,2,2,3,3,3,3,3,2,2,2,2,7,9,9,7,7,3,3,3,3,3,3},
			{3,3,3,3,3,3,9,9,3,3,3,3,3,3,2,9,7,7,7,9,7,2,2,2,7,7,3,3,3,3,3,3,3,3,7,7,7,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,9,9,7,2,2,2,2,2,2,3,3,2,2,2,2,2,2,2,2,7,7,7,2,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,9,9,7,7,9,2,2,2,2,7,7,7,3,3,3,3,3,3,3,7,7,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,7,9,7,2,2,2,2,2,2,3,7,2,2,2,2,2,2,2,2,7,7,7,2,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,9,7,7,9,2,2,2,2,2,7,7,2,2,2,2,2,2,3,7,7,7,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,7,7,2,2,2,2,2,2,3,7,2,2,2,2,2,2,2,2,2,7,2,2,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,9,7,7,9,2,2,2,2,2,2,7,0,9,9,2,2,2,2,2,7,7,9,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,2,7,7,7,9,2,2,2,3,3,7,7,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,9,7,9,2,2,2,2,2,2,2,7,9,9,3,9,2,2,2,2,7,2,9,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,2,2,7,7,7,9,2,2,3,3,3,7,7,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,9,9,7,2,2,2,2,2,2,2,7,7,9,3,3,2,2,2,2,7,2,9,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,2,2,2,7,7,9,9,2,2,3,3,2,7,7,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,9,0,9,2,2,2,2,2,2,2,7,2,2,9,2,2,2,2,2,7,2,9,3,3,3,3,3,3,3,3,3,3,3,2,3,3,2,2,2,2,9,7,9,9,2,2,2,2,7,7,7,7,7,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,3,7,3,3,3,3,3,9,9,9,2,2,2,2,2,2,2,2,2,2,9,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,2,2,3,3,2,2,2,2,9,0,2,2,2,2,2,7,7,7,7,7,7,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,2,9,3,3,9,3,9,9,9,2,2,2,2,2,2,2,2,2,2,2,3,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,2,2,3,3,2,2,2,2,9,2,2,2,2,2,2,2,7,7,7,7,7,3,3,2,3,3,3,3,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,7,9,7,3,9,3,9,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,2,2,2,3,2,2,2,2,9,2,2,2,2,2,2,2,2,7,2,7,7,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,2,7,9,7,7,7,9,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,2,2,2,2,2,2,2,9,2,2,2,2,2,2,7,2,9,7,7,7,3,3,3,3,3,3,2,2,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,7,9,9,7,7,9,9,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,2,2,2,2,2,2,2,9,2,2,2,2,7,7,9,2,9,9,7,7,3,3,3,3,3,3,2,7,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,7,7,7,7,7,9,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,9,3,3,3,3,3,3,3,3,3,3,3,3,2,2,9,9,9,9,9,9,2,2,2,2,2,2,9,9,7,7,9,9,3,3,3,3,3,3,2,7,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,7,7,7,7,9,9,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,5,2,9,3,3,3,3,3,3,3,3,3,3,3,3,2,2,7,9,7,7,7,9,2,2,2,7,7,2,7,9,7,7,3,9,3,2,3,3,3,2,7,7,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,2,7,7,2,2,7,9,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3,3,2,9,3,3,3,3,3,3,3,3,3,3,3,3,2,2,7,7,7,7,0,9,2,2,2,7,7,7,7,7,7,3,3,3,9,2,3,3,3,2,7,7,7,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,7,7,7,2,2,7,2,2,2,2,7,7,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3,3,2,9,3,3,3,3,3,3,3,3,3,3,3,3,2,2,7,7,7,7,7,9,2,2,7,7,7,7,7,7,7,3,3,3,3,9,3,3,2,7,7,7,7,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,7,9,2,2,2,9,2,2,2,2,7,7,2,2,2,2,2,7,2,2,2,2,2,2,2,2,3,3,2,9,3,3,3,3,3,3,3,3,3,3,3,3,2,2,2,7,7,9,9,2,2,2,2,7,7,7,7,7,7,3,3,3,3,3,3,3,2,7,7,7,7,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,2,0,2,2,2,2,2,2,2,2,7,7,7,2,2,2,7,7,2,2,2,2,2,2,2,2,3,3,2,9,3,3,3,3,3,3,3,3,3,3,3,3,2,2,2,7,7,9,9,2,2,2,2,7,7,7,7,7,3,3,3,3,3,3,3,3,2,2,7,7,7,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,2,2,2,2,2,2,2,2,2,7,7,7,2,2,2,7,7,2,2,2,2,2,2,2,2,3,3,2,2,9,3,3,3,3,3,3,3,3,3,3,3,2,2,2,7,9,2,2,2,2,2,2,2,7,7,2,2,3,3,3,3,3,3,3,3,3,2,2,7,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,2,2,2,2,2,2,2,2,2,7,7,7,2,2,2,7,7,7,2,2,2,2,2,2,2,3,3,2,2,9,3,3,3,3,3,3,3,3,3,3,3,3,2,7,7,9,2,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,7,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,2,2,2,2,2,2,2,2,2,7,7,7,2,2,7,7,7,7,2,2,2,2,2,2,2,3,3,2,2,9,3,3,3,3,3,3,3,3,3,3,3,3,2,7,9,2,2,2,2,3,3,3,3,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,2,2,2,2,2,2,7,7,7,7,2,2,2,7,7,2,7,2,2,2,2,2,9,2,2,3,9,2,3,3,3,3,3,3,3,3,3,3,3,3,3,7,7,7,2,2,3,3,3,3,3,3,3,3,2,2,3,3,3,3,3,9,3,3,3,3,3,3,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,2,2,2,3,2,2,7,9,7,7,2,2,2,7,3,2,7,2,2,2,2,2,9,2,2,3,9,2,3,3,3,3,3,3,3,3,3,3,3,3,3,7,2,7,3,3,3,3,3,3,3,3,2,2,2,2,3,3,3,3,9,0,9,3,3,3,3,3,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,2,2,2,3,2,2,2,9,7,7,2,2,2,7,3,3,7,2,2,2,2,2,2,9,2,3,9,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,3,3,3,3,3,3,3,3,2,2,2,2,2,2,3,3,3,3,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,3,2,2,3,2,2,2,9,7,7,2,2,2,2,3,3,2,2,2,2,2,2,2,2,2,3,9,9,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,7,7,2,5,3,3,3,3,3,3,3,3,3,2,7,2,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,3,2,3,3,2,2,2,9,7,7,7,2,2,2,3,7,2,2,2,2,2,2,2,9,2,3,3,9,3,3,3,3,3,3,3,3,3,3,3,3,7,3,3,3,3,3,3,3,3,3,2,2,7,7,3,7,3,3,3,3,3,3,3,3,3,2,7,7,7,7,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,3,3,3,3,2,2,9,7,7,7,3,3,2,5,7,7,2,2,2,2,2,2,2,9,2,3,3,9,2,3,3,3,3,3,3,3,3,3,3,3,7,3,3,2,3,3,3,3,3,3,2,2,7,7,3,3,7,3,3,3,3,3,3,3,9,7,9,7,9,7,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,3,3,2,2,2,2,9,7,7,3,3,3,3,3,7,2,2,2,2,2,2,2,2,9,9,3,3,9,2,3,3,3,3,3,3,3,3,3,3,3,7,7,2,2,3,3,3,3,3,3,2,7,7,7,7,3,7,2,3,3,3,3,3,2,9,7,7,7,7,9,3,3,3,3,3,3},
			{3,3,3,3,3,3,9,9,3,3,2,2,2,2,2,7,3,3,3,3,3,3,3,2,2,2,2,7,2,2,2,2,2,3,3,3,9,3,3,3,3,3,3,3,3,3,3,3,3,7,7,3,3,3,3,3,3,3,2,7,7,7,2,3,7,2,3,3,3,3,2,2,7,7,7,9,7,0,3,3,3,3,3,3},
			{3,3,3,3,3,3,6,9,9,2,2,2,2,2,2,9,3,3,3,3,3,3,3,3,2,2,2,7,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,7,7,3,3,3,3,3,3,3,2,2,7,7,7,7,2,2,3,3,3,3,2,2,7,7,7,9,7,7,3,3,3,3,3,3},
			{3,3,3,3,3,3,9,9,9,2,2,2,2,2,2,9,3,3,3,3,3,3,3,3,3,2,2,7,7,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,7,7,7,3,3,3,3,3,2,2,2,7,7,2,2,2,3,3,3,3,2,2,9,7,7,7,9,7,3,3,3,3,3,3},
			{3,3,3,3,3,3,2,2,9,2,2,2,2,2,2,9,3,3,3,3,3,3,3,3,3,2,7,7,7,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,7,7,7,7,7,2,2,2,2,2,2,2,7,7,2,2,2,2,3,3,7,2,2,9,7,7,7,7,9,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,2,2,2,2,2,2,2,2,9,3,3,3,3,3,3,3,3,3,7,7,3,7,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,7,7,7,7,7,7,7,2,2,2,2,2,2,2,2,2,2,2,2,7,3,7,2,2,9,7,9,9,7,9,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,2,2,2,2,2,2,2,2,1,3,3,3,3,3,3,3,3,3,7,3,7,7,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,7,7,3,7,9,7,2,2,2,2,2,2,2,2,2,2,2,2,7,3,7,2,9,7,7,7,7,2,7,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,2,2,2,2,2,2,3,3,9,3,3,3,9,3,3,3,3,3,7,7,2,2,2,2,2,7,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,7,3,3,2,9,2,2,2,2,2,2,2,2,2,2,2,2,2,7,7,2,2,9,7,9,9,7,9,2,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,2,2,2,2,2,2,3,3,9,3,3,3,9,3,3,3,3,7,7,2,2,2,2,2,7,7,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,3,3,2,9,2,2,2,2,2,2,2,2,2,2,2,2,7,3,7,2,2,9,2,9,9,7,7,2,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,3,2,2,2,2,3,3,3,2,3,3,3,0,3,3,3,3,7,2,2,2,2,2,2,7,7,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,9,2,2,2,2,2,2,2,2,2,2,2,7,7,3,7,2,2,2,9,2,2,9,9,9,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,3,2,2,2,2,3,3,3,2,3,3,3,3,3,3,3,7,2,2,2,3,2,2,2,7,7,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,9,3,9,2,2,2,2,2,2,3,3,3,2,7,3,3,7,2,2,2,2,2,2,7,7,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,2,2,2,2,2,3,3,2,2,2,3,3,3,3,3,2,2,2,2,2,3,3,2,7,7,7,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,3,9,3,2,2,2,2,3,3,3,3,3,3,7,7,2,2,2,2,2,2,2,7,2,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,2,2,2,2,2,2,3,2,2,2,3,3,3,3,3,2,2,2,2,3,3,3,7,7,7,7,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,9,3,3,2,2,2,2,3,3,3,3,3,3,7,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,2,2,2,9,3,3,3,7,3,5,9,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,9,2,2,2,2,2,2,3,3,3,3,3,3,2,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,9,9,9,7,9,3,3,7,3,3,9,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,2,2,2,3,3,9,2,3,3,3,2,2,2,2,2,7,7,2,2,2,2,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,2,2,2,2,2,2,2,2,2,2,2,3,3,3,3,9,7,9,9,7,9,3,3,3,3,9,9,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,2,2,2,2,2,3,3,2,9,2,2,3,3,2,2,2,2,7,3,3,9,2,2,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,2,2,2,2,2,2,2,2,2,2,7,2,3,3,3,2,7,7,7,2,9,3,3,3,3,9,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,2,2,2,2,2,3,3,2,9,2,2,3,3,2,2,2,7,3,3,3,3,2,2,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,2,2,9,2,2,2,2,2,2,2,2,7,2,3,3,3,7,7,7,7,9,3,3,3,3,3,9,7,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,2,2,2,2,2,2,2,3,3,2,2,2,9,2,3,2,2,2,7,3,3,3,3,7,2,2,3,3,3,3,3,3},
			{3,3,3,3,3,3,2,2,9,7,2,2,2,2,2,2,7,7,2,3,3,3,7,7,9,9,9,3,3,3,3,3,3,7,2,2,3,3,3,3,3,3,3,3,3,3,3,3,9,3,3,3,3,2,2,2,2,2,2,3,3,2,2,9,0,9,3,2,2,2,7,2,3,3,2,7,2,2,3,3,3,3,3,3},
			{3,3,3,3,3,3,2,2,9,7,2,2,2,2,2,2,7,7,2,3,3,2,9,7,7,9,9,3,3,3,9,3,7,7,2,2,3,3,3,3,3,3,3,3,3,3,3,3,2,3,3,3,3,2,2,2,2,2,3,3,3,3,2,2,2,2,3,3,2,7,7,5,9,9,7,7,2,2,3,3,3,3,3,3},
			{3,3,3,3,3,3,2,9,0,7,7,2,2,2,2,7,7,7,2,3,3,2,9,9,7,9,7,9,3,3,9,9,7,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,2,2,3,3,3,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,7,7,7,2,9,7,7,2,2,2,3,3,3,3,3,3},
			{3,3,3,3,3,3,2,2,9,7,7,2,2,2,2,7,7,7,7,3,3,7,7,9,7,9,7,9,7,3,3,7,7,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,2,2,3,3,7,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,7,7,7,9,9,7,7,2,2,2,3,3,3,3,3,3},
			{3,3,3,3,3,3,2,7,9,7,7,2,2,2,7,7,7,7,7,3,3,7,7,7,9,9,9,7,7,3,9,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,2,2,7,7,7,7,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,7,7,7,2,2,2,2,2,2,3,3,3,3,3,3},
			{3,3,3,3,3,3,7,9,7,7,2,2,2,2,2,7,7,7,7,3,3,2,9,7,9,7,9,9,9,9,9,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,9,7,7,7,7,7,7,2,2,2,2,2,2,2,9,9,3,3,3,3,3,3,2,2,2,2,2,2,2,2,3,3,3,3,3,3},
			{3,3,3,3,3,3,7,7,7,7,2,2,3,2,2,2,7,7,7,3,3,3,9,9,7,7,9,9,9,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,9,7,7,7,7,7,2,2,2,2,2,2,2,2,2,9,3,3,3,3,3,3,3,2,2,2,2,2,2,2,3,3,3,3,3,3},
			{3,3,3,3,3,3,7,7,7,2,2,3,3,3,3,7,7,7,7,3,3,3,7,0,7,9,2,9,3,3,3,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,9,7,7,7,2,2,2,2,9,9,9,2,2,2,9,9,3,3,3,3,3,3,3,2,2,2,2,2,2,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,7,7,2,3,3,3,3,3,3,3,7,7,3,3,3,3,9,9,3,3,3,3,3,3,3,2,2,3,2,2,3,3,3,3,3,3,3,3,3,3,3,3,9,7,7,2,2,9,9,9,9,3,3,9,9,2,2,2,9,3,3,3,3,3,3,3,3,3,2,2,2,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,7,2,9,9,3,3,3,3,3,9,9,3,3,2,9,3,3,3,3,3,3,3,3,3,3,3,2,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3}
		};

		Scanner entrada = new Scanner(System.in);
		String opcionDelUsuario;
		boolean salirDelJuego=false;
		int miFila = 0, miColumna = 0;
		int posicionFila=57, posicionColumna=27;
		int viewport = 8;
		int alcanceAntorcha = 100;
		int hora=6, minutos=55;
		int recorrido_sol = 0;
		int recorrido_luna = 0;
		int debug = 0;

		System.out.print("\033[H\033[2J");System.out.flush();// Borro pantalla antes de empezar
		
		do{

			// Intento mugre de hora 
			minutos = minutos + 55;
			if (minutos >= 60) {
				hora = hora + 1;
				minutos = 0;
			}
				if (hora==24){hora=0;}
					
			// Fin de intento mugre
			
			// Sol
			if(hora == 1){
				alcanceAntorcha = 2;
				recorrido_luna = 4;
			}else if (hora == 2) {
				alcanceAntorcha = 3;
				recorrido_luna = 4;
			}else if (hora == 3) {
				alcanceAntorcha = 3;
				recorrido_luna = 5;
			}else if (hora == 4) {
				alcanceAntorcha = 3;
				
			} else if (hora == 5) {
				alcanceAntorcha = 4;
				recorrido_luna = 7;
				recorrido_sol = 1;
			} else if (hora == 6) {
				alcanceAntorcha = 5;
				recorrido_sol = 1;
			} else if (hora == 7) {
				alcanceAntorcha = 100;
				recorrido_sol = 1;
			} else if (hora == 8) {
				alcanceAntorcha = 100;
				recorrido_sol = 2;
			} else if (hora == 9) {
				alcanceAntorcha = 100;
				recorrido_sol = 3;
			} else if (hora == 10) {
				alcanceAntorcha = 100;
				recorrido_sol = 4;
			} else if (hora == 11) {
				alcanceAntorcha = 100;
				recorrido_sol = 5;
			} else if (hora == 12) {
				alcanceAntorcha = 100;
				recorrido_sol = 6;
			} else if (hora == 13) {
				alcanceAntorcha = 100;
				recorrido_sol = 7;
			} else if (hora == 14) {
				alcanceAntorcha = 100;
				recorrido_sol = 8;
			} else if (hora == 15) {
				alcanceAntorcha = 100;
				recorrido_sol = 9;
			} else if (hora == 16) {
				alcanceAntorcha = 100;
				recorrido_sol = 10;
			} else if (hora == 17) {
				alcanceAntorcha = 10;
				recorrido_sol = 13;
				recorrido_luna = 1;
			} else if (hora == 18) {
				alcanceAntorcha = 7;
				recorrido_sol = 14;
			} else if (hora == 19) {
				alcanceAntorcha = 4;
				recorrido_sol = 16;
			} else if (hora == 20) {
				alcanceAntorcha = 5;
				recorrido_luna = 2;
			} else if (hora == 21) {
				alcanceAntorcha = 2;
				recorrido_luna = 3;
			}
			// Fin de Sol

			System.out.print("\033[0;0H");System.out.flush();	// <-- 	En lugar de borrar pantalla, reposiciono el cursor
																				// 		en el borde superior izquierdo de la pantalla	
																				//		Con esto se atenúa el parpadeo
			
			System.out.print(BARRA);for(int i=0;i<=viewport*2;i=i+1){System.out.print(BARRA);}System.out.println(BARRA);
			System.out.print(BARRA);
			if(hora >= 7 && hora <= 19){
		
				for(int i = 0; i < recorrido_sol; i++) {
					System.out.print(BARRA);
				}
			    System.out.print(SOL);
			}
			else{
				System.out.print(BARRA);
			}

			
			System.out.println(BARRA);
			System.out.print(BARRA);
			for (int i = 0; i <= viewport * 2; i = i + 1) {
				System.out.print(BARRA);
			}
			System.out.println(BARRA);

			// INICIO IMPRESION DEL MAPA 
			for (miFila=0; miFila<elMundo.length; miFila = miFila+1) {
				if ((posicionFila+viewport>=miFila)&&(posicionFila-viewport<=miFila)) {
					// elMundo[miFila]
					System.out.print(BARRA);
					for (miColumna=0; miColumna<elMundo[miFila].length; miColumna = miColumna+1) {
						
						if (miFila==posicionFila && miColumna==posicionColumna) {
							// IMPRIMO AL PERSONAJE
							System.out.print("_O_");
						} else if((posicionColumna+viewport>=miColumna)&&(posicionColumna-viewport<=miColumna)) {
							// IMPRIMO EL MAPA (si debo)
							if ((Math.pow(posicionFila-miFila,2)+Math.pow(posicionColumna-miColumna,2))<=(Math.pow(alcanceAntorcha,2))) {
								// INICIO DEL PARSEO
								if      (elMundo[miFila][miColumna]==ID_CAMINO)			{System.out.print(CAMINO);}	
								else if (elMundo[miFila][miColumna]==ID_PARED)			{System.out.print(PARED);}	
								else if (elMundo[miFila][miColumna]==ID_CESPED)			{System.out.print(CESPED);}	
								else if (elMundo[miFila][miColumna]==ID_AGUA)			{System.out.print(AGUA);}	
								else if (elMundo[miFila][miColumna]==ID_ARBUSTOS)		{System.out.print(ARBUSTOS);}	
								else if (elMundo[miFila][miColumna]==ID_PUEBLO)			{System.out.print(PUEBLO);}	// Arbustos gruesos
								else if (elMundo[miFila][miColumna]==ID_CESPEDALTO)	{System.out.print(CESPEDALTO);}	
								else if (elMundo[miFila][miColumna]==ID_ARBOL)			{System.out.print(ARBOL);}
								else if (elMundo[miFila][miColumna]==ID_PICO)			{System.out.print(PICO);}
								// FIN DEL PARSEO
							} else {
								System.out.print(TINIEBLAS);
							}
						}
					}
					System.out.println(BARRA);
				}
			}
			System.out.print(BARRA);for(int i=0;i<=viewport*2;i=i+1){System.out.print(BARRA);}System.out.println(BARRA);	
			// FIN IMPRESION DEL MAPA

			// Impresion de data extra y menu de usuario
			System.out.print("Lat:["+posicionFila+"] Long:["+posicionColumna+"] - ");
			System.out.println("["+hora+"]h:["+minutos+"]m     ");			
			System.out.println();
			System.out.println("Ingrese opcion: w/a/s/d (f:Salir) (v:Viewport) " + debug);
			opcionDelUsuario=entrada.nextLine();
			// Fin de impresión de data extra y menu de usuario
			
			// INICIO DE ANALISIS DEL MOVIMIENTO
			if(opcionDelUsuario.equalsIgnoreCase("f")){salirDelJuego=true;}
			else if (opcionDelUsuario.equalsIgnoreCase("w")){posicionFila=posicionFila-1;}
			else if (opcionDelUsuario.equalsIgnoreCase("s")){posicionFila=posicionFila+1;}
			else if (opcionDelUsuario.equalsIgnoreCase("a")){posicionColumna=posicionColumna-1;}
			else if (opcionDelUsuario.equalsIgnoreCase("d")){posicionColumna=posicionColumna+1;}
			else if (opcionDelUsuario.equalsIgnoreCase("v")){viewport=entrada.nextInt();System.out.print("\033[H\033[2J");System.out.flush();}	// Borro pantalla al redimensionar el ViewPort
			// FIN DEL ANALISIS DE MOVIMIENTO

		}while (!salirDelJuego);
	}

	// Zona de constantes ANSI para mejorar la visualización de gráficos ASCII

	public static final String RESET = "\033[0m";  	// Text Reset
	public static final String INICIO = "\033[";		// Inicio de la cadena de color

	// LETRA

	// Regular 
	public static final String BLACK 							= "0;30";				// BLACK
	public static final String RED 								= "0;31";     			// RED
	public static final String GREEN 							= "0;32";   			// GREEN
	public static final String YELLOW 							= "0;33";  				// YELLOW
	public static final String BLUE 								= "3;34";    			// BLUE
	public static final String PURPLE							= "0;35";  				// PURPLE
	public static final String CYAN 								= "0;36";    			// CYAN
	public static final String WHITE 							= "0;37";   			// WHITE

	// Negrita
	public static final String BLACK_BOLD 						= "1;30";  				// BLACK
	public static final String RED_BOLD 						= "1;31";    			// RED
	public static final String GREEN_BOLD 						= "1;32";  				// GREEN
	public static final String YELLOW_BOLD 					= "1;33"; 				// YELLOW
	public static final String BLUE_BOLD 						= "1;34";   			// BLUE
	public static final String PURPLE_BOLD 					= "1;35"; 				// PURPLE
	public static final String CYAN_BOLD 						= "1;36";   			// CYAN
	public static final String WHITE_BOLD 						= "1;37";  				// WHITE

	// Subrayado
	public static final String BLACK_UNDERLINED 				= "4;30";  				// BLACK
	public static final String RED_UNDERLINED 				= "4;31";    			// RED
	public static final String GREEN_UNDERLINED 				= "4;32";  				// GREEN
	public static final String YELLOW_UNDERLINED 			= "4;33"; 				// YELLOW
	public static final String BLUE_UNDERLINED 				= "4;34";   			// BLUE
	public static final String PURPLE_UNDERLINED 			= "4;35"; 				// PURPLE
	public static final String CYAN_UNDERLINED 				= "4;36";   			// CYAN
	public static final String WHITE_UNDERLINED 				= "4;37";  				// WHITE

	// FONDOS

	// Normales
	public static final String BLACK_BACKGROUND 				= ";40m";  				// BLACK
	public static final String RED_BACKGROUND 				= ";41m";    			// RED
	public static final String GREEN_BACKGROUND 				= ";42m";  				// GREEN
	public static final String YELLOW_BACKGROUND				= ";43m"; 				// YELLOW
	public static final String BLUE_BACKGROUND 				= ";44m";   			// BLUE
	public static final String PURPLE_BACKGROUND				= ";45m"; 				// PURPLE
	public static final String CYAN_BACKGROUND 				= ";46m";   			// CYAN
	public static final String WHITE_BACKGROUND 				= ";47m";  				// WHITE

	// Alta intensidad
	public static final String BLACK_BRIGHT 					= ";0;90m";  			// BLACK
	public static final String RED_BRIGHT 						= ";0;91m";    		// RED
	public static final String GREEN_BRIGHT 					= ";0;92m";  			// GREEN
	public static final String YELLOW_BRIGHT 					= ";0;93m"; 			// YELLOW
	public static final String BLUE_BRIGHT 					= ";0;94m";   			// BLUE
	public static final String PURPLE_BRIGHT 					= ";0;95m"; 			// PURPLE
	public static final String CYAN_BRIGHT 					= ";0;96m";   			// CYAN
	public static final String WHITE_BRIGHT 					= ";0;97m";  			// WHITE

	// Negrita & Alta intensidad
	public static final String BLACK_BOLD_BRIGHT 			= ";1;90m"; 			// BLACK
	public static final String RED_BOLD_BRIGHT 				= ";1;91m";   			// RED
	public static final String GREEN_BOLD_BRIGHT				= ";1;92m"; 			// GREEN
	public static final String YELLOW_BOLD_BRIGHT 			= ";1;93m";				// YELLOW
	public static final String BLUE_BOLD_BRIGHT 				= ";1;94m";  			// BLUE
	public static final String PURPLE_BOLD_BRIGHT 			= ";1;95m";				// PURPLE
	public static final String CYAN_BOLD_BRIGHT 				= ";1;96m";  			// CYAN
	public static final String WHITE_BOLD_BRIGHT 			= ";1;97m"; 			// WHITE

	// Alta intensidad
	public static final String BLACK_BACKGROUND_BRIGHT 	= ";0;100m";			// BLACK
	public static final String RED_BACKGROUND_BRIGHT 		= ";0;101m";			// RED
	public static final String GREEN_BACKGROUND_BRIGHT 	= ";0;102m";			// GREEN
	public static final String YELLOW_BACKGROUND_BRIGHT 	= ";0;103m";			// YELLOW
	public static final String BLUE_BACKGROUND_BRIGHT 		= ";0;104m";			// BLUE
	public static final String PURPLE_BACKGROUND_BRIGHT 	= ";0;105m"; 			// PURPLE
	public static final String CYAN_BACKGROUND_BRIGHT 		= ";0;106m";  			// CYAN
	public static final String WHITE_BACKGROUND_BRIGHT 	= ";0;107m";   		// WHITE


	// Mosaicos
	public static final String TINIEBLAS 	= 	INICIO + BLACK + BLACK_BACKGROUND + " . " + RESET;

	public static final String BARRA 		= 	INICIO + BLACK + BLUE_BACKGROUND + "   " + RESET;

	public static final int ID_CAMINO		= 	0;
	public static final String CAMINO 		= 	INICIO + WHITE + BLACK_BACKGROUND + "/#\\" + RESET;
	
	public static final int ID_PARED			= 	1;
	public static final String PARED 		= 	INICIO + WHITE_BOLD + BLACK_BACKGROUND + "]=[" + RESET;
	
	public static final int ID_CESPED 		= 	2;
	public static final String CESPED 		= 	INICIO + BLUE + GREEN_BOLD_BRIGHT + ".:'" + RESET;
	
	public static final int ID_AGUA 			= 	3;
	public static final String AGUA 			= 	INICIO + BLUE + BLUE_BACKGROUND_BRIGHT + " ~ " + RESET;

	public static final int ID_ARBUSTOS		= 	4;
	public static final String ARBUSTOS 	= 	INICIO + GREEN_BOLD + GREEN_BOLD_BRIGHT + ". '" + RESET;

	public static final int ID_PUEBLO	= 	5;
	public static final String PUEBLO 	= 	INICIO + WHITE + BLACK_BACKGROUND + "[#]" + RESET;


	public static final int ID_CESPEDALTO	= 	6;
	public static final String CESPEDALTO 	= 	INICIO + GREEN_BOLD + GREEN_BOLD_BRIGHT + ":::" + RESET;

	public static final int ID_ARBOL 		= 	7;
	public static final String ARBOL 		= 	INICIO + RED 					+ GREEN_BACKGROUND + "*" + RESET + 
															INICIO + BLACK_BOLD 			+ GREEN_BACKGROUND + "Y" + RESET + 
															INICIO + RED 					+ GREEN_BACKGROUND + "*" + RESET;
													
	public static final int ID_PICO	 		= 	9;
	public static final String PICO 			= 	INICIO + WHITE 			+ BLACK_BACKGROUND + "/" + RESET + 
															INICIO + WHITE 			+ BLACK_BACKGROUND + "\\" + RESET + 
															INICIO + WHITE_BOLD		+ BLACK_BACKGROUND + "^" + RESET;	

	public static final String LUNA	 				= 	INICIO + YELLOW_BOLD + WHITE_BACKGROUND_BRIGHT + "(((" + RESET;
	public static final String SOL	 				= 	INICIO + YELLOW_BOLD + YELLOW_BACKGROUND_BRIGHT + "(O)" + RESET;
	public static final String CIELO 				= 	INICIO + BLUE_BOLD + CYAN_BACKGROUND_BRIGHT + "   " + RESET;
	public static final String NOCHE				= 	INICIO + BLUE_BOLD + BLACK_BOLD_BRIGHT  + "   " + RESET;

 
}