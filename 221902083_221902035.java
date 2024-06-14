package home1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Home1 extends javax.swing.JFrame {

    public Home1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(205, 240, 255));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{
            "Select an Option", "Bit Stuffing", "Bit De-stuffing", "Character Stuffing", 
            "Character De-Stuffing", "Dotted Decimal to Binary", 
            "Binary to Dotted Decimal",  "Parity Check(Even)","Parity Check(Odd)"
        }));

        jButton1.setBackground(new java.awt.Color(255, 104, 104));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jButton1.setText("Reset");

        jButton2.setBackground(new java.awt.Color(195, 255, 147));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jButton2.setText("Perform");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel1.setText("Select Option");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel2.setText("Input");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel4.setText("Output");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel5.setText(":");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel6.setText(":");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel8.setText(":");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel9.setText("Flag");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel3.setText(":");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24));
        jLabel7.setText("Basic Data Communication Techniques");

        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performSelectedTechnique();
            }
        });

        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jComboBox1.setSelectedIndex(0);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(81, 81, 81)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField2)
                        .addComponent(jComboBox1, 0, 271, Short.MAX_VALUE)
                        .addComponent(jTextField1))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(82, 82, 82))
                .addGroup(layout.createSequentialGroup()
                    .addGap(125, 125, 125)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(131, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(40, 40, 40)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField3)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(5, 5, 5)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(46, 46, 46))
        );

        pack();
    }
    private String bitStuffing(int[] arr) {
        int N = arr.length;
        int[] brr = new int[30]; // Stores the stuffed array

        int i, j, k; // Variables to traverse arrays
        i = 0;
        j = 0;
        int count = 1; // Stores the count of consecutive ones

        // Loop to traverse in the range [0, N)
        while (i < N) {
            // If the current bit is a set bit
            if (arr[i] == 1) {
                brr[j] = arr[i]; // Insert into array brr[]

                // Loop to check for next 5 bits
                for (k = i + 1; arr[k] == 1 && k < N && count < 5; k++) {
                    j++;
                    brr[j] = arr[k];
                    count++;

                    // If 5 consecutive set bits are found insert a 0 bit
                    if (count == 5) {
                        j++;
                        brr[j] = 0;
                    }
                    i = k;
                }
            } else {
                // Otherwise insert arr[i] into the array brr[]
                brr[j] = arr[i];
            }
            i++;
            j++;
        }

        // Build string output
        StringBuilder output = new StringBuilder();
        for (i = 0; i < j; i++) {
            output.append(brr[i]);
        }

        return output.toString();
    }

    // Function for bit de-stuffing
    private String bitDestuffing(int[] arr) {
        int[] brr = new int[30]; // Stores the de-stuffed array

        int N = arr.length; // Length of the input array
        int i = 0, j = 0, k; // Variables to traverse the arrays

        int count = 1; // Stores the count of consecutive ones

        // Loop to traverse in the range [0, N)
        while (i < N) {
            // If the current bit is a set bit
            if (arr[i] == 1) {
                brr[j] = arr[i]; // Insert into array brr[]

                // Loop to check for the next 5 bits
                for (k = i + 1; k < N && arr[k] == 1 && count < 5; k++) {
                    j++;
                    brr[j] = arr[k];
                    count++;

                    // If 5 consecutive set bits are found, skip the next bit in arr[]
                    if (count == 5) {
                        k++;
                        break;
                    }
                }
                i = k;
            } else {
                // Otherwise insert arr[i] into the array brr
                brr[j] = arr[i];
            }
            i++;
            j++;
        }

        // Convert the de-stuffed bits array to a string
        StringBuilder deStuffedBits = new StringBuilder();
        for (i = 0; i < j; i++) {
            deStuffedBits.append(brr[i]);
        }
        return deStuffedBits.toString();
    }

   private static String characterStuffing(String data) {
        String l = "DLEETX";
        String sd = "DLESTX";
        
        int i = 0;
        while (i < data.length()) {
            if (i + 2 < data.length() && data.substring(i, i + 3).equals("DLE")) {
                sd += "DLEDLE";
                i += 3;
            } else {
                sd += data.charAt(i);
                i++;
            }
        }

        return sd + l;
    }
    
    private static String characterDeStuffing(String data) {
        // Remove the initial "DLESTX" and the final "DLEETX"
        if (data.startsWith("DLESTX") && data.endsWith("DLEETX")) {
            data = data.substring(6, data.length() - 6);
        } else {
            throw new IllegalArgumentException("Data does not start with 'DLESTX' or end with 'DLEETX'");
        }

        StringBuilder destuffedData = new StringBuilder();
        int i = 0;
        while (i < data.length()) {
            // Check if current and next character is "DLE"
            if (i + 5 < data.length() && data.substring(i, i + 6).equals("DLEDLE")) {
                destuffedData.append("DLE");
                i += 6; // Skip the next "DLE"
            } else {
                destuffedData.append(data.charAt(i));
                i++;
            }
        }
        return destuffedData.toString();
    }


    private String dottedDecimalToBinary(String input) {
        String[] octets = input.split("\\.");
        if (octets.length != 4) return "Invalid IPv4 address.";

        StringBuilder binaryIP = new StringBuilder();
        for (String octet : octets) {
            try {
                int decimal = Integer.parseInt(octet);
                if (decimal < 0 || decimal > 255) return "Invalid IPv4 address.";
                String binary = Integer.toBinaryString(decimal);
                binaryIP.append(String.format("%08d", Integer.parseInt(binary)));
                binaryIP.append(".");
            } catch (NumberFormatException e) {
                return "Invalid IPv4 address.";
            }
        }

        return binaryIP.substring(0, binaryIP.length() - 1); // remove last dot
    }

    private String binaryToDottedDecimal(String input) {
        String[] octets = input.split("\\.");
        if (octets.length != 4) return "Invalid binary IP address.";

        StringBuilder decimalIP = new StringBuilder();
        for (String octet : octets) {
            try {
                if (octet.length() != 8) return "Invalid binary IP address.";
                int decimal = Integer.parseInt(octet, 2);
                decimalIP.append(decimal);
                decimalIP.append(".");
            } catch (NumberFormatException e) {
                return "Invalid binary IP address.";
            }
        }

        return decimalIP.substring(0, decimalIP.length() - 1); // remove last dot
    }
   
    
    private String parityCheck(String inputData) {
        char[] data = new char[100];
        for (int i = 0; i < inputData.length(); i++) {
            data[i] = inputData.charAt(i);
        }

        // Finding the user data length
        int length = inputData.length();
        int count = 0;

        // Checking even parity
        for (int i = 0; i < length; i++) {
            if (data[i] == '1') {
                count++;
            }
        }

        // Increasing the array for adding the parity bit.
        int c = length + 1;
        char[] newData = new char[c];

        // Initializing the parity
        if (count % 2 == 0) {
            for (int i = c - 1, j = length - 1; j >= 0; i--, j--) {
                newData[i] = data[j];
            }
            newData[0] = '0';
        } else {
            for (int i = c - 1, j = length - 1; j >= 0; i--, j--) {
                newData[i] = data[j];
            }
            newData[0] = '1';
        }

        // Build string output
        StringBuilder output = new StringBuilder();
        for (char c1 : newData) {
            if (c1 != '\0') {
                output.append(c1);
            }
        }
        return output.toString();
    }
    
    private String oddparityCheck(String inputData) {
    char[] data = new char[100];
    for (int i = 0; i < inputData.length(); i++) {
        data[i] = inputData.charAt(i);
    }

    // Finding the user data length
    int length = inputData.length();
    int count = 0;

    // Counting the number of '1' bits
    for (int i = 0; i < length; i++) {
        if (data[i] == '1') {
            count++;
        }
    }

    // Determine the length of new data array including the parity bit
    int c = length + 1;
    char[] newData = new char[c];

    // Initialize the parity bit to ensure odd parity
    char parityBit = (count % 2 == 0) ? '1' : '0';

    // Copy the original data to the new array and add the parity bit at the start
    for (int i = c - 1, j = length - 1; j >= 0; i--, j--) {
        newData[i] = data[j];
    }
    newData[0] = parityBit;

    // Build the output string
    StringBuilder output = new StringBuilder();
    for (char c1 : newData) {
        if (c1 != '\0') {
            output.append(c1);
        }
    }
    return output.toString();
}


    private void performSelectedTechnique() {
        String input = jTextField1.getText();
        String flag = jTextField3.getText();
        String selectedOption = (String) jComboBox1.getSelectedItem();
        String output = "";

        if (selectedOption == null) {
            JOptionPane.showMessageDialog(this, "Please select an option.");
            return;
        }

        switch (selectedOption) {
            case "Bit Stuffing":
                // Convert input string to integer array
                int[] arr = new int[input.length()];
                for (int i = 0; i < input.length(); i++) {
                    arr[i] = Character.getNumericValue(input.charAt(i));
                }
                output = bitStuffing(arr);
                break;
            case "Bit De-stuffing":
                int[] deStuffingInputArray = new int[input.length()];
                for (int idx = 0; idx < input.length(); idx++) {
                    deStuffingInputArray[idx] = Character.getNumericValue(input.charAt(idx));
                }
                output = bitDestuffing(deStuffingInputArray);
                break;
            case "Character Stuffing":
                output = characterStuffing(input);
                break;
            case "Character De-Stuffing":
                output = characterDeStuffing(input);
                break;
            case "Dotted Decimal to Binary":
                output = dottedDecimalToBinary(input);
                break;
            case "Binary to Dotted Decimal":
                output = binaryToDottedDecimal(input);
                break;
            
                case "Parity Check(Even)":
                output = parityCheck(input);
                break;
                
                case "Parity Check(Odd)":
                output = oddparityCheck(input);
                break;
            default:
                JOptionPane.showMessageDialog(this, "Invalid option selected.");
                return;
        }

        jTextField2.setText(output);
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home1().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
}

