package com.volmit.react.api;

import org.bukkit.map.MapFont;

public class ReactFont extends MapFont
{

	private static final int spaceSize = 2;

	private static final String fontChars = " !\"#$%&'()*+,-./0123456789:;<=>?" + "@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_" + "'abcdefghijklmnopqrstuvwxyz{|}~\u007F" + "\u00C7\u00FC\u00E9\u00E2\u00E4\u00E0\u00E5\u00E7" + "\u00EA\u00EB\u00E8\u00EF\u00EE\u00EC\u00C4\u00C5" + "\u00C9\u00E6\u00C6\u00F4\u00F6\u00F2\u00FB\u00F9" + "\u00FF\u00D6\u00DC\u00F8\u00A3\u00D8\u00D7\u0191" + "\u00E1\u00ED\u00F3\u00FA\u00F1\u00D1\u00AA\u00BA" + "\u00BF\u00AE\u00AC\u00BD\u00BC\u00A1\u00AB\u00BB";

	private static final int[][] fontData = new int[][] {
		//@fuckboy:on
		{0,0,0,0,0,0,0,0},
		{126,129,165,129,189,153,129,126},
		{126,255,219,255,195,231,255,126},
		{54,127,127,127,62,28,8,0},
		{8,28,62,127,62,28,8,0},
		{28,62,28,127,127,62,28,62},
		{8,8,28,62,127,62,28,62},
		{0,0,24,60,60,24,0,0},
		{255,255,231,195,195,231,255,255},
		{0,60,102,66,66,102,60,0},
		{255,195,153,189,189,153,195,255},
		{240,224,240,190,51,51,51,30},
		{60,102,102,102,60,24,126,24},
		{252,204,252,12,12,14,15,7},
		{254,198,254,198,198,230,103,3},
		{153,90,60,231,231,60,90,153},
		{1,7,31,127,31,7,1,0},
		{64,112,124,127,124,112,64,0},
		{24,60,126,24,24,126,60,24},
		{102,102,102,102,102,0,102,0},
		{254,219,219,222,216,216,216,0},
		{124,198,28,54,54,28,51,30},
		{0,0,0,0,126,126,126,0},
		{24,60,126,24,126,60,24,255},
		{24,60,126,24,24,24,24,0},
		{24,24,24,24,126,60,24,0},
		{0,24,48,127,48,24,0,0},
		{0,12,6,127,6,12,0,0},
		{0,0,3,3,3,127,0,0},
		{0,36,102,255,102,36,0,0},
		{0,24,60,126,255,255,0,0},
		{0,255,255,126,60,24,0,0},
		{0,0,0,0,0,0,0,0},
		{1,1,1,1,1,0,1,0},
		{10,10,5,0,0,0,0,0},
		{10,10,31,10,31,10,10,0},
		{4,30,1,14,16,15,4,0},
		{17,9,8,4,2,18,17,0},
		{4,10,4,22,13,9,22,0},
		{2,2,1,0,0,0,0,0},
		{12,2,1,1,1,2,12,0},
		{3,4,8,8,8,4,3,0},
		{0,0,9,6,9,0,0,0},
		{0,4,4,31,4,4,0,0},
		{0,0,0,0,0,1,1,1},
		{0,0,0,31,0,0,0,0},
		{0,0,0,0,0,1,1,0},
		{16,8,8,4,2,2,1,0},
		{14,17,25,21,19,17,14,0},
		{4,6,4,4,4,4,31,0},
		{14,17,16,12,2,17,31,0},
		{14,17,16,12,16,17,14,0},
		{24,20,18,17,31,16,16,0},
		{31,1,15,16,16,17,14,0},
		{12,2,1,15,17,17,14,0},
		{31,17,16,8,4,4,4,0},
		{14,17,17,14,17,17,14,0},
		{14,17,17,30,16,8,6,0},
		{0,1,1,0,0,1,1,0},
		{0,1,1,0,0,1,1,1},
		{8,4,2,1,2,4,8,0},
		{0,0,31,0,0,31,0,0},
		{1,2,4,8,4,2,1,0},
		{14,17,16,8,4,0,4,0},
		{30,33,45,45,61,1,30,0},
		{14,17,31,17,17,17,17,0},
		{15,17,15,17,17,17,15,0},
		{14,17,1,1,1,17,14,0},
		{15,17,17,17,17,17,15,0},
		{31,1,7,1,1,1,31,0},
		{31,1,7,1,1,1,1,0},
		{30,1,25,17,17,17,14,0},
		{17,17,31,17,17,17,17,0},
		{7,2,2,2,2,2,7,0},
		{16,16,16,16,16,17,14,0},
		{17,9,7,9,17,17,17,0},
		{1,1,1,1,1,1,31,0},
		{17,27,21,17,17,17,17,0},
		{17,19,21,25,17,17,17,0},
		{14,17,17,17,17,17,14,0},
		{15,17,15,1,1,1,1,0},
		{14,17,17,17,17,9,22,0},
		{15,17,15,17,17,17,17,0},
		{30,1,14,16,16,17,14,0},
		{31,4,4,4,4,4,4,0},
		{17,17,17,17,17,17,14,0},
		{17,17,17,17,10,10,4,0},
		{17,17,17,17,21,27,17,0},
		{17,10,4,10,17,17,17,0},
		{17,10,4,4,4,4,4,0},
		{31,16,8,4,2,1,31,0},
		{7,1,1,1,1,1,7,0},
		{1,2,2,4,8,8,16,0},
		{7,4,4,4,4,4,7,0},
		{4,10,17,0,0,0,0,0},
		{0,0,0,0,0,0,0,31},
		{1,1,2,0,0,0,0,0},
		{0,0,14,16,30,17,30,0},
		{1,1,13,19,17,17,15,0},
		{0,0,14,17,1,17,14,0},
		{16,16,22,25,17,17,30,0},
		{0,0,14,17,31,1,30,0},
		{12,2,15,2,2,2,2,0},
		{0,0,30,17,17,30,16,15},
		{1,1,13,19,17,17,17,0},
		{1,0,1,1,1,1,1,0},
		{16,0,16,16,16,17,17,14},
		{1,1,9,5,3,5,9,0},
		{1,1,1,1,1,1,2,0},
		{0,0,11,21,21,17,17,0},
		{0,0,15,17,17,17,17,0},
		{0,0,14,17,17,17,14,0},
		{0,0,13,19,17,15,1,1},
		{0,0,22,25,17,30,16,16},
		{0,0,13,19,1,1,1,0},
		{0,0,30,1,14,16,15,0},
		{2,2,7,2,2,2,4,0},
		{0,0,17,17,17,17,30,0},
		{0,0,17,17,17,10,4,0},
		{0,0,17,17,21,21,30,0},
		{0,0,17,10,4,10,17,0},
		{0,0,17,17,17,30,16,15},
		{0,0,31,8,4,2,31,0},
		{12,2,2,1,2,2,12,0},
		{1,1,1,0,1,1,1,0},
		{3,4,4,8,4,4,3,0},
		{38,25,0,0,0,0,0,0},
		{0,0,4,10,17,17,31,0},
		{14,17,1,1,17,14,16,12},
		{10,0,17,17,17,17,30,0},
		{24,0,14,17,31,1,30,0},
		{14,17,14,16,30,17,30,0},
		{10,0,14,16,30,17,30,0},
		{3,0,14,16,30,17,30,0},
		{4,0,14,16,30,17,30,0},
		{0,14,17,1,17,14,16,12},
		{14,17,14,17,31,1,30,0},
		{10,0,14,17,31,1,30,0},
		{3,0,14,17,31,1,30,0},
		{5,0,2,2,2,2,2,0},
		{14,17,4,4,4,4,4,0},
		{3,0,2,2,2,2,2,0},
		{17,14,17,31,17,17,17,0},
		{4,0,14,17,31,17,17,0},
		{24,0,31,1,7,1,31,0},
		{0,0,10,20,30,5,30,0},
		{30,5,15,5,5,5,29,0},
		{14,17,14,17,17,17,14,0},
		{10,0,14,17,17,17,14,0},
		{3,0,14,17,17,17,14,0},
		{14,17,0,17,17,17,30,0},
		{3,0,17,17,17,17,30,0},
		{10,0,17,17,17,30,16,15},
		{17,14,17,17,17,17,14,0},
		{17,0,17,17,17,17,14,0},
		{0,0,14,25,21,19,14,4},
		{12,18,2,15,2,2,31,0},
		{14,17,25,21,19,17,14,0},
		{0,0,5,2,5,0,0,0},
		{8,20,4,14,4,4,5,2},
		{24,0,14,16,30,17,30,0},
		{3,0,1,1,1,1,1,0},
		{24,0,14,17,17,17,14,0},
		{24,0,17,17,17,17,30,0},
		{31,0,15,17,17,17,17,0},
		{31,0,17,19,21,25,17,0},
		{14,16,31,30,0,31,0,0},
		{14,17,17,14,0,31,0,0},
		{4,0,4,2,1,17,14,0},
		{0,30,45,37,43,30,0,0},
		{0,0,0,31,16,16,0,0},
		{17,9,8,4,18,10,25,0},
		{17,9,8,4,26,26,17,0},
		{0,1,0,1,1,1,1,0},
		{0,20,10,5,10,20,0,0},
		{0,5,10,20,10,5,0,0},
		{68,17,68,17,68,17,68,17},
		{170,85,170,85,170,85,170,85},
		{219,238,219,119,219,238,219,119},
		{24,24,24,24,24,24,24,24},
		{24,24,24,24,31,24,24,24},
		{24,24,31,24,31,24,24,24},
		{108,108,108,108,111,108,108,108},
		{0,0,0,0,127,108,108,108},
		{0,0,31,24,31,24,24,24},
		{108,108,111,96,111,108,108,108},
		{108,108,108,108,108,108,108,108},
		{0,0,127,96,111,108,108,108},
		{108,108,111,96,127,0,0,0},
		{108,108,108,108,127,0,0,0},
		{24,24,31,24,31,0,0,0},
		{0,0,0,0,31,24,24,24},
		{24,24,24,24,248,0,0,0},
		{24,24,24,24,255,0,0,0},
		{0,0,0,0,255,24,24,24},
		{24,24,24,24,248,24,24,24},
		{0,0,0,0,255,0,0,0},
		{24,24,24,24,255,24,24,24},
		{24,24,248,24,248,24,24,24},
		{108,108,108,108,236,108,108,108},
		{108,108,236,12,252,0,0,0},
		{0,0,252,12,236,108,108,108},
		{108,108,239,0,255,0,0,0},
		{0,0,255,0,239,108,108,108},
		{108,108,236,12,236,108,108,108},
		{0,0,255,0,255,0,0,0},
		{108,108,239,0,239,108,108,108},
		{24,24,255,0,255,0,0,0},
		{108,108,108,108,255,0,0,0},
		{0,0,255,0,255,24,24,24},
		{0,0,0,0,255,108,108,108},
		{108,108,108,108,252,0,0,0},
		{24,24,248,24,248,0,0,0},
		{0,0,248,24,248,24,24,24},
		{0,0,0,0,252,108,108,108},
		{108,108,108,108,255,108,108,108},
		{24,24,255,24,255,24,24,24},
		{24,24,24,24,31,0,0,0},
		{0,0,0,0,248,24,24,24},
		{255,255,255,255,255,255,255,255},
		{0,0,0,0,255,255,255,255},
		{15,15,15,15,15,15,15,15},
		{240,240,240,240,240,240,240,240},
		{255,255,255,255,0,0,0,0},
		{0,0,110,59,19,59,110,0},
		{0,30,51,31,51,31,3,3},
		{0,63,51,3,3,3,3,0},
		{0,127,54,54,54,54,54,0},
		{63,51,6,12,6,51,63,0},
		{0,0,126,27,27,27,14,0},
		{0,102,102,102,102,62,6,3},
		{0,110,59,24,24,24,24,0},
		{63,12,30,51,51,30,12,63},
		{28,54,99,127,99,54,28,0},
		{28,54,99,99,54,54,119,0},
		{56,12,24,62,51,51,30,0},
		{0,0,126,219,219,126,0,0},
		{96,48,126,219,219,126,6,3},
		{28,6,3,31,3,6,28,0},
		{30,51,51,51,51,51,51,0},
		{0,63,0,63,0,63,0,0},
		{12,12,63,12,12,0,63,0},
		{6,12,24,12,6,0,63,0},
		{24,12,6,12,24,0,63,0},
		{112,216,216,24,24,24,24,24},
		{24,24,24,24,24,27,27,14},
		{12,12,0,63,0,12,12,0},
		{0,110,59,0,110,59,0,0},
		{28,54,54,28,0,0,0,0},
		{0,0,0,24,24,0,0,0},
		{0,0,0,0,24,0,0,0},
		{240,48,48,48,55,54,60,56},
		{30,54,54,54,54,0,0,0},
		{14,24,12,6,30,0,0,0},
		{0,0,60,60,60,60,0,0},
		{0,0,0,0,0,0,0,0},
		//@fuckboy:off
	};

	/**
	 * A static non-malleable MinecraftFont.
	 */
	public static final ReactFont Font = new ReactFont(false);

	/**
	 * Initialize a new MinecraftFont.
	 */
	public ReactFont()
	{
		this(true);
	}

	private ReactFont(boolean malleable)
	{
		for(int i = 1; i < fontData.length; ++i)
		{
			char ch = (char) i;
			if(i >= 32 && i < 32 + fontChars.length())
			{
				ch = fontChars.charAt(i - 32);
			}

			if(ch == ' ')
			{
				setChar(ch, new CharacterSprite(spaceSize, 8, new boolean[spaceSize * 8]));
				continue;
			}

			int[] rows = fontData[i];
			int width = 0;
			for(int r = 0; r < 8; ++r)
			{
				for(int c = 0; c < 8; ++c)
				{
					if((rows[r] & (1 << c)) != 0 && c > width)
					{
						width = c;
					}
				}
			}
			++width;

			boolean[] data = new boolean[width * 8];
			for(int r = 0; r < 8; ++r)
			{
				for(int c = 0; c < width; ++c)
				{
					data[r * width + c] = (rows[r] & (1 << c)) != 0;
				}
			}

			setChar(ch, new CharacterSprite(width, 8, data));
		}

		this.malleable = malleable;
	}

}