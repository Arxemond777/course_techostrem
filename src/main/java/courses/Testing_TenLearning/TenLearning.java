package courses.Testing_TenLearning;

public class TenLearning
{
    private static final int HI_BYTE_MASK = 0xf0, LOW_BYTE_MASK = 0x0f;

    private static final char[] HEX_SYMBOLS = {
      '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
      'a', 'b', 'c', 'd', 'e', 'f'
    };

    public static void main(String[] args) {
        String result = toHexString(new byte[] {1, 2, 3});
        System.out.println(result);
    }

    public static boolean a() {
        return false;
    }

    public final boolean isEmpty(final CharSequence sequence) {
        return sequence == null || sequence.length() <= 0;
    }

    public static String toHexString(final  byte[] data) {
        if (data == null)
            throw new IllegalArgumentException("Must be not-null");

        final StringBuffer builder = new StringBuffer(2 * data.length);

        for (byte item : data){
            builder.append(HEX_SYMBOLS[(HI_BYTE_MASK & item) >>> 4]);
            builder.append(HEX_SYMBOLS[(LOW_BYTE_MASK & item)]);
        }
        return builder.toString();
    }
}


