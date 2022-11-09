import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;
import components.xmltree.XMLTree;
import components.xmltree.XMLTree1;

/**
 * Program to evaluate XMLTree expressions of {@code int}.
 *
 * @author Put your name here
 *
 */
public final class XMLTreeIntExpressionEvaluator {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private XMLTreeIntExpressionEvaluator() {
    }

    /**
     * Evaluate the given expression.
     *
     * @param exp
     *            the {@code XMLTree} representing the expression
     * @return the value of the expression
     * @requires <pre>
     * [exp is a subtree of a well-formed XML arithmetic expression]  and
     *  [the label of the root of exp is not "expression"]
     * </pre>
     * @ensures evaluate = [the value of the expression]
     */
    private static int evaluate(XMLTree exp) {

        assert exp != null : "Violation of: exp is not null";

        // Initialize answer to 0.
        int ans = 0;

        /*
         * BASE CASE
         *
         * If the expression only contains a number, it sets the answer to that
         * number.
         */
        if (exp.label().equals("number")) {

            ans = Integer.parseInt(exp.attributeValue("value"));

        } else {

            // Declare variables for the answer for first and second child expressions.
            int firstChildExpAns, secondChildExpAns;

            String operator = exp.label();
            XMLTree firstChildExp = exp.child(0);

            if (exp.numberOfChildren() == 1) {

                firstChildExpAns = evaluate(firstChildExp);

            } else {

                XMLTree secondChildExp = exp.child(1);

                firstChildExpAns = evaluate(firstChildExp);
                secondChildExpAns = evaluate(secondChildExp);

                // Arithmetic Operations
                if (operator.equals("plus")) {
                    ans = firstChildExpAns + secondChildExpAns;
                } else if (operator.equals("minus")) {
                    ans = firstChildExpAns - secondChildExpAns;
                } else if (operator.equals("times")) {
                    ans = firstChildExpAns * secondChildExpAns;
                } else {
                    ans = firstChildExpAns / secondChildExpAns;
                }
            }
        }

        return ans;
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        SimpleReader in = new SimpleReader1L();
        SimpleWriter out = new SimpleWriter1L();

        out.print(
                "Enter the path of an expression XML file without quotations: ");
        String path = in.nextLine();
        while (!path.equals("")) {
            XMLTree exp = new XMLTree1(path);
            out.println(evaluate(exp.child(0)));
            out.print(
                    "Enter the path of an expression XML file without quotations: ");
            path = in.nextLine();
        }

        in.close();
        out.close();
    }
}
