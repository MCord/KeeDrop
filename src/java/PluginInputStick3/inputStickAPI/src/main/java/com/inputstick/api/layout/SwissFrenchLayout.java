package com.inputstick.api.layout;

public class SwissFrenchLayout extends KeyboardLayout {
	
	public static final String LOCALE_NAME = "fr-CH";
	
	
	
	private static final int[][] FAST_LUT = {
		{    0,	    0,	    0,	    0,	    0	},	
		{    8,	    2,	   37,	    0,	    0	},	
		{   27,	    1,	   47,	    0,	    0	},	
		{   28,	    1,	   49,	    0,	    0	},	
		{   29,	    1,	   48,	    0,	    0	},	
		{   32,	    0,	   44,	    0,	    0	},	
		{   33,	    2,	   48,	    0,	    0	},	
		{   34,	    2,	   31,	    0,	    0	},	
		{   35,	   64,	   32,	    0,	    0	},	
		{   36,	    0,	   49,	    0,	    0	},	
		{   37,	    2,	   34,	    0,	    0	},	
		{   38,	    2,	   35,	    0,	    0	},	
		{   39,	    0,	   45,	    0,	    0	},	
		{   41,	    2,	   38,	    0,	    0	},	
		{   42,	    2,	   32,	    0,	    0	},	
		{   43,	    2,	   30,	    0,	    0	},	
		{   44,	    0,	   54,	    0,	    0	},	
		{   45,	    0,	   56,	    0,	    0	},	
		{   46,	    0,	   55,	    0,	    0	},	
		{   47,	    2,	   36,	    0,	    0	},	
		{   48,	    0,	   39,	    0,	    0	},	
		{   49,	    0,	   30,	    0,	    0	},	
		{   50,	    0,	   31,	    0,	    0	},	
		{   51,	    0,	   32,	    0,	    0	},	
		{   52,	    0,	   33,	    0,	    0	},	
		{   53,	    0,	   34,	    0,	    0	},	
		{   54,	    0,	   35,	    0,	    0	},	
		{   55,	    0,	   36,	    0,	    0	},	
		{   56,	    0,	   37,	    0,	    0	},	
		{   57,	    0,	   38,	    0,	    0	},	
		{   58,	    2,	   55,	    0,	    0	},	
		{   59,	    2,	   54,	    0,	    0	},	
		{   60,	    0,	  100,	    0,	    0	},	
		{   61,	    2,	   39,	    0,	    0	},	
		{   62,	    2,	  100,	    0,	    0	},	
		{   63,	    2,	   45,	    0,	    0	},	
		{   64,	   64,	   31,	    0,	    0	},	
		{   65,	    2,	    4,	    0,	    0	},	
		{   66,	    2,	    5,	    0,	    0	},	
		{   67,	    2,	    6,	    0,	    0	},	
		{   68,	    2,	    7,	    0,	    0	},	
		{   69,	    2,	    8,	    0,	    0	},	
		{   70,	    2,	    9,	    0,	    0	},	
		{   71,	    2,	   10,	    0,	    0	},	
		{   72,	    2,	   11,	    0,	    0	},	
		{   73,	    2,	   12,	    0,	    0	},	
		{   74,	    2,	   13,	    0,	    0	},	
		{   75,	    2,	   14,	    0,	    0	},	
		{   76,	    2,	   15,	    0,	    0	},	
		{   77,	    2,	   16,	    0,	    0	},	
		{   78,	    2,	   17,	    0,	    0	},	
		{   79,	    2,	   18,	    0,	    0	},	
		{   80,	    2,	   19,	    0,	    0	},	
		{   81,	    2,	   20,	    0,	    0	},	
		{   82,	    2,	   21,	    0,	    0	},	
		{   83,	    2,	   22,	    0,	    0	},	
		{   84,	    2,	   23,	    0,	    0	},	
		{   85,	    2,	   24,	    0,	    0	},	
		{   86,	    2,	   25,	    0,	    0	},	
		{   87,	    2,	   26,	    0,	    0	},	
		{   88,	    2,	   27,	    0,	    0	},	
		{   89,	    2,	   29,	    0,	    0	},	
		{   90,	    2,	   28,	    0,	    0	},	
		{   91,	   64,	   47,	    0,	    0	},	
		{   92,	   64,	  100,	    0,	    0	},	
		{   93,	   64,	   48,	    0,	    0	},	
		{   94,	    0,	   44,	    0,	   46	},	
		{   95,	    2,	   56,	    0,	    0	},	
		{   96,	    0,	   44,	    2,	   46	},	
		{   97,	    0,	    4,	    0,	    0	},	
		{   98,	    0,	    5,	    0,	    0	},	
		{   99,	    0,	    6,	    0,	    0	},	
		{  100,	    0,	    7,	    0,	    0	},	
		{  101,	    0,	    8,	    0,	    0	},	
		{  102,	    0,	    9,	    0,	    0	},	
		{  103,	    0,	   10,	    0,	    0	},	
		{  104,	    0,	   11,	    0,	    0	},	
		{  105,	    0,	   12,	    0,	    0	},	
		{  106,	    0,	   13,	    0,	    0	},	
		{  107,	    0,	   14,	    0,	    0	},	
		{  108,	    0,	   15,	    0,	    0	},	
		{  109,	    0,	   16,	    0,	    0	},	
		{  110,	    0,	   17,	    0,	    0	},	
		{  111,	    0,	   18,	    0,	    0	},	
		{  112,	    0,	   19,	    0,	    0	},	
		{  113,	    0,	   20,	    0,	    0	},	
		{  114,	    0,	   21,	    0,	    0	},	
		{  115,	    0,	   22,	    0,	    0	},	
		{  116,	    0,	   23,	    0,	    0	},	
		{  117,	    0,	   24,	    0,	    0	},	
		{  118,	    0,	   25,	    0,	    0	},	
		{  119,	    0,	   26,	    0,	    0	},	
		{  120,	    0,	   27,	    0,	    0	},	
		{  121,	    0,	   29,	    0,	    0	},	
		{  122,	    0,	   28,	    0,	    0	},	
		{  123,	   64,	   52,	    0,	    0	},	
		{  124,	   64,	   36,	    0,	    0	},	
		{  125,	   64,	   49,	    0,	    0	},	
		{  126,	   64,	   46,	    0,	    0	},	
		{  162,	   64,	   37,	    0,	    0	},	
		{  163,	    2,	   49,	    0,	    0	},	
		{  166,	   64,	   30,	    0,	    0	},	
		{  167,	   64,	   34,	    0,	    0	},	
		{  168,	    0,	   48,	    0,	    0	},	
		{  172,	   64,	   35,	    0,	    0	},	
		{  176,	   64,	   33,	    0,	    0	},	
		{  180,	    0,	   44,	   64,	   45	},	
		{  192,	    2,	    4,	    2,	   46	},	
		{  193,	    2,	    4,	   64,	   45	},	
		{  194,	    2,	    4,	    0,	   46	},	
		{  200,	    2,	    8,	    2,	   46	},	
		{  201,	    2,	    8,	   64,	   45	},	
		{  202,	    2,	    8,	    0,	   46	},	
		{  204,	    2,	   12,	    2,	   46	},	
		{  205,	    2,	   12,	   64,	   45	},	
		{  206,	    2,	   12,	    0,	   46	},	
		{  210,	    2,	   18,	    2,	   46	},	
		{  211,	    2,	   18,	   64,	   45	},	
		{  212,	    2,	   18,	    0,	   46	},	
		{  217,	    2,	   24,	    2,	   46	},	
		{  218,	    2,	   24,	   64,	   45	},	
		{  219,	    2,	   24,	    0,	   46	},	
		{  221,	    2,	   29,	   64,	   45	},	
		{  224,	    0,	   52,	    0,	    0	},	
		{  225,	    0,	    4,	   64,	   45	},	
		{  226,	    0,	    4,	    0,	   46	},	
		{  228,	    2,	   52,	    0,	    0	},	
		{  231,	    2,	   33,	    0,	    0	},	
		{  232,	    0,	   47,	    0,	    0	},	
		{  233,	    0,	   51,	    0,	    0	},	
		{  234,	    0,	    8,	    0,	   46	},	
		{  236,	    0,	   12,	    2,	   46	},	
		{  237,	    0,	   12,	   64,	   45	},	
		{  238,	    0,	   12,	    0,	   46	},	
		{  242,	    0,	   18,	    2,	   46	},	
		{  243,	    0,	   18,	   64,	   45	},	
		{  244,	    0,	   18,	    0,	   46	},	
		{  246,	    2,	   51,	    0,	    0	},	
		{  249,	    0,	   24,	    2,	   46	},	
		{  250,	    0,	   24,	   64,	   45	},	
		{  251,	    0,	   24,	    0,	   46	},	
		{  252,	    2,	   47,	    0,	    0	},	
		{  253,	    0,	   29,	   64,	   45	},	
		{ 8364,	   64,	    8,	    0,	    0	},	
	};	
	
	public static final int LUT[][] = {
			{	-1	,	0			,	0			,	0		,	0		,	0		}	,
			{	-1	,	0			,	0			,	0		,	0		,	0		}	,
			{	0	,	(int)'1'	,	0x002b		,	-1		,	0x00a6	,	-1		}	,
			{	0	,	(int)'2'	,	0x0022		,	-1		,	0x0040	,	-1		}	,
			{	0	,	(int)'3'	,	0x002a		,	-1		,	0x0023	,	-1		}	,
			{	0	,	(int)'4'	,	0x00e7		,	-1		,	0x00b0	,	-1		}	,
			{	0	,	(int)'5'	,	0x0025		,	-1		,	0x00a7	,	-1		}	,
			{	0	,	(int)'6'	,	0x0026		,	-1		,	0x00ac	,	-1		}	,
			{	0	,	(int)'7'	,	0x002f		,	-1		,	0x007c	,	-1		}	,
			{	0	,	(int)'8'	,	0x008		,	-1		,	0x00a2	,	-1		}	,
			{	0	,	(int)'9'	,	0x0029		,	-1		,	-1		,	-1		}	,
			{	0	,	(int)'0'	,	0x003d		,	-1		,	-1		,	-1		}	,
			{	0	,	0x0027		,	0x003f		,	-1		,	0x00b4	,	-1		}	,
			{	0	,	0x005e		,	0x0060		,	-1		,	0x007e	,	-1		}	,
			{	-1	,	0			,	0			,	0		,	0		,	0		}	,
			{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		
			{	1	,	(int)'q'	,	(int)'Q'	,	-1		,	-1		,	-1		}	,
			{	1	,	(int)'w'	,	(int)'W'	,	-1		,	-1		,	-1		}	,
			{	1	,	(int)'e'	,	(int)'E'	,	-1		,	0x20ac	,	-1		}	,
			{	1	,	(int)'r'	,	(int)'R'	,	-1		,	-1		,	-1		}	,
			{	1	,	(int)'t'	,	(int)'T'	,	-1		,	-1		,	-1		}	,
			{	1	,	(int)'z'	,	(int)'Z'	,	-1		,	-1		,	-1		}	,
			{	1	,	(int)'u'	,	(int)'U'	,	-1		,	-1		,	-1		}	,
			{	1	,	(int)'i'	,	(int)'I'	,	-1		,	-1		,	-1		}	,
			{	1	,	(int)'o'	,	(int)'O'	,	-1		,	-1		,	-1		}	,
			{	1	,	(int)'p'	,	(int)'P'	,	-1		,	-1		,	-1		}	,
			{	0	,	0x00e8		,	0x00fc		,	0x001b	,	0x005b	,	-1		}	,
			{	0	,	0x00a8		,	0x0021		,	0x001d	,	0x005d	,	-1		}	,
			{	-1	,	0			,	0			,	0		,	0		,	0		}	,
			{	-1	,	0			,	0			,	0		,	0		,	0		}	,
			{	1	,	(int)'a'	,	(int)'A'	,	-1		,	-1		,	-1		}	,
			{	1	,	(int)'s'	,	(int)'S'	,	-1		,	-1		,	-1		}	,
		
			{	1	,	(int)'d'	,	(int)'D'	,	-1		,	-1		,	-1		}	,
			{	1	,	(int)'f'	,	(int)'F'	,	-1		,	-1		,	-1		}	,
			{	1	,	(int)'g'	,	(int)'G'	,	-1		,	-1		,	-1		}	,
			{	1	,	(int)'h'	,	(int)'H'	,	-1		,	-1		,	-1		}	,
			{	1	,	(int)'j'	,	(int)'J'	,	-1		,	-1		,	-1		}	,
			{	1	,	(int)'k'	,	(int)'K'	,	-1		,	-1		,	-1		}	,
			{	1	,	(int)'l'	,	(int)'L'	,	-1		,	-1		,	-1		}	,
			{	0	,	0x00e9		,	0x00f6		,	-1		,	-1		,	-1		}	,
			{	0	,	0x00e0		,	0x00e4		,	-1		,	0x007b	,	-1		}	,
			{	0	,	0x00a7		,	0x00b0		,	-1		,	-1		,	-1		}	,
			{	-1	,	0			,	0			,	0		,	0		,	0		}	,
			{	0	,	0x0024		,	0x00a3		,	0x001c	,	0x007d	,	-1		}	,
			{	1	,	(int)'y'	,	(int)'Y'	,	-1		,	-1		,	-1		}	,
			{	1	,	(int)'x'	,	(int)'X'	,	-1		,	-1		,	-1		}	,
			{	1	,	(int)'c'	,	(int)'C'	,	-1		,	-1		,	-1		}	,
			{	1	,	(int)'v'	,	(int)'V'	,	-1		,	-1		,	-1		}	,
		
			{	1	,	(int)'b'	,	(int)'B'	,	-1		,	-1		,	-1		}	,
			{	1	,	(int)'n'	,	(int)'N'	,	-1		,	-1		,	-1		}	,
			{	1	,	(int)'m'	,	(int)'M'	,	-1		,	-1		,	-1		}	,
			{	0	,	0x002c		,	0x003b		,	-1		,	-1		,	-1		}	,
			{	0	,	0x002e		,	0x003a		,	-1		,	-1		,	-1		}	,
			{	0	,	0x002d		,	0x005f		,	-1		,	-1		,	-1		}	,
			{	-1	,	0			,	0			,	0		,	0		,	0		}	,
			{	-1	,	0			,	0			,	0		,	0		,	0		}	,
			{	-1	,	0			,	0			,	0		,	0		,	0		}	,
			{	0	,	0x0020		,	0x0020		,	0x0020	,	-1		,	-1		}	,	
			{	-1	,	0			,	0			,	0		,	0		,	0		}	,
			{	-1	,	0			,	0			,	0		,	0		,	0		}	,
			{	-1	,	0			,	0			,	0		,	0		,	0		}	,
			{	-1	,	0			,	0			,	0		,	0		,	0		}	,
			{	-1	,	0			,	0			,	0		,	0		,	0		}	,
			{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		
			{	-1	,	0			,	0			,	0		,	0		,	0		}	,
			{	-1	,	0			,	0			,	0		,	0		,	0		}	,
			{	-1	,	0			,	0			,	0		,	0		,	0		}	,
			{	-1	,	0			,	0			,	0		,	0		,	0		}	,
			{	-1	,	0			,	0			,	0		,	0		,	0		}	,
			{	-1	,	0			,	0			,	0		,	0		,	0		}	,
			{	-1	,	0			,	0			,	0		,	0		,	0		}	,
			{	-1	,	0			,	0			,	0		,	0		,	0		}	,	
			{	-1	,	0			,	0			,	0		,	0		,	0		}	,
			{	-1	,	0			,	0			,	0		,	0		,	0		}	,
			{	-1	,	0			,	0			,	0		,	0		,	0		}	,
			{	-1	,	0			,	0			,	0		,	0		,	0		}	,
			{	-1	,	0			,	0			,	0		,	0		,	0		}	,
			{	-1	,	0			,	0			,	0		,	0		,	0		}	,
			{	-1	,	0			,	0			,	0		,	0		,	0		}	,
			{	-1	,	0			,	0			,	0		,	0		,	0		}	,
		
			{	-1	,	0			,	0			,	0		,	0		,	0		}	,
			{	-1	,	0			,	0			,	0		,	0		,	0		}	,	
			{	-1	,	0			,	0			,	0		,	0		,	0		}	,
			{	0	,	0x002e		,	0x002e		,	-1		,	-1		,	-1		}	,
			{	-1	,	0			,	0			,	0		,	0		,	0		}	,
			{	-1	,	0			,	0			,	0		,	0		,	0		}	,
			{	0	,	0x003c		,	0x003e		,	0x001c	,	0x005c	,	-1		}	,		
			{	-1	,	0			,	0			,	0		,	0		,	0		}	,	
			{	-1	,	0			,	0			,	0		,	0		,	0		}	,
			{	-1	,	0			,	0			,	0		,	0		,	0		}	,
			{	-1	,	0			,	0			,	0		,	0		,	0		}	,
			{	-1	,	0			,	0			,	0		,	0		,	0		}	,
			{	-1	,	0			,	0			,	0		,	0		,	0		}	,
			{	-1	,	0			,	0			,	0		,	0		,	0		}	,
			{	-1	,	0			,	0			,	0		,	0		,	0		}	,
			{	-1	,	0			,	0			,	0		,	0		,	0		}	,		
		
	};
	
	public static final int DEADKEYS[] = {
		0x0060, 0x00b4, 0x005e
	};
	
	public static final int DEADKEY_LUT[][] = {
		{	0x00b4	,	0x0079	,	0x00fd	}	,
		{	0x00b4	,	0x0061	,	0x00e1	}	,
		{	0x00b4	,	0x0065	,	0x00e9	}	,
		{	0x00b4	,	0x0075	,	0x00fa	}	,
		{	0x00b4	,	0x0069	,	0x00ed	}	,
		{	0x00b4	,	0x006f	,	0x00f3	}	,
		{	0x00b4	,	0x0059	,	0x00dd	}	,
		{	0x00b4	,	0x0041	,	0x00c1	}	,
		{	0x00b4	,	0x0045	,	0x00c9	}	,
		{	0x00b4	,	0x0055	,	0x00da	}	,
		{	0x00b4	,	0x0049	,	0x00cd	}	,
		{	0x00b4	,	0x004f	,	0x00d3	}	,
		{	0x00b4	,	0x0020	,	0x00b4	}	,
		{	0x0060	,	0x0061	,	0x00e0	}	,
		{	0x0060	,	0x0065	,	0x00e8	}	,
		{	0x0060	,	0x0075	,	0x00f9	}	,
		{	0x0060	,	0x0069	,	0x00ec	}	,
		{	0x0060	,	0x006f	,	0x00f2	}	,
		{	0x0060	,	0x0041	,	0x00c0	}	,
		{	0x0060	,	0x0045	,	0x00c8	}	,
		{	0x0060	,	0x0055	,	0x00d9	}	,
		{	0x0060	,	0x0049	,	0x00cc	}	,
		{	0x0060	,	0x004f	,	0x00d2	}	,
		{	0x0060	,	0x0020	,	0x0060	}	,
		{	0x005e	,	0x0061	,	0x00e2	}	,
		{	0x005e	,	0x0065	,	0x00ea	}	,
		{	0x005e	,	0x0075	,	0x00fb	}	,
		{	0x005e	,	0x0069	,	0x00ee	}	,
		{	0x005e	,	0x006f	,	0x00f4	}	,
		{	0x005e	,	0x0041	,	0x00c2	}	,
		{	0x005e	,	0x0045	,	0x00ca	}	,
		{	0x005e	,	0x0055	,	0x00db	}	,
		{	0x005e	,	0x0049	,	0x00ce	}	,
		{	0x005e	,	0x004f	,	0x00d4	}	,
		{	0x005e	,	0x0020	,	0x005e	}	,
		
	};
	
	private static SwissFrenchLayout instance = new SwissFrenchLayout();
	
	private SwissFrenchLayout() {
	}
	
	public static SwissFrenchLayout getInstance() {
		return instance;
	}	
	
	@Override
	public int[][] getLUT() {
		return LUT;
	}

	@Override
	public int[][] getFastLUT() {
		return FAST_LUT;
	}

	@Override
	public void type(String text) {
		super.type(FAST_LUT, text, (byte)0);
	}	
	
	@Override
	public void type(String text, byte modifiers) {
		super.type(FAST_LUT, text, modifiers);
	}
	
	@Override
	public char getChar(int scanCode, boolean capsLock, boolean shift, boolean altGr) {
		return super.getChar(LUT, scanCode, capsLock, shift, altGr);
	}	
	
	@Override
	public String getLocaleName() {		
		return LOCALE_NAME;
	}		
	
	@Override
	public int[][] getDeadkeyLUT() {		
		return DEADKEY_LUT;
	}

	@Override
	public int[] getDeadkeys() {
		return DEADKEYS;
	}

}
