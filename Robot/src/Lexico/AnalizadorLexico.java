/* The following code was generated by JFlex 1.6.1 */

package Lexico;
import java_cup.runtime.*;
import java.util.LinkedList;
import Config.TError;
import Sintactico.Simbolos;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>/home/gballesteros/Documentos/Developer/Compiladores/Robot-0_1/src/Config/Lexico.jflex</tt>
 */
public class AnalizadorLexico implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0, 25, 25, 26, 25, 25,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
    25,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
    18, 18, 18, 18, 18, 18, 18, 18, 18, 18,  0,  6,  0,  0,  0,  0, 
     0, 15, 23,  3, 22,  9,  5,  0, 14,  1, 24,  0, 17,  7,  2,  4, 
    13, 20, 10, 11, 12, 21,  8,  0,  0, 16, 19,  0,  0,  0,  0,  0, 
     0, 15, 23,  3, 22,  9,  5,  0, 14,  1, 24,  0, 17,  7,  2,  4, 
    13, 20, 10, 11, 12, 21,  8,  0,  0, 16, 19,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0, 26,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\5\1\1\2\10\1\1\3\1\1\1\4\2\0"+
    "\1\5\7\0\1\6\10\0\1\7\5\0\1\10\22\0"+
    "\1\11\1\12\1\0\1\13\3\0\1\14\2\0\1\15"+
    "\3\0\1\16\1\17\1\20\2\0\1\21\1\0\1\22"+
    "\1\0\1\23\1\24";

  private static int [] zzUnpackAction() {
    int [] result = new int[87];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\33\0\66\0\121\0\154\0\207\0\33\0\242"+
    "\0\275\0\330\0\363\0\u010e\0\u0129\0\u0144\0\u015f\0\u017a"+
    "\0\u0195\0\33\0\u01b0\0\u01cb\0\33\0\u01e6\0\u0201\0\u021c"+
    "\0\u0237\0\u0252\0\u026d\0\u0288\0\33\0\u02a3\0\u02be\0\u02d9"+
    "\0\u02f4\0\u030f\0\u032a\0\u0345\0\u0360\0\33\0\u037b\0\u0396"+
    "\0\u03b1\0\u03cc\0\u03e7\0\33\0\u0402\0\u041d\0\u0438\0\u0453"+
    "\0\u046e\0\u0489\0\u04a4\0\u04bf\0\u04da\0\u04f5\0\u0510\0\u052b"+
    "\0\u0546\0\u0561\0\u057c\0\u0597\0\u05b2\0\u05cd\0\33\0\33"+
    "\0\u05e8\0\33\0\u0603\0\u061e\0\u0639\0\33\0\u0654\0\u066f"+
    "\0\33\0\u068a\0\u06a5\0\u06c0\0\33\0\33\0\33\0\u06db"+
    "\0\u06f6\0\33\0\u0711\0\33\0\u072c\0\33\0\33";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[87];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\2\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\2\2\1\15\1\16\1\2"+
    "\1\17\1\20\3\2\1\21\2\2\1\22\36\0\1\23"+
    "\20\0\1\24\13\0\1\25\32\0\1\26\27\0\1\27"+
    "\35\0\1\30\12\0\1\31\24\0\1\32\23\0\1\33"+
    "\41\0\1\34\22\0\1\35\50\0\1\36\25\0\1\37"+
    "\14\0\1\40\4\0\1\41\53\0\1\20\21\0\1\42"+
    "\22\0\1\43\55\0\1\44\15\0\1\45\25\0\1\46"+
    "\40\0\1\47\24\0\1\50\33\0\1\51\43\0\1\52"+
    "\33\0\1\53\35\0\1\54\24\0\1\55\37\0\1\56"+
    "\22\0\1\57\35\0\1\60\23\0\1\61\54\0\1\62"+
    "\16\0\1\63\32\0\1\64\44\0\1\65\20\0\1\66"+
    "\25\0\1\67\27\0\1\70\32\0\1\71\61\0\1\72"+
    "\3\0\1\73\42\0\1\74\22\0\1\75\32\0\1\76"+
    "\43\0\1\77\32\0\1\100\37\0\1\101\26\0\1\102"+
    "\21\0\1\103\44\0\1\104\45\0\1\105\7\0\1\106"+
    "\42\0\1\107\21\0\1\110\33\0\1\111\37\0\1\112"+
    "\23\0\1\113\33\0\1\114\40\0\1\115\40\0\1\116"+
    "\24\0\1\117\37\0\1\120\26\0\1\121\37\0\1\122"+
    "\24\0\1\123\40\0\1\124\41\0\1\125\17\0\1\126"+
    "\36\0\1\127\13\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1863];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\4\1\1\11\12\1\1\11\2\0\1\11"+
    "\7\0\1\11\10\0\1\11\5\0\1\11\22\0\2\11"+
    "\1\0\1\11\3\0\1\11\2\0\1\11\3\0\3\11"+
    "\2\0\1\11\1\0\1\11\1\0\2\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[87];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */

    public static LinkedList<TError> TablaEL = new LinkedList<TError>();

    public int linea(){
        return yyline;
    }
    public int columna(){
        return yycolumn;
    }



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public AnalizadorLexico(java.io.Reader in) {
    this.zzReader = in;
  }



  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(Simbolos.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { /*  Error  */ System.out.println("Error en linea:" + linea()); 
        TError datos = new TError(yytext(),linea(),columna(),"Error Lexico","Simbolo no existe en el lenguaje");
        TablaEL.add(datos);
            }
          case 21: break;
          case 2: 
            { System.out.print("In : PyC\n"); 
        return new Symbol(Simbolos.PyC, columna(), linea(), yytext());
            }
          case 22: break;
          case 3: 
            { System.out.print("In : Cantidad " + yytext() + "\t"); 
        return new Symbol(Simbolos.Num, columna(), linea(), Integer.parseInt(yytext()));
            }
          case 23: break;
          case 4: 
            { /*  Ignoramos  */
            }
          case 24: break;
          case 5: 
            { System.out.print("In : No_Hay\t"); 
        return new Symbol(Simbolos.No_Hay, columna(), linea(), yytext());
            }
          case 25: break;
          case 6: 
            { System.out.print("In : Si\t"); 
        return new Symbol(Simbolos.If, columna(), linea(), yytext());
            }
          case 26: break;
          case 7: 
            { System.out.print("In : Fin\t"); 
        return new Symbol(Simbolos.Fin, columna(), linea(), yytext());
            }
          case 27: break;
          case 8: 
            { System.out.print("In : Si_Hay\t"); 
        return new Symbol(Simbolos.Hay, columna(), linea(), yytext());
            }
          case 28: break;
          case 9: 
            { System.out.print("In : Comer\t"); 
        return new Symbol(Simbolos.Comer, columna(), linea(), yytext());
            }
          case 29: break;
          case 10: 
            { System.out.print("In : Mover\t"); 
        return new Symbol(Simbolos.Mover, columna(), linea(), yytext());
            }
          case 30: break;
          case 11: 
            { System.out.print("In : Veces\t"); 
        return new Symbol(Simbolos.Veces , columna(), linea(), yytext());
            }
          case 31: break;
          case 12: 
            { System.out.print("In : Abajo\t"); 
        return new Symbol(Simbolos.Aba, columna(), linea(), "ABA");
            }
          case 32: break;
          case 13: 
            { System.out.print("In : Inicio \t"); 
        return new Symbol(Simbolos.Inicio, columna(), linea(), yytext());
            }
          case 33: break;
          case 14: 
            { System.out.print("In : Repetir\t"); 
        return new Symbol(Simbolos.Repite, columna(), linea(), yytext());
            }
          case 34: break;
          case 15: 
            { System.out.print("In : Arriba\t"); 
        return new Symbol(Simbolos.Arr, columna(), linea(), "ARR");
            }
          case 35: break;
          case 16: 
            { System.out.print("In : Limite\t"); 
        return new Symbol(Simbolos.Limite, columna(), linea(), yytext());
            }
          case 36: break;
          case 17: 
            { System.out.print("In : Manzana\t"); 
        return new Symbol(Simbolos.Manzana, columna(), linea(), yytext());
            }
          case 37: break;
          case 18: 
            { System.out.print("In : Derecha\t"); 
        return new Symbol(Simbolos.Der, columna(), linea(), "DER");
            }
          case 38: break;
          case 19: 
            { System.out.print("In : Entonces\t"); 
        return new Symbol(Simbolos.Entonces, columna(), linea(), yytext());
            }
          case 39: break;
          case 20: 
            { System.out.print("In : Izquierda\t"); 
        return new Symbol(Simbolos.Izq, columna(), linea(), "IZQ");
            }
          case 40: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}