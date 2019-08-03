/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_hashmap;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.HashMap;
//import java.util.Map;

/**
 *
 * @author Traivith
 */
public class Lab1_Hashmap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        
        HashMap<Integer, Detail> m = new HashMap<Integer, Detail>();
        
        long startTime = new Date().getTime();
        m.put(1, new Detail("'Sale43659'", "'Mountain-100 Black, 42'"));
        m.put(2, new Detail("'Sale43659'", "'Mountain-100 Black, 44'"));
        m.put(3, new Detail("'Sale43659'", "'Mountain-100 Black, 48'"));
        m.put(4, new Detail("'Sale43659'", "'Mountain-100 Silver, 38'"));
        m.put(5, new Detail("'Sale43659'", "'Mountain-100 Silver, 42'"));
        m.put(6, new Detail("'Sale43659'", "'Mountain-100 Silver, 44'"));
        m.put(7, new Detail("'Sale43659'", "'Mountain-100 Silver, 48'"));
        m.put(8, new Detail("'Sale43659'", "'Long-Sleeve Logo Jersey, M'"));
        m.put(9, new Detail("'Sale43659'", "'Long-Sleeve Logo Jersey, XL'"));
        m.put(10, new Detail("'Sale43659'", "'Mountain Bike Socks, M'"));
        m.put(11, new Detail("'Sale43659'", "'AWC Logo Cap'"));
        m.put(12, new Detail("'Sale43659'", "'Sport-100 Helmet, Blue'"));
        m.put(13, new Detail("'Sale43660'", "'Road-650 Red, 44'"));
        m.put(14, new Detail("'Sale43660'", "'Road-450 Red, 52'"));
        m.put(15, new Detail("'Sale43661'", "'HL Mountain Frame - Black, 48'"));
        m.put(16, new Detail("'Sale43661'", "'HL Mountain Frame - Black, 42'"));
        m.put(17, new Detail("'Sale43661'", "'HL Mountain Frame - Black, 38'"));
        m.put(18, new Detail("'Sale43661'", "'AWC Logo Cap'"));
        m.put(19, new Detail("'Sale43661'", "'Long-Sleeve Logo Jersey, L'"));
        m.put(20, new Detail("'Sale43661'", "'HL Mountain Frame - Silver, 46'"));
        m.put(21, new Detail("'Sale43661'", "'Mountain-100 Black, 38'"));
        m.put(22, new Detail("'Sale43661'", "'Mountain-100 Black, 48'"));
        m.put(23, new Detail("'Sale43661'", "'Sport-100 Helmet, Blue'"));
        m.put(24, new Detail("'Sale43661'", "'HL Mountain Frame - Silver, 48'"));
        m.put(25, new Detail("'Sale43661'", "'Mountain-100 Black, 42'"));
        m.put(26, new Detail("'Sale43661'", "'Mountain-100 Silver, 44'"));
        m.put(27, new Detail("'Sale43661'", "'Long-Sleeve Logo Jersey, XL'"));
        m.put(28, new Detail("'Sale43661'", "'Mountain-100 Black, 44'"));
        m.put(29, new Detail("'Sale43661'", "'Sport-100 Helmet, Black'"));
        m.put(30, new Detail("'Sale43662'", "'Road-650 Red, 52'"));
        m.put(31, new Detail("'Sale43662'", "'Road-650 Black, 52'"));
        m.put(32, new Detail("'Sale43662'", "'LL Road Frame - Red, 62'"));
        m.put(33, new Detail("'Sale43662'", "'Road-450 Red, 58'"));
        m.put(34, new Detail("'Sale43662'", "'LL Road Frame - Red, 44'"));
        m.put(35, new Detail("'Sale43662'", "'Road-650 Red, 44'"));
        m.put(36, new Detail("'Sale43662'", "'Road-650 Black, 58'"));
        m.put(37, new Detail("'Sale43662'", "'Road-650 Black, 44'"));
        m.put(38, new Detail("'Sale43662'", "'Road-150 Red, 56'"));
        m.put(39, new Detail("'Sale43662'", "'Road-450 Red, 44'"));
        m.put(40, new Detail("'Sale43662'", "'Road-650 Red, 48'"));
        m.put(41, new Detail("'Sale43662'", "'ML Road Frame - Red, 48'"));
        m.put(42, new Detail("'Sale43662'", "'Road-450 Red, 52'"));
        m.put(43, new Detail("'Sale43662'", "'LL Road Frame - Red, 60'"));
        m.put(44, new Detail("'Sale43662'", "'LL Road Frame - Black, 58'"));
        m.put(45, new Detail("'Sale43662'", "'Road-150 Red, 62'"));
        m.put(46, new Detail("'Sale43662'", "'Road-650 Red, 60'"));
        m.put(47, new Detail("'Sale43662'", "'LL Road Frame - Red, 48'"));
        m.put(48, new Detail("'Sale43662'", "'ML Road Frame - Red, 52'"));
        m.put(49, new Detail("'Sale43662'", "'LL Road Frame - Black, 52'"));
        m.put(50, new Detail("'Sale43662'", "'Road-650 Black, 60'"));
        m.put(51, new Detail("'Sale43662'", "'Road-450 Red, 60'"));
        m.put(52, new Detail("'Sale43663'", "'Road-650 Red, 60'"));
        m.put(53, new Detail("'Sale43664'", "'Mountain-100 Silver, 42'"));
        m.put(54, new Detail("'Sale43664'", "'Mountain-100 Black, 38'"));
        m.put(55, new Detail("'Sale43664'", "'Long-Sleeve Logo Jersey, M'"));
        m.put(56, new Detail("'Sale43664'", "'Long-Sleeve Logo Jersey, XL'"));
        m.put(57, new Detail("'Sale43664'", "'Mountain-100 Black, 44'"));
        m.put(58, new Detail("'Sale43664'", "'Mountain-100 Silver, 38'"));
        m.put(59, new Detail("'Sale43664'", "'Mountain-100 Silver, 44'"));
        m.put(60, new Detail("'Sale43664'", "'Mountain-100 Black, 48'"));
        m.put(61, new Detail("'Sale43665'", "'Sport-100 Helmet, Blue'"));
        m.put(62, new Detail("'Sale43665'", "'Mountain-100 Silver, 44'"));
        m.put(63, new Detail("'Sale43665'", "'Sport-100 Helmet, Red'"));
        m.put(64, new Detail("'Sale43665'", "'Long-Sleeve Logo Jersey, L'"));
        m.put(65, new Detail("'Sale43665'", "'Mountain-100 Black, 44'"));
        m.put(66, new Detail("'Sale43665'", "'AWC Logo Cap'"));
        m.put(67, new Detail("'Sale43665'", "'Mountain-100 Black, 38'"));
        m.put(68, new Detail("'Sale43665'", "'Mountain-100 Black, 48'"));
        m.put(69, new Detail("'Sale43665'", "'Mountain Bike Socks, M'"));
        m.put(70, new Detail("'Sale43665'", "'Mountain-100 Black, 42'"));
        m.put(71, new Detail("'Sale43666'", "'Road-650 Red, 52'"));
        m.put(72, new Detail("'Sale43666'", "'Road-150 Red, 56'"));
        m.put(73, new Detail("'Sale43666'", "'ML Road Frame - Red, 48'"));
        m.put(74, new Detail("'Sale43666'", "'Road-450 Red, 44'"));
        m.put(75, new Detail("'Sale43666'", "'Road-650 Black, 44'"));
        m.put(76, new Detail("'Sale43666'", "'Road-650 Black, 60'"));
        m.put(77, new Detail("'Sale43667'", "'Mountain Bike Socks, L'"));
        m.put(78, new Detail("'Sale43667'", "'Mountain-100 Silver, 44'"));
        m.put(79, new Detail("'Sale43667'", "'Mountain-100 Black, 48'"));
        m.put(80, new Detail("'Sale43667'", "'Mountain-100 Black, 38'"));
        m.put(81, new Detail("'Sale43668'", "'Road-450 Red, 44'"));
        m.put(82, new Detail("'Sale43668'", "'Road-150 Red, 56'"));
        m.put(83, new Detail("'Sale43668'", "'Road-650 Red, 60'"));
        m.put(84, new Detail("'Sale43668'", "'Road-650 Black, 58'"));
        m.put(85, new Detail("'Sale43668'", "'Long-Sleeve Logo Jersey, L'"));
        m.put(86, new Detail("'Sale43668'", "'LL Road Frame - Red, 62'"));
        m.put(87, new Detail("'Sale43668'", "'Sport-100 Helmet, Red'"));
        m.put(88, new Detail("'Sale43668'", "'Sport-100 Helmet, Blue'"));
        m.put(89, new Detail("'Sale43668'", "'Road-450 Red, 58'"));
        m.put(90, new Detail("'Sale43668'", "'AWC Logo Cap'"));
        m.put(91, new Detail("'Sale43668'", "'LL Road Frame - Red, 60'"));
        m.put(92, new Detail("'Sale43668'", "'Road-450 Red, 60'"));
        m.put(93, new Detail("'Sale43668'", "'Road-650 Red, 62'"));
        m.put(94, new Detail("'Sale43668'", "'Road-650 Black, 52'"));
        m.put(95, new Detail("'Sale43668'", "'LL Road Frame - Red, 48'"));
        m.put(96, new Detail("'Sale43668'", "'Road-650 Red, 52'"));
        m.put(97, new Detail("'Sale43668'", "'Road-650 Black, 60'"));
        m.put(98, new Detail("'Sale43668'", "'LL Road Frame - Red, 44'"));
        m.put(99, new Detail("'Sale43668'", "'Long-Sleeve Logo Jersey, XL'"));
        m.put(100, new Detail("'Sale43668'", "'Road-650 Black, 44'"));
        m.put(101, new Detail("'Sale43668'", "'ML Road Frame - Red, 48'"));
        m.put(102, new Detail("'Sale43668'", "'Road-450 Red, 52'"));
        m.put(103, new Detail("'Sale43668'", "'Road-650 Red, 44'"));
        m.put(104, new Detail("'Sale43668'", "'LL Road Frame - Black, 52'"));
        m.put(105, new Detail("'Sale43668'", "'Long-Sleeve Logo Jersey, M'"));
        m.put(106, new Detail("'Sale43668'", "'LL Road Frame - Black, 58'"));
        m.put(107, new Detail("'Sale43668'", "'Sport-100 Helmet, Black'"));
        m.put(108, new Detail("'Sale43668'", "'ML Road Frame - Red, 52'"));
        m.put(109, new Detail("'Sale43668'", "'Road-650 Red, 48'"));
        m.put(110, new Detail("'Sale43669'", "'HL Mountain Frame - Black, 38'"));
        m.put(111, new Detail("'Sale43670'", "'Mountain Bike Socks, L'"));
        m.put(112, new Detail("'Sale43670'", "'Mountain Bike Socks, M'"));
        m.put(113, new Detail("'Sale43670'", "'Mountain-100 Silver, 44'"));
        m.put(114, new Detail("'Sale43670'", "'Mountain-100 Black, 42'"));
        m.put(115, new Detail("'Sale43671'", "'Road-150 Red, 56'"));
        m.put(116, new Detail("'Sale43671'", "'Long-Sleeve Logo Jersey, M'"));
        m.put(117, new Detail("'Sale43671'", "'Road-450 Red, 44'"));
        m.put(118, new Detail("'Sale43671'", "'Road-650 Black, 44'"));
        m.put(119, new Detail("'Sale43671'", "'ML Road Frame - Red, 48'"));
        m.put(120, new Detail("'Sale43671'", "'Road-650 Red, 48'"));
        m.put(121, new Detail("'Sale43671'", "'Road-450 Red, 60'"));
        m.put(122, new Detail("'Sale43671'", "'Road-650 Red, 52'"));
        m.put(123, new Detail("'Sale43671'", "'Long-Sleeve Logo Jersey, XL'"));
        m.put(124, new Detail("'Sale43671'", "'Sport-100 Helmet, Blue'"));
        m.put(125, new Detail("'Sale43671'", "'Sport-100 Helmet, Black'"));
        m.put(126, new Detail("'Sale43672'", "'Mountain Bike Socks, M'"));
        m.put(127, new Detail("'Sale43672'", "'Mountain-100 Black, 42'"));
        m.put(128, new Detail("'Sale43672'", "'Mountain-100 Silver, 48'"));
        m.put(129, new Detail("'Sale43673'", "'Road-450 Red, 58'"));
        m.put(130, new Detail("'Sale43673'", "'Long-Sleeve Logo Jersey, L'"));
        m.put(131, new Detail("'Sale43673'", "'LL Road Frame - Red, 60'"));
        m.put(132, new Detail("'Sale43673'", "'Road-650 Red, 62'"));
        m.put(133, new Detail("'Sale43673'", "'Road-650 Red, 44'"));
        m.put(134, new Detail("'Sale43673'", "'LL Road Frame - Black, 52'"));
        m.put(135, new Detail("'Sale43673'", "'Road-650 Black, 52'"));
        m.put(136, new Detail("'Sale43673'", "'AWC Logo Cap'"));
        m.put(137, new Detail("'Sale43673'", "'Sport-100 Helmet, Black'"));
        m.put(138, new Detail("'Sale43673'", "'Sport-100 Helmet, Blue'"));
        m.put(139, new Detail("'Sale43673'", "'Sport-100 Helmet, Red'"));
        m.put(140, new Detail("'Sale43674'", "'Road-450 Red, 52'"));
        m.put(141, new Detail("'Sale43675'", "'Road-650 Red, 62'"));
        m.put(142, new Detail("'Sale43675'", "'Sport-100 Helmet, Blue'"));
        m.put(143, new Detail("'Sale43675'", "'LL Road Frame - Black, 52'"));
        m.put(144, new Detail("'Sale43675'", "'Sport-100 Helmet, Black'"));
        m.put(145, new Detail("'Sale43675'", "'Road-650 Red, 44'"));
        m.put(146, new Detail("'Sale43675'", "'Road-450 Red, 52'"));
        m.put(147, new Detail("'Sale43675'", "'AWC Logo Cap'"));
        m.put(148, new Detail("'Sale43675'", "'Road-450 Red, 58'"));
        m.put(149, new Detail("'Sale43675'", "'Long-Sleeve Logo Jersey, L'"));
        m.put(150, new Detail("'Sale43676'", "'Mountain-100 Black, 42'"));
        m.put(151, new Detail("'Sale43676'", "'Mountain-100 Black, 48'"));
        m.put(152, new Detail("'Sale43676'", "'Mountain Bike Socks, L'"));
        m.put(153, new Detail("'Sale43676'", "'Mountain-100 Black, 38'"));
        m.put(154, new Detail("'Sale43676'", "'Mountain Bike Socks, M'"));
        m.put(155, new Detail("'Sale43677'", "'Long-Sleeve Logo Jersey, L'"));
        m.put(156, new Detail("'Sale43677'", "'Road-150 Red, 56'"));
        m.put(157, new Detail("'Sale43677'", "'Road-450 Red, 52'"));
        m.put(158, new Detail("'Sale43677'", "'Road-650 Black, 52'"));
        m.put(159, new Detail("'Sale43677'", "'Sport-100 Helmet, Black'"));
        m.put(160, new Detail("'Sale43677'", "'Road-650 Red, 60'"));
        m.put(161, new Detail("'Sale43677'", "'Road-650 Black, 58'"));
        m.put(162, new Detail("'Sale43677'", "'Road-650 Red, 48'"));
        m.put(163, new Detail("'Sale43677'", "'AWC Logo Cap'"));
        m.put(164, new Detail("'Sale43677'", "'Sport-100 Helmet, Red'"));
        m.put(165, new Detail("'Sale43677'", "'Road-450 Red, 58'"));
        m.put(166, new Detail("'Sale43677'", "'LL Road Frame - Red, 60'"));
        m.put(167, new Detail("'Sale43678'", "'Road-650 Red, 60'"));
        m.put(168, new Detail("'Sale43678'", "'LL Road Frame - Black, 52'"));
        m.put(169, new Detail("'Sale43678'", "'Road-650 Black, 58'"));
        m.put(170, new Detail("'Sale43678'", "'ML Road Frame - Red, 48'"));
        m.put(171, new Detail("'Sale43678'", "'Road-650 Red, 44'"));
        m.put(172, new Detail("'Sale43678'", "'Road-650 Red, 62'"));
        m.put(173, new Detail("'Sale43678'", "'AWC Logo Cap'"));
        m.put(174, new Detail("'Sale43678'", "'Sport-100 Helmet, Black'"));
        m.put(175, new Detail("'Sale43678'", "'LL Road Frame - Red, 60'"));
        m.put(176, new Detail("'Sale43678'", "'Road-450 Red, 44'"));
        m.put(177, new Detail("'Sale43678'", "'LL Road Frame - Red, 44'"));
        m.put(178, new Detail("'Sale43678'", "'Long-Sleeve Logo Jersey, XL'"));
        m.put(179, new Detail("'Sale43678'", "'Road-650 Black, 52'"));
        m.put(180, new Detail("'Sale43678'", "'Road-450 Red, 52'"));
        m.put(181, new Detail("'Sale43678'", "'Long-Sleeve Logo Jersey, L'"));
        m.put(182, new Detail("'Sale43678'", "'Road-450 Red, 58'"));
        m.put(183, new Detail("'Sale43678'", "'Road-450 Red, 60'"));
        m.put(184, new Detail("'Sale43678'", "'Sport-100 Helmet, Blue'"));
        m.put(185, new Detail("'Sale43678'", "'Sport-100 Helmet, Red'"));
        m.put(186, new Detail("'Sale43679'", "'Road-650 Red, 60'"));
        m.put(187, new Detail("'Sale43679'", "'Road-650 Black, 52'"));
        m.put(188, new Detail("'Sale43679'", "'Long-Sleeve Logo Jersey, L'"));
        m.put(189, new Detail("'Sale43680'", "'Road-650 Red, 60'"));
        m.put(190, new Detail("'Sale43680'", "'Road-450 Red, 44'"));
        m.put(191, new Detail("'Sale43680'", "'LL Road Frame - Black, 52'"));
        m.put(192, new Detail("'Sale43680'", "'Sport-100 Helmet, Red'"));
        m.put(193, new Detail("'Sale43680'", "'LL Road Frame - Red, 60'"));
        m.put(194, new Detail("'Sale43680'", "'Sport-100 Helmet, Blue'"));
        m.put(195, new Detail("'Sale43680'", "'Long-Sleeve Logo Jersey, L'"));
        m.put(196, new Detail("'Sale43680'", "'LL Road Frame - Red, 44'"));
        m.put(197, new Detail("'Sale43680'", "'Road-450 Red, 52'"));
        m.put(198, new Detail("'Sale43680'", "'Road-650 Red, 62'"));
        m.put(199, new Detail("'Sale43680'", "'Road-150 Red, 56'"));
       
       
        for (HashMap.Entry hm : m.entrySet()) {
            System.out.println(hm.getKey() + "" + hm.getValue());
        }
        System.out.println("");
        long end = System.currentTimeMillis();
        
        NumberFormat formatter = new DecimalFormat("#0.00000");
        System.out.println("Excution is " + formatter.format((end-start)/1000d) + "Second");
        System.out.println("");
    }

}
