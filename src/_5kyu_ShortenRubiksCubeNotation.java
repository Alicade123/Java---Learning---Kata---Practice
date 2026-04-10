
public class _5kyu_ShortenRubiksCubeNotation {
    public static void main(String[] args) {
        System.out.println(shortenedNotation("F F' U' R R' D D' D"));// "U' D");
//        System.out.println(shortenedNotation("F2 R' L' B' F' F2 F'"));// "F2 R' L' B'");
//        System.out.println(shortenedNotation("R U2 F' D R' B' R' D2 B' U2 L R2 D' F2 R' B U' B2 F L2 F' L R2 D2 L' D F2 R' F2 D2 L' D' B' U R2 U'"));
//                                             "R U2 F' D R' B' R' D2 B' U2 L R2 D' F2 R' B U' B2 F L2 F' L R2 D2 L' D F2 R' F2 D2 L' D' B' U R2 U'");

//        System.out.println(shortenedNotation("L' B F R2 U2 B' D L D2 B'"));// "L' B F R2 U2 B' D L D2 B'");
//        System.out.println(shortenedNotation("B R2 L2 U L2 R2 U' L2 B R"));// "B R2 L2 U L2 R2 U' L2 B R");
//        System.out.println(shortenedNotation("D2 B L U' L' B' D B' U' D2 B2 U' D' F2 B D'"));
//                                             "D2 B L U' L' B' D B' U' D2 B2 U' D' F2 B D'");
//        System.out.println(shortenedNotation("D2 F' L F2 B2 U R F2 R' U2 D L2 F' D' F' U2 D2 B U"));
//                                             "D2 F' L F2 B2 U R F2 R' U2 D L2 F' D' F' U2 D2 B U");

//        System.out.println(shortenedNotation("D U L2 B F' R' B U2 R2 F D U2 R F' U2 R L2 B2 R U2 R2 D' F D R2 B L2 B' U R2 B D2 R2 U2 D2 L B L' B' F'"));
//                                             "D U L2 B F' R' B U2 R2 F D U2 R F' U2 R L2 B2 R U2 R2 D' F D R2 B L2 B' U R2 B D2 R2 U2 D2 L B L' B' F'");
//        System.out.println(shortenedNotation("D B F' U2 L' F R2 D2 L D' U L' U B' R' B2 L2 U' B U R D2 R2 D L' U' R L2 B' L R' D2 R' D B2 U R' F D2 L F' L2 F R2 U' B' R2"));
//                                             "D B F' U2 L' F R2 D2 L D' U L' U B' R' B2 L2 U' B U R D2 R2 D L' U' R L2 B' L R' D2 R' D B2 U R' F D2 L F' L2 F R2 U' B' R2");
//        System.out.println(shortenedNotation("F F' U' R R' D D' D"));// "U' D");
    }

    public static String shortenedNotation(String moves) {
        String[] move = moves.split(" ");
        StringBuilder result = new StringBuilder();
        for (String s : move) {
            switch (s) {
                case "R" -> act(result, "R");
                case "R'" -> act(result, "R'");
                case "L" -> act(result, "L");
                case "L'" -> act(result, "L'");
                case "U" -> act(result, "U");
                case "U'" -> act(result, "U'");
                case "D" -> act(result, "D");
                case "D'" -> act(result, "D'");
                case "F" -> act(result, "F");
                case "F'" -> act(result, "F'");
                case "B" -> act(result, "B");
                case "B'" -> act(result, "B'");
            }
        }
        return result.toString().trim();
    }

    public static void act(StringBuilder result, String currentMove) {
        String[] x = result.toString().trim().split(" ");
        if (result.isEmpty()) result.append(currentMove).append(" ");
        else if ((currentMove).equals(x[x.length - 1] + "'")) {

        } else
            result.append(currentMove).append(" ");
    }
}
