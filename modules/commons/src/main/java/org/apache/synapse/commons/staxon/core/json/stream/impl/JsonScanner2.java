/**
 * Copyright (c) 2005-2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 * <p/>
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.synapse.commons.staxon.core.json.stream.impl;

import java.util.Stack;

/**
 * This class is a scanner generated by
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 10/23/13 10:52 AM from the specification file
 * <tt>/home/ishan/wso2/src/pub/platform/branches/4.2.0/dependencies/staxon/1.2.0-wso2v1/core/src/main/jflex/Yylex.flex</tt>
 */
public final class JsonScanner2 implements JsonStreamSourceImpl.Scanner {

    /**
     * This character denotes the end of file
     */
    private static final int YYEOF = -1;

    /**
     * initial size of the lookahead buffer
     */
    private static final int ZZ_BUFFERSIZE = 16384;

    /**
     * lexical states
     */
    private static final int STRING = 2;
    private static final int YYINITIAL = 0;

    /**
     * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
     * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
     * at the beginning of a line
     * l is of the form l = 2*k, k a non negative integer
     */
    private static final int ZZ_LEXSTATE[] = {
            0, 0, 1, 1
    };

    /**
     * Translates characters to character classes
     */
    private static final String ZZ_CMAP_PACKED =
            "\10\0\2\1\1\35\2\0\1\32\22\0\1\1\1\0\1\31\10\0" +
                    "\1\7\1\13\1\2\1\5\1\33\1\3\11\4\1\14\6\0\4\12" +
                    "\1\6\1\12\24\0\1\15\1\10\1\16\3\0\1\27\1\34\2\12" +
                    "\1\25\1\26\5\0\1\22\1\0\1\21\3\0\1\24\1\30\1\23" +
                    "\1\11\5\0\1\17\1\0\1\20\uff82\0";

    /**
     * Translates characters to character classes
     */
    private static final char[] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

    /**
     * Translates DFA states to action switch labels.
     */
    private static final int[] ZZ_ACTION = zzUnpackAction();

    private static final String ZZ_ACTION_PACKED_0 =
            "\2\0\1\1\1\2\1\1\2\3\1\4\1\5\1\6" +
                    "\1\7\1\10\1\11\3\1\1\12\1\13\1\1\1\14" +
                    "\5\0\1\15\1\0\1\16\1\17\1\20\1\21\1\22" +
                    "\1\23\1\24\1\3\1\0\1\3\4\0\1\25\1\26" +
                    "\2\0\1\27\1\0\1\30";

    private static int[] zzUnpackAction() {
        int[] result = new int[48];
        int offset = 0;
        offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
        return result;
    }

    private static int zzUnpackAction(String packed, int offset, int[] result) {
        int i = 0;       /* index in packed string  */
        int j = offset;  /* index in unpacked array */
        int l = packed.length();
        while (i < l) {
            int count = packed.charAt(i++);
            int value = packed.charAt(i++);
            do {
                result[j++] = value;
            } while (--count > 0);
        }
        return j;
    }


    /**
     * Translates a state to a row index in the transition table
     */
    private static final int[] ZZ_ROWMAP = zzUnpackRowMap();

    private static final String ZZ_ROWMAP_PACKED_0 =
            "\0\0\0\36\0\74\0\74\0\132\0\170\0\226\0\74" +
                    "\0\74\0\74\0\74\0\74\0\74\0\264\0\322\0\360" +
                    "\0\74\0\u010e\0\u012c\0\74\0\u014a\0\u0168\0\u0186\0\u01a4" +
                    "\0\u01c2\0\74\0\u01e0\0\74\0\74\0\74\0\74\0\74" +
                    "\0\74\0\74\0\u01fe\0\u021c\0\u021c\0\u023a\0\u0258\0\u0276" +
                    "\0\u0294\0\74\0\74\0\u02b2\0\u02d0\0\74\0\u02ee\0\74";

    private static int[] zzUnpackRowMap() {
        int[] result = new int[48];
        int offset = 0;
        offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
        return result;
    }

    private static int zzUnpackRowMap(String packed, int offset, int[] result) {
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
    private static final int[] ZZ_TRANS = zzUnpackTrans();

    private static final String ZZ_TRANS_PACKED_0 =
            "\1\3\1\4\1\5\1\6\1\7\6\3\1\10\1\11" +
                    "\1\12\1\13\1\14\1\15\1\16\1\3\1\17\2\3" +
                    "\1\20\2\3\1\21\1\4\2\3\1\4\10\22\1\23" +
                    "\20\22\1\24\1\3\2\22\42\0\1\6\1\7\36\0" +
                    "\1\25\1\26\16\0\1\26\13\0\2\7\1\25\1\26" +
                    "\16\0\1\26\21\0\1\27\50\0\1\30\40\0\1\31" +
                    "\6\0\10\22\1\0\20\22\2\0\2\22\11\0\1\32" +
                    "\1\33\7\0\1\34\1\0\1\35\1\36\1\0\1\37" +
                    "\2\0\1\40\1\0\1\41\1\42\4\0\2\43\33\0" +
                    "\1\44\2\45\2\0\1\44\50\0\1\46\24\0\1\47" +
                    "\46\0\1\50\16\0\2\51\1\0\1\51\3\0\1\51" +
                    "\12\0\3\51\4\0\1\51\4\0\2\43\1\0\1\26" +
                    "\16\0\1\26\13\0\2\45\53\0\1\52\40\0\1\53" +
                    "\40\0\1\54\10\0\2\55\1\0\1\55\3\0\1\55" +
                    "\12\0\3\55\4\0\1\55\26\0\1\56\13\0\2\57" +
                    "\1\0\1\57\3\0\1\57\12\0\3\57\4\0\1\57" +
                    "\4\0\2\60\1\0\1\60\3\0\1\60\12\0\3\60" +
                    "\4\0\1\60\1\0";

    private static int[] zzUnpackTrans() {
        int[] result = new int[780];
        int offset = 0;
        offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
        return result;
    }

    private static int zzUnpackTrans(String packed, int offset, int[] result) {
        int i = 0;       /* index in packed string  */
        int j = offset;  /* index in unpacked array */
        int l = packed.length();
        while (i < l) {
            int count = packed.charAt(i++);
            int value = packed.charAt(i++);
            value--;
            do {
                result[j++] = value;
            } while (--count > 0);
        }
        return j;
    }


    /* error codes */
    private static final int ZZ_UNKNOWN_ERROR = 0;
    private static final int ZZ_NO_MATCH = 1;
    private static final int ZZ_PUSHBACK_2BIG = 2;

    /* error messages for the codes above */
    private static final String ZZ_ERROR_MSG[] = {
            "Unkown internal scanner error",
            "Error: could not match input",
            "Error: pushback value was too large"
    };

    /**
     * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
     */
    private static final int[] ZZ_ATTRIBUTE = zzUnpackAttribute();

    private static final String ZZ_ATTRIBUTE_PACKED_0 =
            "\2\0\2\11\3\1\6\11\3\1\1\11\2\1\1\11" +
                    "\5\0\1\11\1\0\7\11\1\1\1\0\1\1\4\0" +
                    "\2\11\2\0\1\11\1\0\1\11";

    private static int[] zzUnpackAttribute() {
        int[] result = new int[48];
        int offset = 0;
        offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
        return result;
    }

    private static int zzUnpackAttribute(String packed, int offset, int[] result) {
        int i = 0;       /* index in packed string  */
        int j = offset;  /* index in unpacked array */
        int l = packed.length();
        while (i < l) {
            int count = packed.charAt(i++);
            int value = packed.charAt(i++);
            do {
                result[j++] = value;
            } while (--count > 0);
        }
        return j;
    }

    /**
     * the input device
     */
    private java.io.Reader zzReader;

    /**
     * the current state of the DFA
     */
    private int zzState;

    /**
     * the current lexical state
     */
    private int zzLexicalState = YYINITIAL;

    /**
     * this buffer contains the current text to be matched and is
     * the source of the yytext() string
     */
    private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

    /**
     * the textposition at the last accepting state
     */
    private int zzMarkedPos;

    /**
     * the current text position in the buffer
     */
    private int zzCurrentPos;

    /**
     * startRead marks the beginning of the yytext() string in the buffer
     */
    private int zzStartRead;

    /**
     * endRead marks the last character in the buffer, that has been read
     * from input
     */
    private int zzEndRead;

    /**
     * number of newlines encountered up to the start of the matched text
     */
    private int yyline;

    /**
     * the number of characters up to the start of the matched text
     */
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

    /**
     * zzAtEOF == true <=> the scanner is at the EOF
     */
    private boolean zzAtEOF;

    /**
     * denotes if the user-EOF-code has already been executed
     */
    private boolean zzEOFDone;

    /* user code: */
    private StringBuilder builder = new StringBuilder();
    private String text = null;

    public String getText() {
        return text;
    }

    public Symbol nextSymbol() throws java.io.IOException {
        return yylex();
    }

    public void close() throws java.io.IOException {
        yyclose();
    }

    public int getCharOffset() {
        return yychar;
    }

    public int getLineNumber() {
        return yyline;
    }

    public int getColumnNumber() {
        return yycolumn;
    }


    /**
     * Creates a new scanner
     * There is also a java.io.InputStream version of this constructor.
     *
     * @param in the java.io.Reader to read input from.
     */
    public JsonScanner2(java.io.Reader in) {
        this.zzReader = in;
    }

    /**
     * Creates a new scanner.
     * There is also java.io.Reader version of this constructor.
     *
     * @param in the java.io.Inputstream to read input from.
     */
    public JsonScanner2(java.io.InputStream in) {
        this(new java.io.InputStreamReader(in));
    }

    /**
     * Unpacks the compressed character translation table.
     *
     * @param packed the packed character translation table
     * @return the unpacked character translation table
     */
    private static char[] zzUnpackCMap(String packed) {
        char[] map = new char[0x10000];
        int i = 0;  /* index in packed string  */
        int j = 0;  /* index in unpacked array */
        while (i < 92) {
            int count = packed.charAt(i++);
            char value = packed.charAt(i++);
            do {
                map[j++] = value;
            } while (--count > 0);
        }
        return map;
    }


    /**
     * Refills the input buffer.
     *
     * @return <code>false</code>, iff there was new input.
     * @throws java.io.IOException if any I/O-Error occurs
     */
    private boolean zzRefill() throws java.io.IOException {

        /* first: make room (if you can) */
        if (zzStartRead > 0) {
            System.arraycopy(zzBuffer, zzStartRead,
                    zzBuffer, 0,
                    zzEndRead - zzStartRead);

            /* translate stored positions */
            zzEndRead -= zzStartRead;
            zzCurrentPos -= zzStartRead;
            zzMarkedPos -= zzStartRead;
            zzStartRead = 0;
        }

        /* is the buffer big enough? */
        if (zzCurrentPos >= zzBuffer.length) {
            /* if not: blow it up */
            char newBuffer[] = new char[zzCurrentPos * 2];
            System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
            zzBuffer = newBuffer;
        }

        /* finally: fill the buffer with new input */
        int numRead = zzReader.read(zzBuffer, zzEndRead,
                zzBuffer.length - zzEndRead);

        if (numRead > 0) {
            zzEndRead += numRead;
            return false;
        }
        // unlikely but not impossible: read 0 characters, but not at end of stream
        if (numRead == 0) {
            int c = zzReader.read();
            if (c == -1) {
                return true;
            } else {
                zzBuffer[zzEndRead++] = (char) c;
                return false;
            }
        }

        // numRead < 0
        return true;
    }


    /**
     * Closes the input stream.
     */
    private final void yyclose() throws java.io.IOException {
        zzAtEOF = true;            /* indicate end of file */
        zzEndRead = zzStartRead;  /* invalidate buffer    */

        if (zzReader != null) {
            zzReader.close();
        }
    }


    /**
     * Resets the scanner to read from a new input stream.
     * Does not close the old reader.
     * <p/>
     * All internal variables are reset, the old input stream
     * <b>cannot</b> be reused (internal buffer is discarded and lost).
     * Lexical state is set to <tt>ZZ_INITIAL</tt>.
     *
     * @param reader the new input stream
     */
    private final void yyreset(java.io.Reader reader) {
        zzReader = reader;
        zzAtBOL = true;
        zzAtEOF = false;
        zzEOFDone = false;
        zzEndRead = zzStartRead = 0;
        zzCurrentPos = zzMarkedPos = 0;
        yyline = yychar = yycolumn = 0;
        zzLexicalState = YYINITIAL;
    }


    /**
     * Returns the current lexical state.
     */
    private final int yystate() {
        return zzLexicalState;
    }


    /**
     * Enters a new lexical state
     *
     * @param newState the new lexical state
     */
    private final void yybegin(int newState) {
        zzLexicalState = newState;
    }


    /**
     * Returns the text matched by the current regular expression.
     */
    private final String yytext() {
        return new String(zzBuffer, zzStartRead, zzMarkedPos - zzStartRead);
    }


    /**
     * Returns the character at position <tt>pos</tt> from the
     * matched text.
     * <p/>
     * It is equivalent to yytext().charAt(pos), but faster
     *
     * @param pos the position of the character to fetch.
     *            A value from 0 to yylength()-1.
     * @return the character at position pos
     */
    private final char yycharat(int pos) {
        return zzBuffer[zzStartRead + pos];
    }


    /**
     * Returns the length of the matched text region.
     */
    private final int yylength() {
        return zzMarkedPos - zzStartRead;
    }


    /**
     * Reports an error that occured while scanning.
     * <p/>
     * In a wellformed scanner (no or only correct usage of
     * yypushback(int) and a match-all fallback rule) this method
     * will only be called with things that "Can't Possibly Happen".
     * If this method is called, something is seriously wrong
     * (e.g. a JFlex bug producing a faulty scanner etc.).
     * <p/>
     * Usual syntax/scanner level error handling should be done
     * in error fallback rules.
     *
     * @param errorCode the code of the errormessage to display
     */
    private void zzScanError(int errorCode) {
        String message;
        try {
            message = ZZ_ERROR_MSG[errorCode];
        } catch (ArrayIndexOutOfBoundsException e) {
            message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
        }

        throw new Error(message);
    }


    /**
     * Pushes the specified amount of characters back into the input stream.
     * <p/>
     * They will be read again by then next call of the scanning method
     *
     * @param number the number of characters to be read again.
     *               This number must not be greater than yylength()!
     */
    private void yypushback(int number) {
        if (number > yylength()) {
            zzScanError(ZZ_PUSHBACK_2BIG);
        }

        zzMarkedPos -= number;
    }


    private Symbol lastSymbol = null;
    private Stack<Boolean> arrays = new Stack<Boolean>();

    /**
     * Resumes scanning until the next regular expression is matched,
     * the end of input is encountered or an I/O-Error occurs.
     *
     * @return the next token
     * @throws java.io.IOException if any I/O-Error occurs
     */
    private Symbol yylex() throws java.io.IOException {
        if (lastSymbol == Symbol.SO_ARRAY) {
            lastSymbol = Symbol.SO_COLON_1;
            text = Constants.ARRAY;
            return Symbol.STRING;
        } else if (lastSymbol == Symbol.SO_COLON_1) {
            lastSymbol = Symbol.SO_ELEMENT;
            text = null;
            return Symbol.COLON;
        } else if (lastSymbol == Symbol.SO_ELEMENT) {
            lastSymbol = Symbol.SO_COLON_2;
            text = null;
            return Symbol.START_OBJECT;
        } else if (lastSymbol == Symbol.SO_COLON_2) {
            lastSymbol = Symbol.SO_END;
            text = Constants.ARRAY_ELEM;
            return Symbol.STRING;
        } else if (lastSymbol == Symbol.SO_END) {
            lastSymbol = Symbol.SO_END_2;
            text = null;
            return Symbol.COLON;
        } else if (lastSymbol == Symbol.SO_END_2) {
            lastSymbol = Symbol.START_ARRAY;
            text = null;
            return Symbol.START_ARRAY;
        } else if (lastSymbol == Symbol.SO_ARRAY_END) {
            lastSymbol = Symbol.SO_ARRAY_END_2;
            text = null;
            return Symbol.END_OBJECT;
        } else if (lastSymbol == Symbol.SO_ARRAY_END_2) {
            text = null;
            lastSymbol = Symbol.END_ARRAY;
            return Symbol.END_OBJECT;
        }
        int zzInput;
        int zzAction;

        // cached fields:
        int zzCurrentPosL;
        int zzMarkedPosL;
        int zzEndReadL = zzEndRead;
        char[] zzBufferL = zzBuffer;
        char[] zzCMapL = ZZ_CMAP;

        int[] zzTransL = ZZ_TRANS;

        int[] zzRowMapL = ZZ_ROWMAP;
        int[] zzAttrL = ZZ_ATTRIBUTE;

        while (true) {
            zzMarkedPosL = zzMarkedPos;

            yychar += zzMarkedPosL - zzStartRead;

            boolean zzR = false;
            for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                 zzCurrentPosL++) {
                switch (zzBufferL[zzCurrentPosL]) {
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
                        if (zzR) {
                            zzR = false;
                        } else {
                            yyline++;
                            yycolumn = 0;
                        }
                        break;
                    default:
                        zzR = false;
                        yycolumn++;
                }
            }

            if (zzR) {
                // peek one character ahead if it is \n (if we have counted one line too much)
                boolean zzPeek;
                if (zzMarkedPosL < zzEndReadL) {
                    zzPeek = zzBufferL[zzMarkedPosL] == '\n';
                } else if (zzAtEOF) {
                    zzPeek = false;
                } else {
                    boolean eof = zzRefill();
                    zzEndReadL = zzEndRead;
                    zzMarkedPosL = zzMarkedPos;
                    zzBufferL = zzBuffer;
                    if (eof) {
                        zzPeek = false;
                    } else {
                        zzPeek = zzBufferL[zzMarkedPosL] == '\n';
                    }
                }
                if (zzPeek) {
                    yyline--;
                }
            }
            zzAction = -1;

            zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

            zzState = ZZ_LEXSTATE[zzLexicalState];


            zzForAction:
            {
                while (true) {

                    if (zzCurrentPosL < zzEndReadL) {
                        zzInput = zzBufferL[zzCurrentPosL++];
                    } else if (zzAtEOF) {
                        zzInput = YYEOF;
                        break zzForAction;
                    } else {
                        // store back cached positions
                        zzCurrentPos = zzCurrentPosL;
                        zzMarkedPos = zzMarkedPosL;
                        boolean eof = zzRefill();
                        // get translated positions and possibly new buffer
                        zzCurrentPosL = zzCurrentPos;
                        zzMarkedPosL = zzMarkedPos;
                        zzBufferL = zzBuffer;
                        zzEndReadL = zzEndRead;
                        if (eof) {
                            zzInput = YYEOF;
                            break zzForAction;
                        } else {
                            zzInput = zzBufferL[zzCurrentPosL++];
                        }
                    }
                    int zzNext = zzTransL[zzRowMapL[zzState] + zzCMapL[zzInput]];
                    if (zzNext == -1) {
                        break zzForAction;
                    }
                    zzState = zzNext;

                    int zzAttributes = zzAttrL[zzState];
                    if ((zzAttributes & 1) == 1) {
                        zzAction = zzState;
                        zzMarkedPosL = zzCurrentPosL;
                        if ((zzAttributes & 8) == 8) {
                            break zzForAction;
                        }
                    }

                }
            }

            // store back cached position
            zzMarkedPos = zzMarkedPosL;

            switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
                case 22: {
                    text = "true";
                    lastSymbol = Symbol.TRUE;
                    return Symbol.TRUE;
                }
                case 25:
                    break;
                case 7: {
                    text = null;
                    //System.out.println(lastSymbol + "   =>   " + Symbol.END_ARRAY);
                    boolean isAnonymousArray = arrays.pop();
                    if (isAnonymousArray) {
                        lastSymbol = Symbol.SO_ARRAY_END;
                        return Symbol.END_ARRAY;
                    }
                    lastSymbol = Symbol.END_ARRAY;
                    return Symbol.END_ARRAY;
                }
                case 26:
                    break;
                case 1: {
                    lastSymbol = null;
                    throw new java.io.IOException("Illegal character: <" + yytext() + ">");
                }
                case 27:
                    break;
                case 16: {
                    builder.append('\r');
                }
                case 28:
                    break;
                case 24: {
                    builder.append(Character.toChars(Integer.parseInt(yytext().substring(2), 16)));
                }
                case 29:
                    break;
                case 23: {
                    text = "false";
                    //System.out.println(lastSymbol + "   =>   " + Symbol.FALSE);
                    lastSymbol = Symbol.FALSE;
                    return Symbol.FALSE;
                }
                case 30:
                    break;
                case 18: {
                    builder.append('\"');
                }
                case 31:
                    break;
                case 12: {
                    text = builder.toString();
                    yybegin(YYINITIAL);
                    //System.out.println(lastSymbol + "   =>   " + Symbol.STRING);
                    lastSymbol = Symbol.STRING;
                    return Symbol.STRING;
                }
                case 32:
                    break;
                case 10: {
                    builder.setLength(0);
                    yybegin(STRING);
                }
                case 33:
                    break;
                case 21: {
                    text = "null";
                    //System.out.println(lastSymbol + "   =>   " + Symbol.NULL);
                    lastSymbol = Symbol.NULL;
                    return Symbol.NULL;
                }
                case 34:
                    break;
                case 19: {
                    builder.append('/');
                }
                case 35:
                    break;
                case 17: {
                    builder.append('\f');
                }
                case 36:
                    break;
                case 6: {
                    text = null;
                    //System.out.println(lastSymbol + "   =>   " + Symbol.START_ARRAY);
                    // TODO: leaving the null check otherwise it will introduce test failures.
                    // if (lastSymbol == Symbol.START_ARRAY || lastSymbol == Symbol.COMMA || lastSymbol == null) {
                    if (lastSymbol == Symbol.START_ARRAY || lastSymbol == Symbol.COMMA) {
                        arrays.push(true);
                        lastSymbol = Symbol.SO_ARRAY;
                        text = null;
                        return Symbol.START_OBJECT;
                    }
                    lastSymbol = Symbol.START_ARRAY;
                    arrays.push(false);
                    return Symbol.START_ARRAY;
                }
                case 37:
                    break;
                case 15: {
                    builder.append('\t');
                }
                case 38:
                    break;
                case 8: {
                    text = null;
                    //System.out.println(lastSymbol + "    =>   " + Symbol.START_OBJECT);
                    lastSymbol = Symbol.START_OBJECT;
                    return Symbol.START_OBJECT;
                }
                case 39:
                    break;
                case 9: {
                    text = null;
                    //System.out.println(lastSymbol + "   =>   " + Symbol.END_OBJECT);
                    lastSymbol = Symbol.END_OBJECT;
                    return Symbol.END_OBJECT;
                }
                case 40:
                    break;
                case 4: {
                    text = null;
                    //System.out.println(lastSymbol + "   =>   " + Symbol.COMMA);
                    lastSymbol = Symbol.COMMA;
                    return Symbol.COMMA;
                }
                case 41:
                    break;
                case 14: {
                    builder.append('\n');
                }
                case 42:
                    break;
                case 11: {
                    builder.append(yytext());
                }
                case 43:
                    break;
                case 3: {
                    text = yytext();
                    //System.out.println(lastSymbol + "   =>   " + Symbol.NUMBER);
                    lastSymbol = Symbol.NUMBER;
                    return Symbol.NUMBER;
                }
                case 44:
                    break;
                case 20: {
                    builder.append('\b');
                }
                case 45:
                    break;
                case 5: {
                    text = null;
                    //System.out.println(lastSymbol + "   =>   " + Symbol.COLON);
                    lastSymbol = Symbol.COLON;
                    return Symbol.COLON;
                }
                case 46:
                    break;
                case 13: {
                    builder.append('\\');
                }
                case 47:
                    break;
                case 2: { /* ignore whitespace */
                }
                case 48:
                    break;
                default:
                    if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
                        zzAtEOF = true;
                        {
                            text = null;
                            //System.out.println(lastSymbol + "   =>   " + Symbol.EOF);
                            lastSymbol = Symbol.EOF;
                            return Symbol.EOF;
                        }
                    } else {
                        zzScanError(ZZ_NO_MATCH);
                    }
            }
        }
    }
}

