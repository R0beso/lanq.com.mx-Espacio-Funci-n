package tiktok;

import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class AnimacionCasa extends JPanel {

	private static final long serialVersionUID = 1L;
	private int etapa = 0;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        if (etapa >= 1)
        	g.setColor(new Color(216,226,255));
        	if (etapa >= 2)
        	g.fillRect(5, 5, 1175, 525);
        	if (etapa >= 3)
        	g.setColor(new Color(220,241,255));
        	if (etapa >= 4)
        	g.fillOval(-99, -127, 250, 190);
        	if (etapa >= 5)
        		        g.fillOval(-19, -22, 220, 40);
        	if (etapa >= 6)
        		        g.setColor(Color.white);
        	if (etapa >= 7)
        		        g.fillOval(-100, -130, 250, 190);
        	if (etapa >= 8)
        		        g.fillOval(-20, -25, 220, 40);
        	if (etapa >= 9)
        		        g.setColor(new Color(220,241,255));
        	if (etapa >= 10)
        		        g.fillOval(430, -60, 240, 80);
        	if (etapa >= 11)
        		        g.setColor(Color.white);
        	if (etapa >= 12)
        		        g.fillOval(428, -63, 240, 80);
        	if (etapa >= 13)
        		        g.setColor(new Color(220,241,255));
        	if (etapa >= 14)
        		        g.fillOval(548, -25, 58, 50);
        	if (etapa >= 15)
        		        g.setColor(Color.white);
        	if (etapa >= 16)
        		        g.fillOval(545, -27, 62, 50);
        	if (etapa >= 17)
        		        g.setColor(new Color(220,241,255));
        	if (etapa >= 18)
        		        g.fillOval(260, -35, 240, 80);
        	if (etapa >= 19)
        		        g.setColor(Color.white);
        	if (etapa >= 20)
        		        g.fillOval(258, -38, 243, 80);
        	if (etapa >= 21)
        		        g.setColor(new Color(220,241,255));
        	if (etapa >= 22)
        		        g.fillOval(298, 16, 70, 40);
        	if (etapa >= 23)
        		        g.setColor(Color.white);
        	if (etapa >= 24)
        		        g.fillOval(301, 14, 70, 40);
        	if (etapa >= 25)
        		        g.setColor(new Color(220,241,255));
        	if (etapa >= 26)
        		        g.fillOval(398, 30, 52, 23);
        	if (etapa >= 27)
        		        g.setColor(Color.white);
        	if (etapa >= 28)
        		        g.fillOval(401, 28, 50, 22);
        	if (etapa >= 29)
        		        g.setColor(new Color(220,241,255));
        	if (etapa >= 30)
        		        g.fillOval(990, -35, 240, 70);
        	if (etapa >= 31)
        		        g.setColor(Color.white);
        	if (etapa >= 32)
        		        g.fillOval(988, -38, 243, 70);
        	if (etapa >= 33)
        		        g.setColor(new Color(220,241,255));
        	if (etapa >= 34)
        		        g.fillOval(1051, 8, 71, 41);
        	if (etapa >= 35)
        		        g.setColor(Color.white);
        	if (etapa >= 36)
        		        g.fillOval(1050, 6, 70, 40);
        	if (etapa >= 37)
        		        g.setColor(new Color(220,241,255));
        	if (etapa >= 38)
        		        g.fillOval(111, 158, 81, 26);
        	if (etapa >= 39)
        		        g.setColor(Color.white);
        	if (etapa >= 40)
        		        g.fillOval(111, 156, 81, 26);
        	if (etapa >= 41)
        		        g.fillOval(131, 146, 81, 31);
        	if (etapa >= 42)
        		        g.fillOval(121, 146, 36, 32);
        	if (etapa >= 43)
        		        g.setColor(new Color(220,241,255));
        	if (etapa >= 44)
        		        g.fillOval(171, 160, 29, 25);
        	if (etapa >= 45)
        		        g.setColor(Color.white);
        	if (etapa >= 46)
        		        g.fillOval(171, 158, 29, 25);
        	if (etapa >= 47)
        		        g.setColor(new Color(220,241,255));
        	if (etapa >= 48)
        		        g.fillOval(121, 160, 29, 30);
        	if (etapa >= 49)
        		        g.setColor(Color.white);
        	if (etapa >= 50)
        		        g.fillOval(121, 158, 29, 30);
        	if (etapa >= 51)
        		        g.setColor(new Color(220,241,255));
        	if (etapa >= 52)
        		        g.fillOval(161, 135, 29, 27);
        	if (etapa >= 53)
        		        g.setColor(Color.white);
        	if (etapa >= 54)
        		        g.fillOval(161, 133, 29, 27);
        	if (etapa >= 55)
        		        g.setColor(new Color(220,241,255));
        	if (etapa >= 56)
        		        g.fillOval(150, 145, 26, 23);
        	if (etapa >= 57)
        		        g.setColor(Color.white);
        	if (etapa >= 58)
        		        g.fillOval(150, 143, 26, 23);
        	if (etapa >= 59)
        		        g.setColor(new Color(220,241,255));
        	if (etapa >= 60)
        		        g.fillOval(170, 145, 26, 23);
        	if (etapa >= 61)
        		        g.setColor(Color.white);
        	if (etapa >= 62)
        		        g.fillOval(170, 143, 26, 23);
        	if (etapa >= 63)
        		        g.setColor(new Color(220,241,255));
        	if (etapa >= 64)
        		        g.fillOval(491, 126, 93, 36);
        	if (etapa >= 65)
        		        g.setColor(Color.white);
        	if (etapa >= 66)
        		        g.fillOval(490, 124, 93, 36);
        	if (etapa >= 67)
        		        g.fillOval(501, 118, 38, 34);
        	if (etapa >= 68)
        		        g.setColor(new Color(220,241,255));
        	if (etapa >= 69)
        		        g.fillOval(551, 130, 37, 33);
        	if (etapa >= 70)
        		        g.setColor(Color.white);
        	if (etapa >= 71)
        		        g.fillOval(551, 128, 37, 32);
        	if (etapa >= 72)
        		        g.setColor(new Color(220,241,255));
        	if (etapa >= 73)
        		        g.fillOval(501, 132, 35, 37);
        	if (etapa >= 74)
        		        g.setColor(Color.white);
        	if (etapa >= 75)
        		        g.fillOval(501, 130, 35, 37);
        	if (etapa >= 76)
        		        g.fillOval(531, 120, 40, 40);
        	if (etapa >= 77)
        		        g.setColor(new Color(220,241,255));
        	if (etapa >= 78)
        		        g.fillOval(1111, 158, 81, 26);
        	if (etapa >= 79)
        		        g.setColor(Color.white);
        	if (etapa >= 80)
        		        g.fillOval(1111, 156, 81, 26);
        	if (etapa >= 81)
        		        g.fillOval(1131, 146, 81, 31);
        	if (etapa >= 82)
        		        g.fillOval(1121, 146, 36, 32);
        	if (etapa >= 83)
        		        g.setColor(new Color(220,241,255));
        	if (etapa >= 84)
        		        g.fillOval(1171, 160, 29, 25);
        	if (etapa >= 85)
        		        g.setColor(Color.white);
        	if (etapa >= 86)
        		        g.fillOval(1171, 158, 29, 25);
        	if (etapa >= 87)
        		        g.setColor(new Color(220,241,255));
        	if (etapa >= 88)
        		        g.fillOval(1121, 160, 29, 30);
        	if (etapa >= 89)
        		        g.setColor(Color.white);
        	if (etapa >= 90)
        		        g.fillOval(1121, 158, 29, 30);
        	if (etapa >= 91)
        		        g.setColor(new Color(220,241,255));
        	if (etapa >= 92)
        		        g.fillOval(1161, 135, 29, 27);
        	if (etapa >= 93)
        		        g.setColor(Color.white);
        	if (etapa >= 94)
        		        g.fillOval(1161, 133, 29, 27);
        	if (etapa >= 95)
        		        g.setColor(new Color(220,241,255));
        	if (etapa >= 96)
        		        g.fillOval(1150, 145, 26, 23);
        	if (etapa >= 97)
        		        g.setColor(Color.white);
        	if (etapa >= 98)
        		        g.fillOval(1150, 143, 26, 23);
        	if (etapa >= 99)
        		        g.setColor(new Color(220,241,255));
        	if (etapa >= 100)
        		        g.fillOval(1170, 145, 26, 23);
        	if (etapa >= 101)
        		        g.setColor(Color.white);
        	if (etapa >= 102)
        		        g.fillOval(1170, 143, 26, 23);
        	if (etapa >= 103)
        		        g.setColor(new Color(220,241,255));
        	if (etapa >= 104)
        		        g.fillOval(341, 195, 19, 17);
        	if (etapa >= 105)
        		        g.setColor(Color.white);
        	if (etapa >= 106)
        		        g.fillOval(341, 193, 12, 12);
        	if (etapa >= 107)
        		        g.setColor(new Color(220,241,255));
        	if (etapa >= 108)
        		        g.setColor(Color.white);
        	if (etapa >= 109)
        		        g.fillOval(360, 196, 12, 11);
        	if (etapa >= 110)
        		        g.setColor(new Color(220,241,255));
        	if (etapa >= 111)
        		        g.fillOval(330, 205, 16, 13);
        	if (etapa >= 112)
        		        g.setColor(Color.white);
        	if (etapa >= 113)
        		        g.fillOval(330, 203, 16, 13);
        	if (etapa >= 114)
        		        g.setColor(new Color(220,241,255));
        	if (etapa >= 115)
        		        g.fillOval(350, 205, 16, 13);
        	if (etapa >= 116)
        		        g.setColor(Color.white);
        	if (etapa >= 117)
        		        g.fillOval(350, 203, 16, 13);
        	if (etapa >= 118)
        		        g.fillOval(330, 197, 40, 17);
        	if (etapa >= 119)
        		        g.setColor(Color.black);
        	if (etapa >= 120)
        		        g.fillRect(0, 0, 1190, 5);
        	if (etapa >= 121)
        		        g.fillRect(0, 755, 1190, 6);
        	if (etapa >= 122)
        		        g.fillRect(0, 0, 5, 765);
        	if (etapa >= 123)
        		        g.fillRect(1180, 0, 5, 765);
        	if (etapa >= 124)
        		        g.setColor(new Color(181,192,126));//Azul
        	if (etapa >= 125)
        		        g.fillRect(5, 530, 1175, 225);
        	if (etapa >= 126)
        			        g.setColor(new Color(237,233,234));
        	if (etapa >= 127)
        			        g.fillPolygon(new int[]{126, 126, 5, 5}, new int[]{539, 561, 586, 549}, 4);
        	if (etapa >= 128)
        			        g.setColor(new Color(237,233,234));
        	if (etapa >= 129)
        			        g.fillPolygon(new int[]{126, 126, 5, 5}, new int[]{571, 577, 606, 596}, 4);
        	if (etapa >= 130)
        			        g.setColor(new Color(139,148,97));
        	if (etapa >= 131)
        			        g.fillRect(5, 608, 125, 35);
        	if (etapa >= 132)
        			        g.setColor(new Color(237,233,234));
        	if (etapa >= 133)
        			        g.fillPolygon(new int[]{518, 400, 5, 5, 200}, new int[]{667, 732, 732, 702, 646}, 5);
        	if (etapa >= 134)
        			        g.fillPolygon(new int[]{5, 400, 430, 5}, new int[]{732, 732, 755, 755}, 4);
        	if (etapa >= 135)
        				        g.setColor(new Color(237,233,234));
        	if (etapa >= 136)
        				        g.fillRect(5, 710, 1175, 20);
        	if (etapa >= 137)
        				        g.setColor(new Color(211,203,192));
        	if (etapa >= 138)
        			        	g.drawLine(5, 710, 1179, 710);
        	if (etapa >= 139)
        			        	g.drawLine(405, 730, 1179, 730);
        	if (etapa >= 140)
        			        	g.drawLine(477, 710, 445, 729);
        	if (etapa >= 141)
        			        	g.drawLine(587, 710, 571, 729);
        	if (etapa >= 142)
        			        	g.drawLine(708, 710, 704, 729);
        	if (etapa >= 143)
        			        	g.drawLine(828, 710, 834, 729);
        	if (etapa >= 144)
        			        	g.drawLine(938, 710, 954, 729);
        	if (etapa >= 145)
        			        	g.drawLine(1034, 710, 1058, 729);
        	if (etapa >= 146)
        			        	g.drawLine(1120, 710, 1154, 729);
        	if (etapa >= 147)
        			        g.setColor(new Color(36,49,38));
        	if (etapa >= 148)
        			        g.fillRect(5, 503, 125, 37);
        	if (etapa >= 149)
        			        g.setColor(new Color(26,36,27));
        	if (etapa >= 150)
        	g.drawLine(5, 503, 130, 503);
        	if (etapa >= 151)
        	g.drawLine(5, 512, 130, 512);
        	if (etapa >= 152)
        	g.drawLine(5, 521, 130, 521);
        	if (etapa >= 153)
        	g.drawLine(5, 530, 130, 530);
        	if (etapa >= 154)
        	g.drawLine(5, 539, 130, 539);
        	if (etapa >= 155)
        	g.drawLine(5, 504, 5, 539);
        	if (etapa >= 156)
        	g.drawLine(8, 504, 8, 539);
        	if (etapa >= 157)
        	g.drawLine(11, 504, 11, 539);
        	if (etapa >= 158)
        	g.drawLine(14, 504, 14, 539);
        	if (etapa >= 159)
        	g.drawLine(17, 504, 17, 539);
        	if (etapa >= 160)
        	g.drawLine(20, 504, 20, 539);
        	if (etapa >= 161)
        	g.drawLine(23, 504, 23, 539);
        	if (etapa >= 162)
        	g.drawLine(26, 504, 26, 539);
        	if (etapa >= 163)
        	g.drawLine(29, 504, 29, 539);
        	if (etapa >= 164)
        	g.drawLine(32, 504, 32, 539);
        	if (etapa >= 165)
        	g.drawLine(35, 504, 35, 539);
        	if (etapa >= 166)
        	g.drawLine(38, 504, 38, 539);
        	if (etapa >= 167)
        	g.drawLine(41, 504, 41, 539);
        	if (etapa >= 168)
        	g.drawLine(44, 504, 44, 539);
        	if (etapa >= 169)
        	g.drawLine(47, 504, 47, 539);
        	if (etapa >= 170)
        	g.drawLine(50, 504, 50, 539);
        	if (etapa >= 171)
        	g.drawLine(53, 504, 53, 539);
        	if (etapa >= 172)
        	g.drawLine(56, 504, 56, 539);
        	if (etapa >= 173)
        	g.drawLine(59, 504, 59, 539);
        	if (etapa >= 174)
        	g.drawLine(62, 504, 62, 539);
        	if (etapa >= 175)
        	g.drawLine(65, 504, 65, 539);
        	if (etapa >= 176)
        	g.drawLine(68, 504, 68, 539);
        	if (etapa >= 177)
        	g.drawLine(71, 504, 71, 539);
        	if (etapa >= 178)
        	g.drawLine(74, 504, 74, 539);
        	if (etapa >= 179)
        	g.drawLine(77, 504, 77, 539);
        	if (etapa >= 180)
        	g.drawLine(80, 504, 80, 539);
        	if (etapa >= 181)
        	g.drawLine(83, 504, 83, 539);
        	if (etapa >= 182)
        	g.drawLine(86, 504, 86, 539);
        	if (etapa >= 183)
        	g.drawLine(89, 504, 89, 539);
        	if (etapa >= 184)
        	g.drawLine(92, 504, 92, 539);
        	if (etapa >= 185)
        	g.drawLine(95, 504, 95, 539);
        	if (etapa >= 186)
        	g.drawLine(98, 504, 98, 539);
        	if (etapa >= 187)
        	g.drawLine(101, 504, 101, 539);
        	if (etapa >= 188)
        	g.drawLine(104, 504, 104, 539);
        	if (etapa >= 189)
        	g.drawLine(107, 504, 107, 539);
        	if (etapa >= 190)
        	g.drawLine(110, 504, 110, 539);
        	if (etapa >= 191)
        	g.drawLine(113, 504, 113, 539);
        	if (etapa >= 192)
        	g.drawLine(116, 504, 116, 539);
        	if (etapa >= 193)
        	g.drawLine(119, 504, 119, 539);
        	if (etapa >= 194)
        	g.drawLine(122, 504, 122, 539);
        	if (etapa >= 195)
        	g.drawLine(125, 504, 125, 539);
        	if (etapa >= 196)
        	g.drawLine(128, 504, 128, 539);
        	if (etapa >= 197)
        	g.drawLine(131, 504, 131, 539);
        	if (etapa >= 198)
        			        g.setColor(new Color(36,49,38));
        	if (etapa >= 199)
        			        g.fillRect(1002, 526, 178, 75);
        	if (etapa >= 200)
        			        g.setColor(new Color(26,36,27));
        	if (etapa >= 201)
        	g.drawLine(1002, 526, 1180, 526);
        	if (etapa >= 202)
        	g.drawLine(1002, 541, 1180, 541);
        	if (etapa >= 203)
        	g.drawLine(1002, 556, 1180, 556);
        	if (etapa >= 204)
        	g.drawLine(1002, 571, 1180, 571);
        	if (etapa >= 205)
        	g.drawLine(1002, 586, 1180, 586);
        	if (etapa >= 206)
        	g.drawLine(1002, 601, 1180, 601);
        	if (etapa >= 207)
        	g.drawLine(1002, 526, 1002, 601);
        	if (etapa >= 208)
        	g.drawLine(1007, 526, 1007, 601);
        	if (etapa >= 209)
        	g.drawLine(1012, 526, 1012, 601);
        	if (etapa >= 210)
        	g.drawLine(1017, 526, 1017, 601);
        	if (etapa >= 211)
        	g.drawLine(1022, 526, 1022, 601);
        	if (etapa >= 212)
        	g.drawLine(1027, 526, 1027, 601);
        	if (etapa >= 213)
        	g.drawLine(1032, 526, 1032, 601);
        	if (etapa >= 214)
        	g.drawLine(1037, 526, 1037, 601);
        	if (etapa >= 215)
        	g.drawLine(1042, 526, 1042, 601);
        	if (etapa >= 216)
        	g.drawLine(1047, 526, 1047, 601);
        	if (etapa >= 217)
        	g.drawLine(1052, 526, 1052, 601);
        	if (etapa >= 218)
        	g.drawLine(1057, 526, 1057, 601);
        	if (etapa >= 219)
        	g.drawLine(1062, 526, 1062, 601);
        	if (etapa >= 220)
        	g.drawLine(1067, 526, 1067, 601);
        	if (etapa >= 221)
        	g.drawLine(1072, 526, 1072, 601);
        	if (etapa >= 222)
        	g.drawLine(1077, 526, 1077, 601);
        	if (etapa >= 223)
        	g.drawLine(1082, 526, 1082, 601);
        	if (etapa >= 224)
        	g.drawLine(1087, 526, 1087, 601);
        	if (etapa >= 225)
        	g.drawLine(1092, 526, 1092, 601);
        	if (etapa >= 226)
        	g.drawLine(1097, 526, 1097, 601);
        	if (etapa >= 227)
        	g.drawLine(1102, 526, 1102, 601);
        	if (etapa >= 228)
        	g.drawLine(1107, 526, 1107, 601);
        	if (etapa >= 229)
        	g.drawLine(1112, 526, 1112, 601);
        	if (etapa >= 230)
        	g.drawLine(1117, 526, 1117, 601);
        	if (etapa >= 231)
        	g.drawLine(1122, 526, 1122, 601);
        	if (etapa >= 232)
        	g.drawLine(1127, 526, 1127, 601);
        	if (etapa >= 233)
        	g.drawLine(1132, 526, 1132, 601);
        	if (etapa >= 234)
        	g.drawLine(1137, 526, 1137, 601);
        	if (etapa >= 235)
        	g.drawLine(1142, 526, 1142, 601);
        	if (etapa >= 236)
        	g.drawLine(1147, 526, 1147, 601);
        	if (etapa >= 237)
        	g.drawLine(1152, 526, 1152, 601);
        	if (etapa >= 238)
        	g.drawLine(1157, 526, 1157, 601);
        	if (etapa >= 239)
        	g.drawLine(1162, 526, 1162, 601);
        	if (etapa >= 240)
        	g.drawLine(1167, 526, 1167, 601);
        	if (etapa >= 241)
        	g.drawLine(1172, 526, 1172, 601);
        	if (etapa >= 242)
        	g.drawLine(1177, 526, 1177, 601);
        	if (etapa >= 243)
        	g.drawLine(1182, 526, 1182, 601);
        	if (etapa >= 244)
        	g.drawLine(1187, 526, 1187, 601);
        	if (etapa >= 245)
        	g.drawLine(1192, 526, 1192, 601);
        	if (etapa >= 246)
        	g.drawLine(1197, 526, 1197, 601);
        	if (etapa >= 247)
        	g.drawLine(1202, 526, 1202, 601);
        	if (etapa >= 248)
        	g.drawLine(1207, 526, 1207, 601);
        	if (etapa >= 249)
        	g.drawLine(1212, 526, 1212, 601);
        	if (etapa >= 250)
        	g.drawLine(1217, 526, 1217, 601);
        	if (etapa >= 251)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 252)
        	g.fillRect(570, 351, 12, 6);
        	if (etapa >= 253)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 254)
        	g.fillRect(582, 351, 12, 6);
        	if (etapa >= 255)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 256)
        	g.fillRect(594, 351, 12, 6);
        	if (etapa >= 257)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 258)
        	g.fillRect(564, 357, 12, 6);
        	if (etapa >= 259)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 260)
        	g.fillRect(576, 357, 12, 6);
        	if (etapa >= 261)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 262)
        	g.fillRect(588, 357, 12, 6);
        	if (etapa >= 263)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 264)
        	g.fillRect(606, 351, 12, 6);
        	if (etapa >= 265)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 266)
        	g.fillRect(618, 351, 12, 6);
        	if (etapa >= 267)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 268)
        	g.fillRect(630, 351, 12, 6);
        	if (etapa >= 269)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 270)
        	g.fillRect(600, 357, 12, 6);
        	if (etapa >= 271)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 272)
        	g.fillRect(612, 357, 12, 6);
        	if (etapa >= 273)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 274)
        	g.fillRect(624, 357, 12, 6);
        	if (etapa >= 275)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 276)
        	g.fillRect(642, 351, 12, 6);
        	if (etapa >= 277)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 278)
        	g.fillRect(654, 351, 12, 6);
        	if (etapa >= 279)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 280)
        	g.fillRect(666, 351, 12, 6);
        	if (etapa >= 281)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 282)
        	g.fillRect(636, 357, 12, 6);
        	if (etapa >= 283)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 284)
        	g.fillRect(648, 357, 12, 6);
        	if (etapa >= 285)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 286)
        	g.fillRect(660, 357, 12, 6);
        	if (etapa >= 287)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 288)
        	g.fillRect(678, 351, 12, 6);
        	if (etapa >= 289)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 290)
        	g.fillRect(690, 351, 12, 6);
        	if (etapa >= 291)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 292)
        	g.fillRect(702, 351, 12, 6);
        	if (etapa >= 293)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 294)
        	g.fillRect(672, 357, 12, 6);
        	if (etapa >= 295)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 296)
        	g.fillRect(684, 357, 12, 6);
        	if (etapa >= 297)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 298)
        	g.fillRect(696, 357, 12, 6);
        	if (etapa >= 299)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 300)
        	g.fillRect(714, 351, 12, 6);
        	if (etapa >= 301)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 302)
        	g.fillRect(726, 351, 12, 6);
        	if (etapa >= 303)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 304)
        	g.fillRect(738, 351, 12, 6);
        	if (etapa >= 305)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 306)
        	g.fillRect(708, 357, 12, 6);
        	if (etapa >= 307)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 308)
        	g.fillRect(720, 357, 12, 6);
        	if (etapa >= 309)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 310)
        	g.fillRect(732, 357, 12, 6);
        	if (etapa >= 311)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 312)
        	g.fillRect(750, 351, 12, 6);
        	if (etapa >= 313)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 314)
        	g.fillRect(762, 351, 12, 6);
        	if (etapa >= 315)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 316)
        	g.fillRect(774, 351, 12, 6);
        	if (etapa >= 317)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 318)
        	g.fillRect(756, 357, 12, 6);
        	if (etapa >= 319)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 320)
        	g.fillRect(768, 357, 12, 6);
        	if (etapa >= 321)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 322)
        	g.fillRect(780, 357, 12, 6);
        	if (etapa >= 323)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 324)
        	g.fillRect(570, 363, 12, 6);
        	if (etapa >= 325)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 326)
        	g.fillRect(582, 363, 12, 6);
        	if (etapa >= 327)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 328)
        	g.fillRect(594, 363, 12, 6);
        	if (etapa >= 329)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 330)
        	g.fillRect(564, 369, 12, 6);
        	if (etapa >= 331)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 332)
        	g.fillRect(576, 369, 12, 6);
        	if (etapa >= 333)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 334)
        	g.fillRect(588, 369, 12, 6);
        	if (etapa >= 335)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 336)
        	g.fillRect(606, 363, 12, 6);
        	if (etapa >= 337)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 338)
        	g.fillRect(618, 363, 12, 6);
        	if (etapa >= 339)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 340)
        	g.fillRect(630, 363, 12, 6);
        	if (etapa >= 341)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 342)
        	g.fillRect(600, 369, 12, 6);
        	if (etapa >= 343)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 344)
        	g.fillRect(612, 369, 12, 6);
        	if (etapa >= 345)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 346)
        	g.fillRect(624, 369, 12, 6);
        	if (etapa >= 347)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 348)
        	g.fillRect(642, 363, 12, 6);
        	if (etapa >= 349)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 350)
        	g.fillRect(654, 363, 12, 6);
        	if (etapa >= 351)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 352)
        	g.fillRect(666, 363, 12, 6);
        	if (etapa >= 353)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 354)
        	g.fillRect(636, 369, 12, 6);
        	if (etapa >= 355)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 356)
        	g.fillRect(648, 369, 12, 6);
        	if (etapa >= 357)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 358)
        	g.fillRect(660, 369, 12, 6);
        	if (etapa >= 359)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 360)
        	g.fillRect(678, 363, 12, 6);
        	if (etapa >= 361)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 362)
        	g.fillRect(690, 363, 12, 6);
        	if (etapa >= 363)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 364)
        	g.fillRect(702, 363, 12, 6);
        	if (etapa >= 365)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 366)
        	g.fillRect(672, 369, 12, 6);
        	if (etapa >= 367)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 368)
        	g.fillRect(684, 369, 12, 6);
        	if (etapa >= 369)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 370)
        	g.fillRect(696, 369, 12, 6);
        	if (etapa >= 371)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 372)
        	g.fillRect(714, 363, 12, 6);
        	if (etapa >= 373)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 374)
        	g.fillRect(726, 363, 12, 6);
        	if (etapa >= 375)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 376)
        	g.fillRect(738, 363, 12, 6);
        	if (etapa >= 377)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 378)
        	g.fillRect(708, 369, 12, 6);
        	if (etapa >= 379)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 380)
        	g.fillRect(720, 369, 12, 6);
        	if (etapa >= 381)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 382)
        	g.fillRect(732, 369, 12, 6);
        	if (etapa >= 383)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 384)
        	g.fillRect(750, 363, 12, 6);
        	if (etapa >= 385)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 386)
        	g.fillRect(762, 363, 12, 6);
        	if (etapa >= 387)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 388)
        	g.fillRect(774, 363, 12, 6);
        	if (etapa >= 389)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 390)
        	g.fillRect(756, 369, 12, 6);
        	if (etapa >= 391)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 392)
        	g.fillRect(768, 369, 12, 6);
        	if (etapa >= 393)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 394)
        	g.fillRect(780, 369, 12, 6);
        	if (etapa >= 395)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 396)
        	g.fillRect(570, 375, 12, 6);
        	if (etapa >= 397)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 398)
        	g.fillRect(582, 375, 12, 6);
        	if (etapa >= 399)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 400)
        	g.fillRect(594, 375, 12, 6);
        	if (etapa >= 401)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 402)
        	g.fillRect(564, 381, 12, 6);
        	if (etapa >= 403)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 404)
        	g.fillRect(576, 381, 12, 6);
        	if (etapa >= 405)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 406)
        	g.fillRect(588, 381, 12, 6);
        	if (etapa >= 407)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 408)
        	g.fillRect(606, 375, 12, 6);
        	if (etapa >= 409)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 410)
        	g.fillRect(618, 375, 12, 6);
        	if (etapa >= 411)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 412)
        	g.fillRect(630, 375, 12, 6);
        	if (etapa >= 413)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 414)
        	g.fillRect(600, 381, 12, 6);
        	if (etapa >= 415)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 416)
        	g.fillRect(612, 381, 12, 6);
        	if (etapa >= 417)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 418)
        	g.fillRect(624, 381, 12, 6);
        	if (etapa >= 419)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 420)
        	g.fillRect(642, 375, 12, 6);
        	if (etapa >= 421)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 422)
        	g.fillRect(654, 375, 12, 6);
        	if (etapa >= 423)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 424)
        	g.fillRect(666, 375, 12, 6);
        	if (etapa >= 425)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 426)
        	g.fillRect(636, 381, 12, 6);
        	if (etapa >= 427)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 428)
        	g.fillRect(648, 381, 12, 6);
        	if (etapa >= 429)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 430)
        	g.fillRect(660, 381, 12, 6);
        	if (etapa >= 431)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 432)
        	g.fillRect(678, 375, 12, 6);
        	if (etapa >= 433)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 434)
        	g.fillRect(690, 375, 12, 6);
        	if (etapa >= 435)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 436)
        	g.fillRect(702, 375, 12, 6);
        	if (etapa >= 437)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 438)
        	g.fillRect(672, 381, 12, 6);
        	if (etapa >= 439)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 440)
        	g.fillRect(684, 381, 12, 6);
        	if (etapa >= 441)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 442)
        	g.fillRect(696, 381, 12, 6);
        	if (etapa >= 443)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 444)
        	g.fillRect(714, 375, 12, 6);
        	if (etapa >= 445)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 446)
        	g.fillRect(726, 375, 12, 6);
        	if (etapa >= 447)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 448)
        	g.fillRect(738, 375, 12, 6);
        	if (etapa >= 449)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 450)
        	g.fillRect(708, 381, 12, 6);
        	if (etapa >= 451)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 452)
        	g.fillRect(720, 381, 12, 6);
        	if (etapa >= 453)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 454)
        	g.fillRect(732, 381, 12, 6);
        	if (etapa >= 455)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 456)
        	g.fillRect(750, 375, 12, 6);
        	if (etapa >= 457)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 458)
        	g.fillRect(762, 375, 12, 6);
        	if (etapa >= 459)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 460)
        	g.fillRect(774, 375, 12, 6);
        	if (etapa >= 461)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 462)
        	g.fillRect(756, 381, 12, 6);
        	if (etapa >= 463)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 464)
        	g.fillRect(768, 381, 12, 6);
        	if (etapa >= 465)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 466)
        	g.fillRect(780, 381, 12, 6);
        	if (etapa >= 467)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 468)
        	g.fillRect(570, 387, 12, 6);
        	if (etapa >= 469)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 470)
        	g.fillRect(582, 387, 12, 6);
        	if (etapa >= 471)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 472)
        	g.fillRect(594, 387, 12, 6);
        	if (etapa >= 473)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 474)
        	g.fillRect(564, 393, 12, 6);
        	if (etapa >= 475)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 476)
        	g.fillRect(576, 393, 12, 6);
        	if (etapa >= 477)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 478)
        	g.fillRect(588, 393, 12, 6);
        	if (etapa >= 479)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 480)
        	g.fillRect(606, 387, 12, 6);
        	if (etapa >= 481)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 482)
        	g.fillRect(618, 387, 12, 6);
        	if (etapa >= 483)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 484)
        	g.fillRect(630, 387, 12, 6);
        	if (etapa >= 485)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 486)
        	g.fillRect(600, 393, 12, 6);
        	if (etapa >= 487)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 488)
        	g.fillRect(612, 393, 12, 6);
        	if (etapa >= 489)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 490)
        	g.fillRect(624, 393, 12, 6);
        	if (etapa >= 491)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 492)
        	g.fillRect(642, 387, 12, 6);
        	if (etapa >= 493)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 494)
        	g.fillRect(654, 387, 12, 6);
        	if (etapa >= 495)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 496)
        	g.fillRect(666, 387, 12, 6);
        	if (etapa >= 497)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 498)
        	g.fillRect(636, 393, 12, 6);
        	if (etapa >= 499)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 500)
        	g.fillRect(648, 393, 12, 6);
        	if (etapa >= 501)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 502)
        	g.fillRect(660, 393, 12, 6);
        	if (etapa >= 503)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 504)
        	g.fillRect(678, 387, 12, 6);
        	if (etapa >= 505)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 506)
        	g.fillRect(690, 387, 12, 6);
        	if (etapa >= 507)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 508)
        	g.fillRect(702, 387, 12, 6);
        	if (etapa >= 509)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 510)
        	g.fillRect(672, 393, 12, 6);
        	if (etapa >= 511)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 512)
        	g.fillRect(684, 393, 12, 6);
        	if (etapa >= 513)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 514)
        	g.fillRect(696, 393, 12, 6);
        	if (etapa >= 515)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 516)
        	g.fillRect(714, 387, 12, 6);
        	if (etapa >= 517)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 518)
        	g.fillRect(726, 387, 12, 6);
        	if (etapa >= 519)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 520)
        	g.fillRect(738, 387, 12, 6);
        	if (etapa >= 521)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 522)
        	g.fillRect(708, 393, 12, 6);
        	if (etapa >= 523)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 524)
        	g.fillRect(720, 393, 12, 6);
        	if (etapa >= 525)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 526)
        	g.fillRect(732, 393, 12, 6);
        	if (etapa >= 527)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 528)
        	g.fillRect(750, 387, 12, 6);
        	if (etapa >= 529)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 530)
        	g.fillRect(762, 387, 12, 6);
        	if (etapa >= 531)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 532)
        	g.fillRect(774, 387, 12, 6);
        	if (etapa >= 533)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 534)
        	g.fillRect(756, 393, 12, 6);
        	if (etapa >= 535)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 536)
        	g.fillRect(768, 393, 12, 6);
        	if (etapa >= 537)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 538)
        	g.fillRect(780, 393, 12, 6);
        	if (etapa >= 539)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 540)
        	g.fillRect(570, 399, 12, 6);
        	if (etapa >= 541)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 542)
        	g.fillRect(582, 399, 12, 6);
        	if (etapa >= 543)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 544)
        	g.fillRect(594, 399, 12, 6);
        	if (etapa >= 545)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 546)
        	g.fillRect(564, 405, 12, 6);
        	if (etapa >= 547)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 548)
        	g.fillRect(576, 405, 12, 6);
        	if (etapa >= 549)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 550)
        	g.fillRect(588, 405, 12, 6);
        	if (etapa >= 551)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 552)
        	g.fillRect(606, 399, 12, 6);
        	if (etapa >= 553)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 554)
        	g.fillRect(618, 399, 12, 6);
        	if (etapa >= 555)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 556)
        	g.fillRect(630, 399, 12, 6);
        	if (etapa >= 557)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 558)
        	g.fillRect(600, 405, 12, 6);
        	if (etapa >= 559)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 560)
        	g.fillRect(612, 405, 12, 6);
        	if (etapa >= 561)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 562)
        	g.fillRect(624, 405, 12, 6);
        	if (etapa >= 563)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 564)
        	g.fillRect(642, 399, 12, 6);
        	if (etapa >= 565)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 566)
        	g.fillRect(654, 399, 12, 6);
        	if (etapa >= 567)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 568)
        	g.fillRect(666, 399, 12, 6);
        	if (etapa >= 569)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 570)
        	g.fillRect(636, 405, 12, 6);
        	if (etapa >= 571)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 572)
        	g.fillRect(648, 405, 12, 6);
        	if (etapa >= 573)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 574)
        	g.fillRect(660, 405, 12, 6);
        	if (etapa >= 575)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 576)
        	g.fillRect(678, 399, 12, 6);
        	if (etapa >= 577)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 578)
        	g.fillRect(690, 399, 12, 6);
        	if (etapa >= 579)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 580)
        	g.fillRect(702, 399, 12, 6);
        	if (etapa >= 581)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 582)
        	g.fillRect(672, 405, 12, 6);
        	if (etapa >= 583)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 584)
        	g.fillRect(684, 405, 12, 6);
        	if (etapa >= 585)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 586)
        	g.fillRect(696, 405, 12, 6);
        	if (etapa >= 587)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 588)
        	g.fillRect(714, 399, 12, 6);
        	if (etapa >= 589)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 590)
        	g.fillRect(726, 399, 12, 6);
        	if (etapa >= 591)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 592)
        	g.fillRect(738, 399, 12, 6);
        	if (etapa >= 593)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 594)
        	g.fillRect(708, 405, 12, 6);
        	if (etapa >= 595)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 596)
        	g.fillRect(720, 405, 12, 6);
        	if (etapa >= 597)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 598)
        	g.fillRect(732, 405, 12, 6);
        	if (etapa >= 599)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 600)
        	g.fillRect(750, 399, 12, 6);
        	if (etapa >= 601)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 602)
        	g.fillRect(762, 399, 12, 6);
        	if (etapa >= 603)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 604)
        	g.fillRect(774, 399, 12, 6);
        	if (etapa >= 605)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 606)
        	g.fillRect(756, 405, 12, 6);
        	if (etapa >= 607)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 608)
        	g.fillRect(768, 405, 12, 6);
        	if (etapa >= 609)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 610)
        	g.fillRect(780, 405, 12, 6);
        	if (etapa >= 611)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 612)
        	g.fillRect(570, 411, 12, 6);
        	if (etapa >= 613)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 614)
        	g.fillRect(582, 411, 12, 6);
        	if (etapa >= 615)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 616)
        	g.fillRect(594, 411, 12, 6);
        	if (etapa >= 617)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 618)
        	g.fillRect(564, 417, 12, 6);
        	if (etapa >= 619)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 620)
        	g.fillRect(576, 417, 12, 6);
        	if (etapa >= 621)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 622)
        	g.fillRect(588, 417, 12, 6);
        	if (etapa >= 623)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 624)
        	g.fillRect(606, 411, 12, 6);
        	if (etapa >= 625)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 626)
        	g.fillRect(618, 411, 12, 6);
        	if (etapa >= 627)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 628)
        	g.fillRect(630, 411, 12, 6);
        	if (etapa >= 629)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 630)
        	g.fillRect(600, 417, 12, 6);
        	if (etapa >= 631)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 632)
        	g.fillRect(612, 417, 12, 6);
        	if (etapa >= 633)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 634)
        	g.fillRect(624, 417, 12, 6);
        	if (etapa >= 635)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 636)
        	g.fillRect(642, 411, 12, 6);
        	if (etapa >= 637)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 638)
        	g.fillRect(654, 411, 12, 6);
        	if (etapa >= 639)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 640)
        	g.fillRect(666, 411, 12, 6);
        	if (etapa >= 641)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 642)
        	g.fillRect(636, 417, 12, 6);
        	if (etapa >= 643)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 644)
        	g.fillRect(648, 417, 12, 6);
        	if (etapa >= 645)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 646)
        	g.fillRect(660, 417, 12, 6);
        	if (etapa >= 647)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 648)
        	g.fillRect(678, 411, 12, 6);
        	if (etapa >= 649)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 650)
        	g.fillRect(690, 411, 12, 6);
        	if (etapa >= 651)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 652)
        	g.fillRect(702, 411, 12, 6);
        	if (etapa >= 653)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 654)
        	g.fillRect(672, 417, 12, 6);
        	if (etapa >= 655)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 656)
        	g.fillRect(684, 417, 12, 6);
        	if (etapa >= 657)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 658)
        	g.fillRect(696, 417, 12, 6);
        	if (etapa >= 659)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 660)
        	g.fillRect(714, 411, 12, 6);
        	if (etapa >= 661)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 662)
        	g.fillRect(726, 411, 12, 6);
        	if (etapa >= 663)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 664)
        	g.fillRect(738, 411, 12, 6);
        	if (etapa >= 665)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 666)
        	g.fillRect(708, 417, 12, 6);
        	if (etapa >= 667)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 668)
        	g.fillRect(720, 417, 12, 6);
        	if (etapa >= 669)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 670)
        	g.fillRect(732, 417, 12, 6);
        	if (etapa >= 671)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 672)
        	g.fillRect(750, 411, 12, 6);
        	if (etapa >= 673)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 674)
        	g.fillRect(762, 411, 12, 6);
        	if (etapa >= 675)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 676)
        	g.fillRect(774, 411, 12, 6);
        	if (etapa >= 677)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 678)
        	g.fillRect(756, 417, 12, 6);
        	if (etapa >= 679)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 680)
        	g.fillRect(768, 417, 12, 6);
        	if (etapa >= 681)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 682)
        	g.fillRect(780, 417, 12, 6);
        	if (etapa >= 683)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 684)
        	g.fillRect(570, 423, 12, 6);
        	if (etapa >= 685)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 686)
        	g.fillRect(582, 423, 12, 6);
        	if (etapa >= 687)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 688)
        	g.fillRect(594, 423, 12, 6);
        	if (etapa >= 689)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 690)
        	g.fillRect(564, 429, 12, 6);
        	if (etapa >= 691)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 692)
        	g.fillRect(576, 429, 12, 6);
        	if (etapa >= 693)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 694)
        	g.fillRect(588, 429, 12, 6);
        	if (etapa >= 695)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 696)
        	g.fillRect(606, 423, 12, 6);
        	if (etapa >= 697)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 698)
        	g.fillRect(618, 423, 12, 6);
        	if (etapa >= 699)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 700)
        	g.fillRect(630, 423, 12, 6);
        	if (etapa >= 701)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 702)
        	g.fillRect(600, 429, 12, 6);
        	if (etapa >= 703)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 704)
        	g.fillRect(612, 429, 12, 6);
        	if (etapa >= 705)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 706)
        	g.fillRect(624, 429, 12, 6);
        	if (etapa >= 707)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 708)
        	g.fillRect(642, 423, 12, 6);
        	if (etapa >= 709)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 710)
        	g.fillRect(654, 423, 12, 6);
        	if (etapa >= 711)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 712)
        	g.fillRect(666, 423, 12, 6);
        	if (etapa >= 713)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 714)
        	g.fillRect(636, 429, 12, 6);
        	if (etapa >= 715)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 716)
        	g.fillRect(648, 429, 12, 6);
        	if (etapa >= 717)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 718)
        	g.fillRect(660, 429, 12, 6);
        	if (etapa >= 719)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 720)
        	g.fillRect(678, 423, 12, 6);
        	if (etapa >= 721)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 722)
        	g.fillRect(690, 423, 12, 6);
        	if (etapa >= 723)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 724)
        	g.fillRect(702, 423, 12, 6);
        	if (etapa >= 725)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 726)
        	g.fillRect(672, 429, 12, 6);
        	if (etapa >= 727)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 728)
        	g.fillRect(684, 429, 12, 6);
        	if (etapa >= 729)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 730)
        	g.fillRect(696, 429, 12, 6);
        	if (etapa >= 731)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 732)
        	g.fillRect(714, 423, 12, 6);
        	if (etapa >= 733)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 734)
        	g.fillRect(726, 423, 12, 6);
        	if (etapa >= 735)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 736)
        	g.fillRect(738, 423, 12, 6);
        	if (etapa >= 737)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 738)
        	g.fillRect(708, 429, 12, 6);
        	if (etapa >= 739)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 740)
        	g.fillRect(720, 429, 12, 6);
        	if (etapa >= 741)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 742)
        	g.fillRect(732, 429, 12, 6);
        	if (etapa >= 743)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 744)
        	g.fillRect(750, 423, 12, 6);
        	if (etapa >= 745)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 746)
        	g.fillRect(762, 423, 12, 6);
        	if (etapa >= 747)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 748)
        	g.fillRect(774, 423, 12, 6);
        	if (etapa >= 749)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 750)
        	g.fillRect(756, 429, 12, 6);
        	if (etapa >= 751)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 752)
        	g.fillRect(768, 429, 12, 6);
        	if (etapa >= 753)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 754)
        	g.fillRect(780, 429, 12, 6);
        	if (etapa >= 755)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 756)
        	g.fillRect(570, 435, 12, 6);
        	if (etapa >= 757)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 758)
        	g.fillRect(582, 435, 12, 6);
        	if (etapa >= 759)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 760)
        	g.fillRect(594, 435, 12, 6);
        	if (etapa >= 761)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 762)
        	g.fillRect(564, 441, 12, 6);
        	if (etapa >= 763)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 764)
        	g.fillRect(576, 441, 12, 6);
        	if (etapa >= 765)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 766)
        	g.fillRect(588, 441, 12, 6);
        	if (etapa >= 767)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 768)
        	g.fillRect(606, 435, 12, 6);
        	if (etapa >= 769)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 770)
        	g.fillRect(618, 435, 12, 6);
        	if (etapa >= 771)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 772)
        	g.fillRect(630, 435, 12, 6);
        	if (etapa >= 773)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 774)
        	g.fillRect(600, 441, 12, 6);
        	if (etapa >= 775)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 776)
        	g.fillRect(612, 441, 12, 6);
        	if (etapa >= 777)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 778)
        	g.fillRect(624, 441, 12, 6);
        	if (etapa >= 779)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 780)
        	g.fillRect(642, 435, 12, 6);
        	if (etapa >= 781)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 782)
        	g.fillRect(654, 435, 12, 6);
        	if (etapa >= 783)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 784)
        	g.fillRect(666, 435, 12, 6);
        	if (etapa >= 785)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 786)
        	g.fillRect(636, 441, 12, 6);
        	if (etapa >= 787)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 788)
        	g.fillRect(648, 441, 12, 6);
        	if (etapa >= 789)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 790)
        	g.fillRect(660, 441, 12, 6);
        	if (etapa >= 791)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 792)
        	g.fillRect(678, 435, 12, 6);
        	if (etapa >= 793)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 794)
        	g.fillRect(690, 435, 12, 6);
        	if (etapa >= 795)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 796)
        	g.fillRect(702, 435, 12, 6);
        	if (etapa >= 797)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 798)
        	g.fillRect(672, 441, 12, 6);
        	if (etapa >= 799)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 800)
        	g.fillRect(684, 441, 12, 6);
        	if (etapa >= 801)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 802)
        	g.fillRect(696, 441, 12, 6);
        	if (etapa >= 803)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 804)
        	g.fillRect(714, 435, 12, 6);
        	if (etapa >= 805)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 806)
        	g.fillRect(726, 435, 12, 6);
        	if (etapa >= 807)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 808)
        	g.fillRect(738, 435, 12, 6);
        	if (etapa >= 809)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 810)
        	g.fillRect(708, 441, 12, 6);
        	if (etapa >= 811)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 812)
        	g.fillRect(720, 441, 12, 6);
        	if (etapa >= 813)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 814)
        	g.fillRect(732, 441, 12, 6);
        	if (etapa >= 815)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 816)
        	g.fillRect(750, 435, 12, 6);
        	if (etapa >= 817)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 818)
        	g.fillRect(762, 435, 12, 6);
        	if (etapa >= 819)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 820)
        	g.fillRect(774, 435, 12, 6);
        	if (etapa >= 821)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 822)
        	g.fillRect(756, 441, 12, 6);
        	if (etapa >= 823)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 824)
        	g.fillRect(768, 441, 12, 6);
        	if (etapa >= 825)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 826)
        	g.fillRect(780, 441, 12, 6);
        	if (etapa >= 827)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 828)
        	g.fillRect(570, 447, 12, 6);
        	if (etapa >= 829)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 830)
        	g.fillRect(582, 447, 12, 6);
        	if (etapa >= 831)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 832)
        	g.fillRect(594, 447, 12, 6);
        	if (etapa >= 833)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 834)
        	g.fillRect(564, 453, 12, 6);
        	if (etapa >= 835)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 836)
        	g.fillRect(576, 453, 12, 6);
        	if (etapa >= 837)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 838)
        	g.fillRect(588, 453, 12, 6);
        	if (etapa >= 839)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 840)
        	g.fillRect(606, 447, 12, 6);
        	if (etapa >= 841)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 842)
        	g.fillRect(618, 447, 12, 6);
        	if (etapa >= 843)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 844)
        	g.fillRect(630, 447, 12, 6);
        	if (etapa >= 845)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 846)
        	g.fillRect(600, 453, 12, 6);
        	if (etapa >= 847)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 848)
        	g.fillRect(612, 453, 12, 6);
        	if (etapa >= 849)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 850)
        	g.fillRect(624, 453, 12, 6);
        	if (etapa >= 851)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 852)
        	g.fillRect(642, 447, 12, 6);
        	if (etapa >= 853)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 854)
        	g.fillRect(654, 447, 12, 6);
        	if (etapa >= 855)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 856)
        	g.fillRect(666, 447, 12, 6);
        	if (etapa >= 857)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 858)
        	g.fillRect(636, 453, 12, 6);
        	if (etapa >= 859)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 860)
        	g.fillRect(648, 453, 12, 6);
        	if (etapa >= 861)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 862)
        	g.fillRect(660, 453, 12, 6);
        	if (etapa >= 863)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 864)
        	g.fillRect(678, 447, 12, 6);
        	if (etapa >= 865)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 866)
        	g.fillRect(690, 447, 12, 6);
        	if (etapa >= 867)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 868)
        	g.fillRect(702, 447, 12, 6);
        	if (etapa >= 869)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 870)
        	g.fillRect(672, 453, 12, 6);
        	if (etapa >= 871)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 872)
        	g.fillRect(684, 453, 12, 6);
        	if (etapa >= 873)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 874)
        	g.fillRect(696, 453, 12, 6);
        	if (etapa >= 875)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 876)
        	g.fillRect(714, 447, 12, 6);
        	if (etapa >= 877)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 878)
        	g.fillRect(726, 447, 12, 6);
        	if (etapa >= 879)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 880)
        	g.fillRect(738, 447, 12, 6);
        	if (etapa >= 881)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 882)
        	g.fillRect(708, 453, 12, 6);
        	if (etapa >= 883)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 884)
        	g.fillRect(720, 453, 12, 6);
        	if (etapa >= 885)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 886)
        	g.fillRect(732, 453, 12, 6);
        	if (etapa >= 887)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 888)
        	g.fillRect(750, 447, 12, 6);
        	if (etapa >= 889)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 890)
        	g.fillRect(762, 447, 12, 6);
        	if (etapa >= 891)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 892)
        	g.fillRect(774, 447, 12, 6);
        	if (etapa >= 893)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 894)
        	g.fillRect(756, 453, 12, 6);
        	if (etapa >= 895)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 896)
        	g.fillRect(768, 453, 12, 6);
        	if (etapa >= 897)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 898)
        	g.fillRect(780, 453, 12, 6);
        	if (etapa >= 899)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 900)
        	g.fillRect(570, 459, 12, 6);
        	if (etapa >= 901)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 902)
        	g.fillRect(582, 459, 12, 6);
        	if (etapa >= 903)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 904)
        	g.fillRect(594, 459, 12, 6);
        	if (etapa >= 905)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 906)
        	g.fillRect(564, 465, 12, 6);
        	if (etapa >= 907)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 908)
        	g.fillRect(576, 465, 12, 6);
        	if (etapa >= 909)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 910)
        	g.fillRect(588, 465, 12, 6);
        	if (etapa >= 911)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 912)
        	g.fillRect(606, 459, 12, 6);
        	if (etapa >= 913)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 914)
        	g.fillRect(618, 459, 12, 6);
        	if (etapa >= 915)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 916)
        	g.fillRect(630, 459, 12, 6);
        	if (etapa >= 917)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 918)
        	g.fillRect(600, 465, 12, 6);
        	if (etapa >= 919)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 920)
        	g.fillRect(612, 465, 12, 6);
        	if (etapa >= 921)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 922)
        	g.fillRect(624, 465, 12, 6);
        	if (etapa >= 923)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 924)
        	g.fillRect(642, 459, 12, 6);
        	if (etapa >= 925)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 926)
        	g.fillRect(654, 459, 12, 6);
        	if (etapa >= 927)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 928)
        	g.fillRect(666, 459, 12, 6);
        	if (etapa >= 929)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 930)
        	g.fillRect(636, 465, 12, 6);
        	if (etapa >= 931)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 932)
        	g.fillRect(648, 465, 12, 6);
        	if (etapa >= 933)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 934)
        	g.fillRect(660, 465, 12, 6);
        	if (etapa >= 935)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 936)
        	g.fillRect(678, 459, 12, 6);
        	if (etapa >= 937)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 938)
        	g.fillRect(690, 459, 12, 6);
        	if (etapa >= 939)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 940)
        	g.fillRect(702, 459, 12, 6);
        	if (etapa >= 941)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 942)
        	g.fillRect(672, 465, 12, 6);
        	if (etapa >= 943)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 944)
        	g.fillRect(684, 465, 12, 6);
        	if (etapa >= 945)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 946)
        	g.fillRect(696, 465, 12, 6);
        	if (etapa >= 947)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 948)
        	g.fillRect(714, 459, 12, 6);
        	if (etapa >= 949)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 950)
        	g.fillRect(726, 459, 12, 6);
        	if (etapa >= 951)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 952)
        	g.fillRect(738, 459, 12, 6);
        	if (etapa >= 953)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 954)
        	g.fillRect(708, 465, 12, 6);
        	if (etapa >= 955)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 956)
        	g.fillRect(720, 465, 12, 6);
        	if (etapa >= 957)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 958)
        	g.fillRect(732, 465, 12, 6);
        	if (etapa >= 959)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 960)
        	g.fillRect(750, 459, 12, 6);
        	if (etapa >= 961)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 962)
        	g.fillRect(762, 459, 12, 6);
        	if (etapa >= 963)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 964)
        	g.fillRect(774, 459, 12, 6);
        	if (etapa >= 965)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 966)
        	g.fillRect(756, 465, 12, 6);
        	if (etapa >= 967)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 968)
        	g.fillRect(768, 465, 12, 6);
        	if (etapa >= 969)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 970)
        	g.fillRect(780, 465, 12, 6);
        	if (etapa >= 971)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 972)
        	g.fillRect(570, 471, 12, 6);
        	if (etapa >= 973)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 974)
        	g.fillRect(582, 471, 12, 6);
        	if (etapa >= 975)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 976)
        	g.fillRect(594, 471, 12, 6);
        	if (etapa >= 977)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 978)
        	g.fillRect(564, 477, 12, 6);
        	if (etapa >= 979)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 980)
        	g.fillRect(576, 477, 12, 6);
        	if (etapa >= 981)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 982)
        	g.fillRect(588, 477, 12, 6);
        	if (etapa >= 983)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 984)
        	g.fillRect(606, 471, 12, 6);
        	if (etapa >= 985)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 986)
        	g.fillRect(618, 471, 12, 6);
        	if (etapa >= 987)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 988)
        	g.fillRect(630, 471, 12, 6);
        	if (etapa >= 989)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 990)
        	g.fillRect(600, 477, 12, 6);
        	if (etapa >= 991)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 992)
        	g.fillRect(612, 477, 12, 6);
        	if (etapa >= 993)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 994)
        	g.fillRect(624, 477, 12, 6);
        	if (etapa >= 995)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 996)
        	g.fillRect(642, 471, 12, 6);
        	if (etapa >= 997)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 998)
        	g.fillRect(654, 471, 12, 6);
        	if (etapa >= 999)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1000)
        	g.fillRect(666, 471, 12, 6);
        	if (etapa >= 1001)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1002)
        	g.fillRect(636, 477, 12, 6);
        	if (etapa >= 1003)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1004)
        	g.fillRect(648, 477, 12, 6);
        	if (etapa >= 1005)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1006)
        	g.fillRect(660, 477, 12, 6);
        	if (etapa >= 1007)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1008)
        	g.fillRect(678, 471, 12, 6);
        	if (etapa >= 1009)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1010)
        	g.fillRect(690, 471, 12, 6);
        	if (etapa >= 1011)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1012)
        	g.fillRect(702, 471, 12, 6);
        	if (etapa >= 1013)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1014)
        	g.fillRect(672, 477, 12, 6);
        	if (etapa >= 1015)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1016)
        	g.fillRect(684, 477, 12, 6);
        	if (etapa >= 1017)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1018)
        	g.fillRect(696, 477, 12, 6);
        	if (etapa >= 1019)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1020)
        	g.fillRect(714, 471, 12, 6);
        	if (etapa >= 1021)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1022)
        	g.fillRect(726, 471, 12, 6);
        	if (etapa >= 1023)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1024)
        	g.fillRect(738, 471, 12, 6);
        	if (etapa >= 1025)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1026)
        	g.fillRect(708, 477, 12, 6);
        	if (etapa >= 1027)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1028)
        	g.fillRect(720, 477, 12, 6);
        	if (etapa >= 1029)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1030)
        	g.fillRect(732, 477, 12, 6);
        	if (etapa >= 1031)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1032)
        	g.fillRect(750, 471, 12, 6);
        	if (etapa >= 1033)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1034)
        	g.fillRect(762, 471, 12, 6);
        	if (etapa >= 1035)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1036)
        	g.fillRect(774, 471, 12, 6);
        	if (etapa >= 1037)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1038)
        	g.fillRect(756, 477, 12, 6);
        	if (etapa >= 1039)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1040)
        	g.fillRect(768, 477, 12, 6);
        	if (etapa >= 1041)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1042)
        	g.fillRect(780, 477, 12, 6);
        	if (etapa >= 1043)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1044)
        	g.fillRect(570, 483, 12, 6);
        	if (etapa >= 1045)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1046)
        	g.fillRect(582, 483, 12, 6);
        	if (etapa >= 1047)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1048)
        	g.fillRect(594, 483, 12, 6);
        	if (etapa >= 1049)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1050)
        	g.fillRect(564, 489, 12, 6);
        	if (etapa >= 1051)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1052)
        	g.fillRect(576, 489, 12, 6);
        	if (etapa >= 1053)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1054)
        	g.fillRect(588, 489, 12, 6);
        	if (etapa >= 1055)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1056)
        	g.fillRect(606, 483, 12, 6);
        	if (etapa >= 1057)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1058)
        	g.fillRect(618, 483, 12, 6);
        	if (etapa >= 1059)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1060)
        	g.fillRect(630, 483, 12, 6);
        	if (etapa >= 1061)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1062)
        	g.fillRect(600, 489, 12, 6);
        	if (etapa >= 1063)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1064)
        	g.fillRect(612, 489, 12, 6);
        	if (etapa >= 1065)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1066)
        	g.fillRect(624, 489, 12, 6);
        	if (etapa >= 1067)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1068)
        	g.fillRect(642, 483, 12, 6);
        	if (etapa >= 1069)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1070)
        	g.fillRect(654, 483, 12, 6);
        	if (etapa >= 1071)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1072)
        	g.fillRect(666, 483, 12, 6);
        	if (etapa >= 1073)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1074)
        	g.fillRect(636, 489, 12, 6);
        	if (etapa >= 1075)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1076)
        	g.fillRect(648, 489, 12, 6);
        	if (etapa >= 1077)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1078)
        	g.fillRect(660, 489, 12, 6);
        	if (etapa >= 1079)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1080)
        	g.fillRect(678, 483, 12, 6);
        	if (etapa >= 1081)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1082)
        	g.fillRect(690, 483, 12, 6);
        	if (etapa >= 1083)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1084)
        	g.fillRect(702, 483, 12, 6);
        	if (etapa >= 1085)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1086)
        	g.fillRect(672, 489, 12, 6);
        	if (etapa >= 1087)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1088)
        	g.fillRect(684, 489, 12, 6);
        	if (etapa >= 1089)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1090)
        	g.fillRect(696, 489, 12, 6);
        	if (etapa >= 1091)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1092)
        	g.fillRect(714, 483, 12, 6);
        	if (etapa >= 1093)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1094)
        	g.fillRect(726, 483, 12, 6);
        	if (etapa >= 1095)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1096)
        	g.fillRect(738, 483, 12, 6);
        	if (etapa >= 1097)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1098)
        	g.fillRect(708, 489, 12, 6);
        	if (etapa >= 1099)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1100)
        	g.fillRect(720, 489, 12, 6);
        	if (etapa >= 1101)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1102)
        	g.fillRect(732, 489, 12, 6);
        	if (etapa >= 1103)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1104)
        	g.fillRect(750, 483, 12, 6);
        	if (etapa >= 1105)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1106)
        	g.fillRect(762, 483, 12, 6);
        	if (etapa >= 1107)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1108)
        	g.fillRect(774, 483, 12, 6);
        	if (etapa >= 1109)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1110)
        	g.fillRect(756, 489, 12, 6);
        	if (etapa >= 1111)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1112)
        	g.fillRect(768, 489, 12, 6);
        	if (etapa >= 1113)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1114)
        	g.fillRect(780, 489, 12, 6);
        	if (etapa >= 1115)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1116)
        	g.fillRect(570, 495, 12, 6);
        	if (etapa >= 1117)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1118)
        	g.fillRect(582, 495, 12, 6);
        	if (etapa >= 1119)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1120)
        	g.fillRect(594, 495, 12, 6);
        	if (etapa >= 1121)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1122)
        	g.fillRect(564, 501, 12, 6);
        	if (etapa >= 1123)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1124)
        	g.fillRect(576, 501, 12, 6);
        	if (etapa >= 1125)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1126)
        	g.fillRect(588, 501, 12, 6);
        	if (etapa >= 1127)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1128)
        	g.fillRect(606, 495, 12, 6);
        	if (etapa >= 1129)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1130)
        	g.fillRect(618, 495, 12, 6);
        	if (etapa >= 1131)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1132)
        	g.fillRect(630, 495, 12, 6);
        	if (etapa >= 1133)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1134)
        	g.fillRect(600, 501, 12, 6);
        	if (etapa >= 1135)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1136)
        	g.fillRect(612, 501, 12, 6);
        	if (etapa >= 1137)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1138)
        	g.fillRect(624, 501, 12, 6);
        	if (etapa >= 1139)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1140)
        	g.fillRect(642, 495, 12, 6);
        	if (etapa >= 1141)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1142)
        	g.fillRect(654, 495, 12, 6);
        	if (etapa >= 1143)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1144)
        	g.fillRect(666, 495, 12, 6);
        	if (etapa >= 1145)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1146)
        	g.fillRect(636, 501, 12, 6);
        	if (etapa >= 1147)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1148)
        	g.fillRect(648, 501, 12, 6);
        	if (etapa >= 1149)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1150)
        	g.fillRect(660, 501, 12, 6);
        	if (etapa >= 1151)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1152)
        	g.fillRect(678, 495, 12, 6);
        	if (etapa >= 1153)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1154)
        	g.fillRect(690, 495, 12, 6);
        	if (etapa >= 1155)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1156)
        	g.fillRect(702, 495, 12, 6);
        	if (etapa >= 1157)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1158)
        	g.fillRect(672, 501, 12, 6);
        	if (etapa >= 1159)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1160)
        	g.fillRect(684, 501, 12, 6);
        	if (etapa >= 1161)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1162)
        	g.fillRect(696, 501, 12, 6);
        	if (etapa >= 1163)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1164)
        	g.fillRect(714, 495, 12, 6);
        	if (etapa >= 1165)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1166)
        	g.fillRect(726, 495, 12, 6);
        	if (etapa >= 1167)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1168)
        	g.fillRect(738, 495, 12, 6);
        	if (etapa >= 1169)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1170)
        	g.fillRect(708, 501, 12, 6);
        	if (etapa >= 1171)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1172)
        	g.fillRect(720, 501, 12, 6);
        	if (etapa >= 1173)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1174)
        	g.fillRect(732, 501, 12, 6);
        	if (etapa >= 1175)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1176)
        	g.fillRect(750, 495, 12, 6);
        	if (etapa >= 1177)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1178)
        	g.fillRect(762, 495, 12, 6);
        	if (etapa >= 1179)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1180)
        	g.fillRect(774, 495, 12, 6);
        	if (etapa >= 1181)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1182)
        	g.fillRect(756, 501, 12, 6);
        	if (etapa >= 1183)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1184)
        	g.fillRect(768, 501, 12, 6);
        	if (etapa >= 1185)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1186)
        	g.fillRect(780, 501, 12, 6);
        	if (etapa >= 1187)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1188)
        	g.fillRect(570, 507, 12, 6);
        	if (etapa >= 1189)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1190)
        	g.fillRect(582, 507, 12, 6);
        	if (etapa >= 1191)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1192)
        	g.fillRect(594, 507, 12, 6);
        	if (etapa >= 1193)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1194)
        	g.fillRect(564, 513, 12, 6);
        	if (etapa >= 1195)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1196)
        	g.fillRect(576, 513, 12, 6);
        	if (etapa >= 1197)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1198)
        	g.fillRect(588, 513, 12, 6);
        	if (etapa >= 1199)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1200)
        	g.fillRect(606, 507, 12, 6);
        	if (etapa >= 1201)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1202)
        	g.fillRect(618, 507, 12, 6);
        	if (etapa >= 1203)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1204)
        	g.fillRect(630, 507, 12, 6);
        	if (etapa >= 1205)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1206)
        	g.fillRect(600, 513, 12, 6);
        	if (etapa >= 1207)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1208)
        	g.fillRect(612, 513, 12, 6);
        	if (etapa >= 1209)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1210)
        	g.fillRect(624, 513, 12, 6);
        	if (etapa >= 1211)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1212)
        	g.fillRect(642, 507, 12, 6);
        	if (etapa >= 1213)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1214)
        	g.fillRect(654, 507, 12, 6);
        	if (etapa >= 1215)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1216)
        	g.fillRect(666, 507, 12, 6);
        	if (etapa >= 1217)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1218)
        	g.fillRect(636, 513, 12, 6);
        	if (etapa >= 1219)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1220)
        	g.fillRect(648, 513, 12, 6);
        	if (etapa >= 1221)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1222)
        	g.fillRect(660, 513, 12, 6);
        	if (etapa >= 1223)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1224)
        	g.fillRect(678, 507, 12, 6);
        	if (etapa >= 1225)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1226)
        	g.fillRect(690, 507, 12, 6);
        	if (etapa >= 1227)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1228)
        	g.fillRect(702, 507, 12, 6);
        	if (etapa >= 1229)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1230)
        	g.fillRect(672, 513, 12, 6);
        	if (etapa >= 1231)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1232)
        	g.fillRect(684, 513, 12, 6);
        	if (etapa >= 1233)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1234)
        	g.fillRect(696, 513, 12, 6);
        	if (etapa >= 1235)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1236)
        	g.fillRect(714, 507, 12, 6);
        	if (etapa >= 1237)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1238)
        	g.fillRect(726, 507, 12, 6);
        	if (etapa >= 1239)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1240)
        	g.fillRect(738, 507, 12, 6);
        	if (etapa >= 1241)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1242)
        	g.fillRect(708, 513, 12, 6);
        	if (etapa >= 1243)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1244)
        	g.fillRect(720, 513, 12, 6);
        	if (etapa >= 1245)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1246)
        	g.fillRect(732, 513, 12, 6);
        	if (etapa >= 1247)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1248)
        	g.fillRect(750, 507, 12, 6);
        	if (etapa >= 1249)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1250)
        	g.fillRect(762, 507, 12, 6);
        	if (etapa >= 1251)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1252)
        	g.fillRect(774, 507, 12, 6);
        	if (etapa >= 1253)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1254)
        	g.fillRect(756, 513, 12, 6);
        	if (etapa >= 1255)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1256)
        	g.fillRect(768, 513, 12, 6);
        	if (etapa >= 1257)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1258)
        	g.fillRect(780, 513, 12, 6);
        	if (etapa >= 1259)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1260)
        	g.fillRect(570, 519, 12, 6);
        	if (etapa >= 1261)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1262)
        	g.fillRect(582, 519, 12, 6);
        	if (etapa >= 1263)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1264)
        	g.fillRect(594, 519, 12, 6);
        	if (etapa >= 1265)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1266)
        	g.fillRect(564, 525, 12, 6);
        	if (etapa >= 1267)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1268)
        	g.fillRect(576, 525, 12, 6);
        	if (etapa >= 1269)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1270)
        	g.fillRect(588, 525, 12, 6);
        	if (etapa >= 1271)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1272)
        	g.fillRect(606, 519, 12, 6);
        	if (etapa >= 1273)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1274)
        	g.fillRect(618, 519, 12, 6);
        	if (etapa >= 1275)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1276)
        	g.fillRect(630, 519, 12, 6);
        	if (etapa >= 1277)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1278)
        	g.fillRect(600, 525, 12, 6);
        	if (etapa >= 1279)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1280)
        	g.fillRect(612, 525, 12, 6);
        	if (etapa >= 1281)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1282)
        	g.fillRect(624, 525, 12, 6);
        	if (etapa >= 1283)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1284)
        	g.fillRect(642, 519, 12, 6);
        	if (etapa >= 1285)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1286)
        	g.fillRect(654, 519, 12, 6);
        	if (etapa >= 1287)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1288)
        	g.fillRect(666, 519, 12, 6);
        	if (etapa >= 1289)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1290)
        	g.fillRect(636, 525, 12, 6);
        	if (etapa >= 1291)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1292)
        	g.fillRect(648, 525, 12, 6);
        	if (etapa >= 1293)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1294)
        	g.fillRect(660, 525, 12, 6);
        	if (etapa >= 1295)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1296)
        	g.fillRect(678, 519, 12, 6);
        	if (etapa >= 1297)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1298)
        	g.fillRect(690, 519, 12, 6);
        	if (etapa >= 1299)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1300)
        	g.fillRect(702, 519, 12, 6);
        	if (etapa >= 1301)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1302)
        	g.fillRect(672, 525, 12, 6);
        	if (etapa >= 1303)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1304)
        	g.fillRect(684, 525, 12, 6);
        	if (etapa >= 1305)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1306)
        	g.fillRect(696, 525, 12, 6);
        	if (etapa >= 1307)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1308)
        	g.fillRect(714, 519, 12, 6);
        	if (etapa >= 1309)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1310)
        	g.fillRect(726, 519, 12, 6);
        	if (etapa >= 1311)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1312)
        	g.fillRect(738, 519, 12, 6);
        	if (etapa >= 1313)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1314)
        	g.fillRect(708, 525, 12, 6);
        	if (etapa >= 1315)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1316)
        	g.fillRect(720, 525, 12, 6);
        	if (etapa >= 1317)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1318)
        	g.fillRect(732, 525, 12, 6);
        	if (etapa >= 1319)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1320)
        	g.fillRect(750, 519, 12, 6);
        	if (etapa >= 1321)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1322)
        	g.fillRect(762, 519, 12, 6);
        	if (etapa >= 1323)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1324)
        	g.fillRect(774, 519, 12, 6);
        	if (etapa >= 1325)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1326)
        	g.fillRect(756, 525, 12, 6);
        	if (etapa >= 1327)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1328)
        	g.fillRect(768, 525, 12, 6);
        	if (etapa >= 1329)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1330)
        	g.fillRect(780, 525, 12, 6);
        	if (etapa >= 1331)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1332)
        	g.fillRect(570, 531, 12, 6);
        	if (etapa >= 1333)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1334)
        	g.fillRect(582, 531, 12, 6);
        	if (etapa >= 1335)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1336)
        	g.fillRect(594, 531, 12, 6);
        	if (etapa >= 1337)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1338)
        	g.fillRect(564, 537, 12, 6);
        	if (etapa >= 1339)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1340)
        	g.fillRect(576, 537, 12, 6);
        	if (etapa >= 1341)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1342)
        	g.fillRect(588, 537, 12, 6);
        	if (etapa >= 1343)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1344)
        	g.fillRect(606, 531, 12, 6);
        	if (etapa >= 1345)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1346)
        	g.fillRect(618, 531, 12, 6);
        	if (etapa >= 1347)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1348)
        	g.fillRect(630, 531, 12, 6);
        	if (etapa >= 1349)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1350)
        	g.fillRect(600, 537, 12, 6);
        	if (etapa >= 1351)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1352)
        	g.fillRect(612, 537, 12, 6);
        	if (etapa >= 1353)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1354)
        	g.fillRect(624, 537, 12, 6);
        	if (etapa >= 1355)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1356)
        	g.fillRect(642, 531, 12, 6);
        	if (etapa >= 1357)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1358)
        	g.fillRect(654, 531, 12, 6);
        	if (etapa >= 1359)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1360)
        	g.fillRect(666, 531, 12, 6);
        	if (etapa >= 1361)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1362)
        	g.fillRect(636, 537, 12, 6);
        	if (etapa >= 1363)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1364)
        	g.fillRect(648, 537, 12, 6);
        	if (etapa >= 1365)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1366)
        	g.fillRect(660, 537, 12, 6);
        	if (etapa >= 1367)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1368)
        	g.fillRect(678, 531, 12, 6);
        	if (etapa >= 1369)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1370)
        	g.fillRect(690, 531, 12, 6);
        	if (etapa >= 1371)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1372)
        	g.fillRect(702, 531, 12, 6);
        	if (etapa >= 1373)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1374)
        	g.fillRect(672, 537, 12, 6);
        	if (etapa >= 1375)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1376)
        	g.fillRect(684, 537, 12, 6);
        	if (etapa >= 1377)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1378)
        	g.fillRect(696, 537, 12, 6);
        	if (etapa >= 1379)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1380)
        	g.fillRect(714, 531, 12, 6);
        	if (etapa >= 1381)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1382)
        	g.fillRect(726, 531, 12, 6);
        	if (etapa >= 1383)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1384)
        	g.fillRect(738, 531, 12, 6);
        	if (etapa >= 1385)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1386)
        	g.fillRect(708, 537, 12, 6);
        	if (etapa >= 1387)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1388)
        	g.fillRect(720, 537, 12, 6);
        	if (etapa >= 1389)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1390)
        	g.fillRect(732, 537, 12, 6);
        	if (etapa >= 1391)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1392)
        	g.fillRect(750, 531, 12, 6);
        	if (etapa >= 1393)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1394)
        	g.fillRect(762, 531, 12, 6);
        	if (etapa >= 1395)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1396)
        	g.fillRect(774, 531, 12, 6);
        	if (etapa >= 1397)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1398)
        	g.fillRect(756, 537, 12, 6);
        	if (etapa >= 1399)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1400)
        	g.fillRect(768, 537, 12, 6);
        	if (etapa >= 1401)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1402)
        	g.fillRect(780, 537, 12, 6);
        	if (etapa >= 1403)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1404)
        	g.fillRect(570, 543, 12, 6);
        	if (etapa >= 1405)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1406)
        	g.fillRect(582, 543, 12, 6);
        	if (etapa >= 1407)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1408)
        	g.fillRect(594, 543, 12, 6);
        	if (etapa >= 1409)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1410)
        	g.fillRect(564, 549, 12, 6);
        	if (etapa >= 1411)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1412)
        	g.fillRect(576, 549, 12, 6);
        	if (etapa >= 1413)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1414)
        	g.fillRect(588, 549, 12, 6);
        	if (etapa >= 1415)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1416)
        	g.fillRect(606, 543, 12, 6);
        	if (etapa >= 1417)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1418)
        	g.fillRect(618, 543, 12, 6);
        	if (etapa >= 1419)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1420)
        	g.fillRect(630, 543, 12, 6);
        	if (etapa >= 1421)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1422)
        	g.fillRect(600, 549, 12, 6);
        	if (etapa >= 1423)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1424)
        	g.fillRect(612, 549, 12, 6);
        	if (etapa >= 1425)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1426)
        	g.fillRect(624, 549, 12, 6);
        	if (etapa >= 1427)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1428)
        	g.fillRect(642, 543, 12, 6);
        	if (etapa >= 1429)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1430)
        	g.fillRect(654, 543, 12, 6);
        	if (etapa >= 1431)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1432)
        	g.fillRect(666, 543, 12, 6);
        	if (etapa >= 1433)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1434)
        	g.fillRect(636, 549, 12, 6);
        	if (etapa >= 1435)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1436)
        	g.fillRect(648, 549, 12, 6);
        	if (etapa >= 1437)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1438)
        	g.fillRect(660, 549, 12, 6);
        	if (etapa >= 1439)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1440)
        	g.fillRect(678, 543, 12, 6);
        	if (etapa >= 1441)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1442)
        	g.fillRect(690, 543, 12, 6);
        	if (etapa >= 1443)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1444)
        	g.fillRect(702, 543, 12, 6);
        	if (etapa >= 1445)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1446)
        	g.fillRect(672, 549, 12, 6);
        	if (etapa >= 1447)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1448)
        	g.fillRect(684, 549, 12, 6);
        	if (etapa >= 1449)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1450)
        	g.fillRect(696, 549, 12, 6);
        	if (etapa >= 1451)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1452)
        	g.fillRect(714, 543, 12, 6);
        	if (etapa >= 1453)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1454)
        	g.fillRect(726, 543, 12, 6);
        	if (etapa >= 1455)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1456)
        	g.fillRect(738, 543, 12, 6);
        	if (etapa >= 1457)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1458)
        	g.fillRect(708, 549, 12, 6);
        	if (etapa >= 1459)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1460)
        	g.fillRect(720, 549, 12, 6);
        	if (etapa >= 1461)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1462)
        	g.fillRect(732, 549, 12, 6);
        	if (etapa >= 1463)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1464)
        	g.fillRect(750, 543, 12, 6);
        	if (etapa >= 1465)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1466)
        	g.fillRect(762, 543, 12, 6);
        	if (etapa >= 1467)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1468)
        	g.fillRect(774, 543, 12, 6);
        	if (etapa >= 1469)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1470)
        	g.fillRect(756, 549, 12, 6);
        	if (etapa >= 1471)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1472)
        	g.fillRect(768, 549, 12, 6);
        	if (etapa >= 1473)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1474)
        	g.fillRect(780, 549, 12, 6);
        	if (etapa >= 1475)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1476)
        	g.fillRect(570, 555, 12, 6);
        	if (etapa >= 1477)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1478)
        	g.fillRect(582, 555, 12, 6);
        	if (etapa >= 1479)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1480)
        	g.fillRect(594, 555, 12, 6);
        	if (etapa >= 1481)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1482)
        	g.fillRect(564, 561, 12, 6);
        	if (etapa >= 1483)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1484)
        	g.fillRect(576, 561, 12, 6);
        	if (etapa >= 1485)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1486)
        	g.fillRect(588, 561, 12, 6);
        	if (etapa >= 1487)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1488)
        	g.fillRect(606, 555, 12, 6);
        	if (etapa >= 1489)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1490)
        	g.fillRect(618, 555, 12, 6);
        	if (etapa >= 1491)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1492)
        	g.fillRect(630, 555, 12, 6);
        	if (etapa >= 1493)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1494)
        	g.fillRect(600, 561, 12, 6);
        	if (etapa >= 1495)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1496)
        	g.fillRect(612, 561, 12, 6);
        	if (etapa >= 1497)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1498)
        	g.fillRect(624, 561, 12, 6);
        	if (etapa >= 1499)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1500)
        	g.fillRect(642, 555, 12, 6);
        	if (etapa >= 1501)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1502)
        	g.fillRect(654, 555, 12, 6);
        	if (etapa >= 1503)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1504)
        	g.fillRect(666, 555, 12, 6);
        	if (etapa >= 1505)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1506)
        	g.fillRect(636, 561, 12, 6);
        	if (etapa >= 1507)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1508)
        	g.fillRect(648, 561, 12, 6);
        	if (etapa >= 1509)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1510)
        	g.fillRect(660, 561, 12, 6);
        	if (etapa >= 1511)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1512)
        	g.fillRect(678, 555, 12, 6);
        	if (etapa >= 1513)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1514)
        	g.fillRect(690, 555, 12, 6);
        	if (etapa >= 1515)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1516)
        	g.fillRect(702, 555, 12, 6);
        	if (etapa >= 1517)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1518)
        	g.fillRect(672, 561, 12, 6);
        	if (etapa >= 1519)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1520)
        	g.fillRect(684, 561, 12, 6);
        	if (etapa >= 1521)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1522)
        	g.fillRect(696, 561, 12, 6);
        	if (etapa >= 1523)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1524)
        	g.fillRect(714, 555, 12, 6);
        	if (etapa >= 1525)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1526)
        	g.fillRect(726, 555, 12, 6);
        	if (etapa >= 1527)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1528)
        	g.fillRect(738, 555, 12, 6);
        	if (etapa >= 1529)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1530)
        	g.fillRect(708, 561, 12, 6);
        	if (etapa >= 1531)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1532)
        	g.fillRect(720, 561, 12, 6);
        	if (etapa >= 1533)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1534)
        	g.fillRect(732, 561, 12, 6);
        	if (etapa >= 1535)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1536)
        	g.fillRect(750, 555, 12, 6);
        	if (etapa >= 1537)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1538)
        	g.fillRect(762, 555, 12, 6);
        	if (etapa >= 1539)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1540)
        	g.fillRect(774, 555, 12, 6);
        	if (etapa >= 1541)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1542)
        	g.fillRect(756, 561, 12, 6);
        	if (etapa >= 1543)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1544)
        	g.fillRect(768, 561, 12, 6);
        	if (etapa >= 1545)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1546)
        	g.fillRect(780, 561, 12, 6);
        	if (etapa >= 1547)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1548)
        	g.fillRect(570, 567, 12, 6);
        	if (etapa >= 1549)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1550)
        	g.fillRect(582, 567, 12, 6);
        	if (etapa >= 1551)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1552)
        	g.fillRect(594, 567, 12, 6);
        	if (etapa >= 1553)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1554)
        	g.fillRect(564, 573, 12, 6);
        	if (etapa >= 1555)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1556)
        	g.fillRect(576, 573, 12, 6);
        	if (etapa >= 1557)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1558)
        	g.fillRect(588, 573, 12, 6);
        	if (etapa >= 1559)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1560)
        	g.fillRect(606, 567, 12, 6);
        	if (etapa >= 1561)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1562)
        	g.fillRect(618, 567, 12, 6);
        	if (etapa >= 1563)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1564)
        	g.fillRect(630, 567, 12, 6);
        	if (etapa >= 1565)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1566)
        	g.fillRect(600, 573, 12, 6);
        	if (etapa >= 1567)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1568)
        	g.fillRect(612, 573, 12, 6);
        	if (etapa >= 1569)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1570)
        	g.fillRect(624, 573, 12, 6);
        	if (etapa >= 1571)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1572)
        	g.fillRect(642, 567, 12, 6);
        	if (etapa >= 1573)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1574)
        	g.fillRect(654, 567, 12, 6);
        	if (etapa >= 1575)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1576)
        	g.fillRect(666, 567, 12, 6);
        	if (etapa >= 1577)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1578)
        	g.fillRect(636, 573, 12, 6);
        	if (etapa >= 1579)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1580)
        	g.fillRect(648, 573, 12, 6);
        	if (etapa >= 1581)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1582)
        	g.fillRect(660, 573, 12, 6);
        	if (etapa >= 1583)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1584)
        	g.fillRect(678, 567, 12, 6);
        	if (etapa >= 1585)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1586)
        	g.fillRect(690, 567, 12, 6);
        	if (etapa >= 1587)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1588)
        	g.fillRect(702, 567, 12, 6);
        	if (etapa >= 1589)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1590)
        	g.fillRect(672, 573, 12, 6);
        	if (etapa >= 1591)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1592)
        	g.fillRect(684, 573, 12, 6);
        	if (etapa >= 1593)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1594)
        	g.fillRect(696, 573, 12, 6);
        	if (etapa >= 1595)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1596)
        	g.fillRect(714, 567, 12, 6);
        	if (etapa >= 1597)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1598)
        	g.fillRect(726, 567, 12, 6);
        	if (etapa >= 1599)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1600)
        	g.fillRect(738, 567, 12, 6);
        	if (etapa >= 1601)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1602)
        	g.fillRect(708, 573, 12, 6);
        	if (etapa >= 1603)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1604)
        	g.fillRect(720, 573, 12, 6);
        	if (etapa >= 1605)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1606)
        	g.fillRect(732, 573, 12, 6);
        	if (etapa >= 1607)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1608)
        	g.fillRect(750, 567, 12, 6);
        	if (etapa >= 1609)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1610)
        	g.fillRect(762, 567, 12, 6);
        	if (etapa >= 1611)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1612)
        	g.fillRect(774, 567, 12, 6);
        	if (etapa >= 1613)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1614)
        	g.fillRect(756, 573, 12, 6);
        	if (etapa >= 1615)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1616)
        	g.fillRect(768, 573, 12, 6);
        	if (etapa >= 1617)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1618)
        	g.fillRect(780, 573, 12, 6);
        	if (etapa >= 1619)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1620)
        	g.fillRect(570, 579, 12, 6);
        	if (etapa >= 1621)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1622)
        	g.fillRect(582, 579, 12, 6);
        	if (etapa >= 1623)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1624)
        	g.fillRect(594, 579, 12, 6);
        	if (etapa >= 1625)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1626)
        	g.fillRect(564, 585, 12, 6);
        	if (etapa >= 1627)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1628)
        	g.fillRect(576, 585, 12, 6);
        	if (etapa >= 1629)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1630)
        	g.fillRect(588, 585, 12, 6);
        	if (etapa >= 1631)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1632)
        	g.fillRect(606, 579, 12, 6);
        	if (etapa >= 1633)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1634)
        	g.fillRect(618, 579, 12, 6);
        	if (etapa >= 1635)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1636)
        	g.fillRect(630, 579, 12, 6);
        	if (etapa >= 1637)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1638)
        	g.fillRect(600, 585, 12, 6);
        	if (etapa >= 1639)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1640)
        	g.fillRect(612, 585, 12, 6);
        	if (etapa >= 1641)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1642)
        	g.fillRect(624, 585, 12, 6);
        	if (etapa >= 1643)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1644)
        	g.fillRect(642, 579, 12, 6);
        	if (etapa >= 1645)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1646)
        	g.fillRect(654, 579, 12, 6);
        	if (etapa >= 1647)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1648)
        	g.fillRect(666, 579, 12, 6);
        	if (etapa >= 1649)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1650)
        	g.fillRect(636, 585, 12, 6);
        	if (etapa >= 1651)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1652)
        	g.fillRect(648, 585, 12, 6);
        	if (etapa >= 1653)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1654)
        	g.fillRect(660, 585, 12, 6);
        	if (etapa >= 1655)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1656)
        	g.fillRect(678, 579, 12, 6);
        	if (etapa >= 1657)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1658)
        	g.fillRect(690, 579, 12, 6);
        	if (etapa >= 1659)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1660)
        	g.fillRect(702, 579, 12, 6);
        	if (etapa >= 1661)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1662)
        	g.fillRect(672, 585, 12, 6);
        	if (etapa >= 1663)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1664)
        	g.fillRect(684, 585, 12, 6);
        	if (etapa >= 1665)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1666)
        	g.fillRect(696, 585, 12, 6);
        	if (etapa >= 1667)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1668)
        	g.fillRect(714, 579, 12, 6);
        	if (etapa >= 1669)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1670)
        	g.fillRect(726, 579, 12, 6);
        	if (etapa >= 1671)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1672)
        	g.fillRect(738, 579, 12, 6);
        	if (etapa >= 1673)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1674)
        	g.fillRect(708, 585, 12, 6);
        	if (etapa >= 1675)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1676)
        	g.fillRect(720, 585, 12, 6);
        	if (etapa >= 1677)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1678)
        	g.fillRect(732, 585, 12, 6);
        	if (etapa >= 1679)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1680)
        	g.fillRect(750, 579, 12, 6);
        	if (etapa >= 1681)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1682)
        	g.fillRect(762, 579, 12, 6);
        	if (etapa >= 1683)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1684)
        	g.fillRect(774, 579, 12, 6);
        	if (etapa >= 1685)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1686)
        	g.fillRect(756, 585, 12, 6);
        	if (etapa >= 1687)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1688)
        	g.fillRect(768, 585, 12, 6);
        	if (etapa >= 1689)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1690)
        	g.fillRect(780, 585, 12, 6);
        	if (etapa >= 1691)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1692)
        	g.fillRect(570, 591, 12, 6);
        	if (etapa >= 1693)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1694)
        	g.fillRect(582, 591, 12, 6);
        	if (etapa >= 1695)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1696)
        	g.fillRect(594, 591, 12, 6);
        	if (etapa >= 1697)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1698)
        	g.fillRect(564, 597, 12, 6);
        	if (etapa >= 1699)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1700)
        	g.fillRect(576, 597, 12, 6);
        	if (etapa >= 1701)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1702)
        	g.fillRect(588, 597, 12, 6);
        	if (etapa >= 1703)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1704)
        	g.fillRect(606, 591, 12, 6);
        	if (etapa >= 1705)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1706)
        	g.fillRect(618, 591, 12, 6);
        	if (etapa >= 1707)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1708)
        	g.fillRect(630, 591, 12, 6);
        	if (etapa >= 1709)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1710)
        	g.fillRect(600, 597, 12, 6);
        	if (etapa >= 1711)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1712)
        	g.fillRect(612, 597, 12, 6);
        	if (etapa >= 1713)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1714)
        	g.fillRect(624, 597, 12, 6);
        	if (etapa >= 1715)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1716)
        	g.fillRect(642, 591, 12, 6);
        	if (etapa >= 1717)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1718)
        	g.fillRect(654, 591, 12, 6);
        	if (etapa >= 1719)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1720)
        	g.fillRect(666, 591, 12, 6);
        	if (etapa >= 1721)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1722)
        	g.fillRect(636, 597, 12, 6);
        	if (etapa >= 1723)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1724)
        	g.fillRect(648, 597, 12, 6);
        	if (etapa >= 1725)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1726)
        	g.fillRect(660, 597, 12, 6);
        	if (etapa >= 1727)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1728)
        	g.fillRect(678, 591, 12, 6);
        	if (etapa >= 1729)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1730)
        	g.fillRect(690, 591, 12, 6);
        	if (etapa >= 1731)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1732)
        	g.fillRect(702, 591, 12, 6);
        	if (etapa >= 1733)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1734)
        	g.fillRect(672, 597, 12, 6);
        	if (etapa >= 1735)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1736)
        	g.fillRect(684, 597, 12, 6);
        	if (etapa >= 1737)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1738)
        	g.fillRect(696, 597, 12, 6);
        	if (etapa >= 1739)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1740)
        	g.fillRect(714, 591, 12, 6);
        	if (etapa >= 1741)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1742)
        	g.fillRect(726, 591, 12, 6);
        	if (etapa >= 1743)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1744)
        	g.fillRect(738, 591, 12, 6);
        	if (etapa >= 1745)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1746)
        	g.fillRect(708, 597, 12, 6);
        	if (etapa >= 1747)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1748)
        	g.fillRect(720, 597, 12, 6);
        	if (etapa >= 1749)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1750)
        	g.fillRect(732, 597, 12, 6);
        	if (etapa >= 1751)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1752)
        	g.fillRect(750, 591, 12, 6);
        	if (etapa >= 1753)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1754)
        	g.fillRect(762, 591, 12, 6);
        	if (etapa >= 1755)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1756)
        	g.fillRect(774, 591, 12, 6);
        	if (etapa >= 1757)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1758)
        	g.fillRect(756, 597, 12, 6);
        	if (etapa >= 1759)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1760)
        	g.fillRect(768, 597, 12, 6);
        	if (etapa >= 1761)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1762)
        	g.fillRect(780, 597, 12, 6);
        	if (etapa >= 1763)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1764)
        	g.fillRect(570, 603, 12, 6);
        	if (etapa >= 1765)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1766)
        	g.fillRect(582, 603, 12, 6);
        	if (etapa >= 1767)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1768)
        	g.fillRect(594, 603, 12, 6);
        	if (etapa >= 1769)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1770)
        	g.fillRect(564, 609, 12, 6);
        	if (etapa >= 1771)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1772)
        	g.fillRect(576, 609, 12, 6);
        	if (etapa >= 1773)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1774)
        	g.fillRect(588, 609, 12, 6);
        	if (etapa >= 1775)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1776)
        	g.fillRect(606, 603, 12, 6);
        	if (etapa >= 1777)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1778)
        	g.fillRect(618, 603, 12, 6);
        	if (etapa >= 1779)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1780)
        	g.fillRect(630, 603, 12, 6);
        	if (etapa >= 1781)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1782)
        	g.fillRect(600, 609, 12, 6);
        	if (etapa >= 1783)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1784)
        	g.fillRect(612, 609, 12, 6);
        	if (etapa >= 1785)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1786)
        	g.fillRect(624, 609, 12, 6);
        	if (etapa >= 1787)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1788)
        	g.fillRect(642, 603, 12, 6);
        	if (etapa >= 1789)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1790)
        	g.fillRect(654, 603, 12, 6);
        	if (etapa >= 1791)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1792)
        	g.fillRect(666, 603, 12, 6);
        	if (etapa >= 1793)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1794)
        	g.fillRect(636, 609, 12, 6);
        	if (etapa >= 1795)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1796)
        	g.fillRect(648, 609, 12, 6);
        	if (etapa >= 1797)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1798)
        	g.fillRect(660, 609, 12, 6);
        	if (etapa >= 1799)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1800)
        	g.fillRect(678, 603, 12, 6);
        	if (etapa >= 1801)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1802)
        	g.fillRect(690, 603, 12, 6);
        	if (etapa >= 1803)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1804)
        	g.fillRect(702, 603, 12, 6);
        	if (etapa >= 1805)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1806)
        	g.fillRect(672, 609, 12, 6);
        	if (etapa >= 1807)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1808)
        	g.fillRect(684, 609, 12, 6);
        	if (etapa >= 1809)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1810)
        	g.fillRect(696, 609, 12, 6);
        	if (etapa >= 1811)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1812)
        	g.fillRect(714, 603, 12, 6);
        	if (etapa >= 1813)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1814)
        	g.fillRect(726, 603, 12, 6);
        	if (etapa >= 1815)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1816)
        	g.fillRect(738, 603, 12, 6);
        	if (etapa >= 1817)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1818)
        	g.fillRect(708, 609, 12, 6);
        	if (etapa >= 1819)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1820)
        	g.fillRect(720, 609, 12, 6);
        	if (etapa >= 1821)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1822)
        	g.fillRect(732, 609, 12, 6);
        	if (etapa >= 1823)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1824)
        	g.fillRect(750, 603, 12, 6);
        	if (etapa >= 1825)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1826)
        	g.fillRect(762, 603, 12, 6);
        	if (etapa >= 1827)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1828)
        	g.fillRect(774, 603, 12, 6);
        	if (etapa >= 1829)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1830)
        	g.fillRect(756, 609, 12, 6);
        	if (etapa >= 1831)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1832)
        	g.fillRect(768, 609, 12, 6);
        	if (etapa >= 1833)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1834)
        	g.fillRect(780, 609, 12, 6);
        	if (etapa >= 1835)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1836)
        	g.fillRect(570, 615, 12, 6);
        	if (etapa >= 1837)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1838)
        	g.fillRect(582, 615, 12, 6);
        	if (etapa >= 1839)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1840)
        	g.fillRect(594, 615, 12, 6);
        	if (etapa >= 1841)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1842)
        	g.fillRect(564, 621, 12, 6);
        	if (etapa >= 1843)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1844)
        	g.fillRect(576, 621, 12, 6);
        	if (etapa >= 1845)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1846)
        	g.fillRect(588, 621, 12, 6);
        	if (etapa >= 1847)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1848)
        	g.fillRect(606, 615, 12, 6);
        	if (etapa >= 1849)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1850)
        	g.fillRect(618, 615, 12, 6);
        	if (etapa >= 1851)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1852)
        	g.fillRect(630, 615, 12, 6);
        	if (etapa >= 1853)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1854)
        	g.fillRect(600, 621, 12, 6);
        	if (etapa >= 1855)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1856)
        	g.fillRect(612, 621, 12, 6);
        	if (etapa >= 1857)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1858)
        	g.fillRect(624, 621, 12, 6);
        	if (etapa >= 1859)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1860)
        	g.fillRect(642, 615, 12, 6);
        	if (etapa >= 1861)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1862)
        	g.fillRect(654, 615, 12, 6);
        	if (etapa >= 1863)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1864)
        	g.fillRect(666, 615, 12, 6);
        	if (etapa >= 1865)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1866)
        	g.fillRect(636, 621, 12, 6);
        	if (etapa >= 1867)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1868)
        	g.fillRect(648, 621, 12, 6);
        	if (etapa >= 1869)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1870)
        	g.fillRect(660, 621, 12, 6);
        	if (etapa >= 1871)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1872)
        	g.fillRect(678, 615, 12, 6);
        	if (etapa >= 1873)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1874)
        	g.fillRect(690, 615, 12, 6);
        	if (etapa >= 1875)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1876)
        	g.fillRect(702, 615, 12, 6);
        	if (etapa >= 1877)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1878)
        	g.fillRect(672, 621, 12, 6);
        	if (etapa >= 1879)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1880)
        	g.fillRect(684, 621, 12, 6);
        	if (etapa >= 1881)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1882)
        	g.fillRect(696, 621, 12, 6);
        	if (etapa >= 1883)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1884)
        	g.fillRect(714, 615, 12, 6);
        	if (etapa >= 1885)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1886)
        	g.fillRect(726, 615, 12, 6);
        	if (etapa >= 1887)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1888)
        	g.fillRect(738, 615, 12, 6);
        	if (etapa >= 1889)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1890)
        	g.fillRect(708, 621, 12, 6);
        	if (etapa >= 1891)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1892)
        	g.fillRect(720, 621, 12, 6);
        	if (etapa >= 1893)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1894)
        	g.fillRect(732, 621, 12, 6);
        	if (etapa >= 1895)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1896)
        	g.fillRect(750, 615, 12, 6);
        	if (etapa >= 1897)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1898)
        	g.fillRect(762, 615, 12, 6);
        	if (etapa >= 1899)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1900)
        	g.fillRect(774, 615, 12, 6);
        	if (etapa >= 1901)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1902)
        	g.fillRect(756, 621, 12, 6);
        	if (etapa >= 1903)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1904)
        	g.fillRect(768, 621, 12, 6);
        	if (etapa >= 1905)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1906)
        	g.fillRect(780, 621, 12, 6);
        	if (etapa >= 1907)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1908)
        	g.fillRect(570, 627, 12, 6);
        	if (etapa >= 1909)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1910)
        	g.fillRect(582, 627, 12, 6);
        	if (etapa >= 1911)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1912)
        	g.fillRect(594, 627, 12, 6);
        	if (etapa >= 1913)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1914)
        	g.fillRect(564, 633, 12, 6);
        	if (etapa >= 1915)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1916)
        	g.fillRect(576, 633, 12, 6);
        	if (etapa >= 1917)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1918)
        	g.fillRect(588, 633, 12, 6);
        	if (etapa >= 1919)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1920)
        	g.fillRect(606, 627, 12, 6);
        	if (etapa >= 1921)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1922)
        	g.fillRect(618, 627, 12, 6);
        	if (etapa >= 1923)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1924)
        	g.fillRect(630, 627, 12, 6);
        	if (etapa >= 1925)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1926)
        	g.fillRect(600, 633, 12, 6);
        	if (etapa >= 1927)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1928)
        	g.fillRect(612, 633, 12, 6);
        	if (etapa >= 1929)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1930)
        	g.fillRect(624, 633, 12, 6);
        	if (etapa >= 1931)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1932)
        	g.fillRect(642, 627, 12, 6);
        	if (etapa >= 1933)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1934)
        	g.fillRect(654, 627, 12, 6);
        	if (etapa >= 1935)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1936)
        	g.fillRect(666, 627, 12, 6);
        	if (etapa >= 1937)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1938)
        	g.fillRect(636, 633, 12, 6);
        	if (etapa >= 1939)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1940)
        	g.fillRect(648, 633, 12, 6);
        	if (etapa >= 1941)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1942)
        	g.fillRect(660, 633, 12, 6);
        	if (etapa >= 1943)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1944)
        	g.fillRect(678, 627, 12, 6);
        	if (etapa >= 1945)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1946)
        	g.fillRect(690, 627, 12, 6);
        	if (etapa >= 1947)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1948)
        	g.fillRect(702, 627, 12, 6);
        	if (etapa >= 1949)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1950)
        	g.fillRect(672, 633, 12, 6);
        	if (etapa >= 1951)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1952)
        	g.fillRect(684, 633, 12, 6);
        	if (etapa >= 1953)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1954)
        	g.fillRect(696, 633, 12, 6);
        	if (etapa >= 1955)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1956)
        	g.fillRect(714, 627, 12, 6);
        	if (etapa >= 1957)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1958)
        	g.fillRect(726, 627, 12, 6);
        	if (etapa >= 1959)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1960)
        	g.fillRect(738, 627, 12, 6);
        	if (etapa >= 1961)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1962)
        	g.fillRect(708, 633, 12, 6);
        	if (etapa >= 1963)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1964)
        	g.fillRect(720, 633, 12, 6);
        	if (etapa >= 1965)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1966)
        	g.fillRect(732, 633, 12, 6);
        	if (etapa >= 1967)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1968)
        	g.fillRect(750, 627, 12, 6);
        	if (etapa >= 1969)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1970)
        	g.fillRect(762, 627, 12, 6);
        	if (etapa >= 1971)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1972)
        	g.fillRect(774, 627, 12, 6);
        	if (etapa >= 1973)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1974)
        	g.fillRect(756, 633, 12, 6);
        	if (etapa >= 1975)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1976)
        	g.fillRect(768, 633, 12, 6);
        	if (etapa >= 1977)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1978)
        	g.fillRect(780, 633, 12, 6);
        	if (etapa >= 1979)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1980)
        	g.fillRect(570, 639, 12, 6);
        	if (etapa >= 1981)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1982)
        	g.fillRect(582, 639, 12, 6);
        	if (etapa >= 1983)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1984)
        	g.fillRect(594, 639, 12, 6);
        	if (etapa >= 1985)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1986)
        	g.fillRect(564, 645, 12, 6);
        	if (etapa >= 1987)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1988)
        	g.fillRect(576, 645, 12, 6);
        	if (etapa >= 1989)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1990)
        	g.fillRect(588, 645, 12, 6);
        	if (etapa >= 1991)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 1992)
        	g.fillRect(606, 639, 12, 6);
        	if (etapa >= 1993)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 1994)
        	g.fillRect(618, 639, 12, 6);
        	if (etapa >= 1995)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 1996)
        	g.fillRect(630, 639, 12, 6);
        	if (etapa >= 1997)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 1998)
        	g.fillRect(600, 645, 12, 6);
        	if (etapa >= 1999)
        	g.setColor(new Color(56,64,85)); 
        	
        
        	etapasParte2(etapa, g);
        	etapasParte3(etapa, g);
    }

    public static void main(String[] args) {

    	
    	JFrame frame = new JFrame("Gráfica Casa");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 800);
        frame.setResizable(false);
        AnimacionCasa casa = new AnimacionCasa();
        frame.add(casa);
        frame.setVisible(true);
    	
    	Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                
                ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

                Runnable task = new Runnable() {
                    public void run() {
                        casa.etapa++;
                        casa.repaint();
                        if (casa.etapa > 2698) {
                            scheduler.shutdown();
                        }
                    }
                };

                // Ejecuta la tarea cada 200 milisegundos
                scheduler.scheduleAtFixedRate(task, 0, 5, TimeUnit.MILLISECONDS);
            	
            	
            }
        }, 4000); // Retraso en milisegundos (1000 ms = 1 segundo)

        
    }
    
    public static void etapasParte2(int etapa, Graphics g) {
    	if (etapa >= 2000)
        	g.fillRect(612, 645, 12, 6);
        	if (etapa >= 2001)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 2002)
        	g.fillRect(624, 645, 12, 6);
        	if (etapa >= 2003)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 2004)
        	g.fillRect(642, 639, 12, 6);
        	if (etapa >= 2005)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 2006)
        	g.fillRect(654, 639, 12, 6);
        	if (etapa >= 2007)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 2008)
        	g.fillRect(666, 639, 12, 6);
        	if (etapa >= 2009)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 2010)
        	g.fillRect(636, 645, 12, 6);
        	if (etapa >= 2011)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 2012)
        	g.fillRect(648, 645, 12, 6);
        	if (etapa >= 2013)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 2014)
        	g.fillRect(660, 645, 12, 6);
        	if (etapa >= 2015)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 2016)
        	g.fillRect(678, 639, 12, 6);
        	if (etapa >= 2017)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 2018)
        	g.fillRect(690, 639, 12, 6);
        	if (etapa >= 2019)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 2020)
        	g.fillRect(702, 639, 12, 6);
        	if (etapa >= 2021)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 2022)
        	g.fillRect(672, 645, 12, 6);
        	if (etapa >= 2023)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 2024)
        	g.fillRect(684, 645, 12, 6);
        	if (etapa >= 2025)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 2026)
        	g.fillRect(696, 645, 12, 6);
        	if (etapa >= 2027)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 2028)
        	g.fillRect(714, 639, 12, 6);
        	if (etapa >= 2029)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 2030)
        	g.fillRect(726, 639, 12, 6);
        	if (etapa >= 2031)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 2032)
        	g.fillRect(738, 639, 12, 6);
        	if (etapa >= 2033)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 2034)
        	g.fillRect(708, 645, 12, 6);
        	if (etapa >= 2035)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 2036)
        	g.fillRect(720, 645, 12, 6);
        	if (etapa >= 2037)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 2038)
        	g.fillRect(732, 645, 12, 6);
        	if (etapa >= 2039)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 2040)
        	g.fillRect(750, 639, 12, 6);
        	if (etapa >= 2041)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 2042)
        	g.fillRect(762, 639, 12, 6);
        	if (etapa >= 2043)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 2044)
        	g.fillRect(774, 639, 12, 6);
        	if (etapa >= 2045)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 2046)
        	g.fillRect(756, 645, 12, 6);
        	if (etapa >= 2047)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 2048)
        	g.fillRect(768, 645, 12, 6);
        	if (etapa >= 2049)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 2050)
        	g.fillRect(780, 645, 12, 6);
        	if (etapa >= 2051)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 2052)
        	g.fillRect(570, 651, 12, 6);
        	if (etapa >= 2053)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 2054)
        	g.fillRect(582, 651, 12, 6);
        	if (etapa >= 2055)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 2056)
        	g.fillRect(594, 651, 12, 6);
        	if (etapa >= 2057)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 2058)
        	g.fillRect(564, 657, 12, 6);
        	if (etapa >= 2059)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 2060)
        	g.fillRect(576, 657, 12, 6);
        	if (etapa >= 2061)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 2062)
        	g.fillRect(588, 657, 12, 6);
        	if (etapa >= 2063)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 2064)
        	g.fillRect(606, 651, 12, 6);
        	if (etapa >= 2065)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 2066)
        	g.fillRect(618, 651, 12, 6);
        	if (etapa >= 2067)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 2068)
        	g.fillRect(630, 651, 12, 6);
        	if (etapa >= 2069)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 2070)
        	g.fillRect(600, 657, 12, 6);
        	if (etapa >= 2071)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 2072)
        	g.fillRect(612, 657, 12, 6);
        	if (etapa >= 2073)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 2074)
        	g.fillRect(624, 657, 12, 6);
        	if (etapa >= 2075)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 2076)
        	g.fillRect(642, 651, 12, 6);
        	if (etapa >= 2077)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 2078)
        	g.fillRect(654, 651, 12, 6);
        	if (etapa >= 2079)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 2080)
        	g.fillRect(666, 651, 12, 6);
        	if (etapa >= 2081)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 2082)
        	g.fillRect(636, 657, 12, 6);
        	if (etapa >= 2083)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 2084)
        	g.fillRect(648, 657, 12, 6);
        	if (etapa >= 2085)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 2086)
        	g.fillRect(660, 657, 12, 6);
        	if (etapa >= 2087)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 2088)
        	g.fillRect(678, 651, 12, 6);
        	if (etapa >= 2089)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 2090)
        	g.fillRect(690, 651, 12, 6);
        	if (etapa >= 2091)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 2092)
        	g.fillRect(702, 651, 12, 6);
        	if (etapa >= 2093)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 2094)
        	g.fillRect(672, 657, 12, 6);
        	if (etapa >= 2095)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 2096)
        	g.fillRect(684, 657, 12, 6);
        	if (etapa >= 2097)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 2098)
        	g.fillRect(696, 657, 12, 6);
        	if (etapa >= 2099)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 2100)
        	g.fillRect(714, 651, 12, 6);
        	if (etapa >= 2101)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 2102)
        	g.fillRect(726, 651, 12, 6);
        	if (etapa >= 2103)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 2104)
        	g.fillRect(738, 651, 12, 6);
        	if (etapa >= 2105)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 2106)
        	g.fillRect(708, 657, 12, 6);
        	if (etapa >= 2107)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 2108)
        	g.fillRect(720, 657, 12, 6);
        	if (etapa >= 2109)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 2110)
        	g.fillRect(732, 657, 12, 6);
        	if (etapa >= 2111)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 2112)
        	g.fillRect(750, 651, 12, 6);
        	if (etapa >= 2113)
        	g.setColor(new Color(86,96,105));
        	if (etapa >= 2114)
        	g.fillRect(762, 651, 12, 6);
        	if (etapa >= 2115)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 2116)
        	g.fillRect(774, 651, 12, 6);
        	if (etapa >= 2117)
        	g.setColor(new Color(86,96,105)); 
        	if (etapa >= 2118)
        	g.fillRect(756, 657, 12, 6);
        	if (etapa >= 2119)
        	g.setColor(new Color(56,64,85)); 
        	if (etapa >= 2120)
        	g.fillRect(768, 657, 12, 6);
        	if (etapa >= 2121)
        	g.setColor(new Color(71,80,95)); 
        	if (etapa >= 2122) {
        		for(int i=0;i<27;i++) {
			        for(int j=0;j<6;j++) {
			        	g.setColor(new Color(71,80,95)); 
		        		g.fillRect(570+(j*36), 351+(i*12), 12, 6);
			        	g.setColor(new Color(86,96,105));
		        		g.fillRect(582+(j*36), 351+(i*12), 12, 6);
				        g.setColor(new Color(56,64,85)); 
		        		g.fillRect(594+(j*36), 351+(i*12), 12, 6);
			        	g.setColor(new Color(86,96,105)); 
			        	g.fillRect(564+(j*36), 357+(i*12), 12, 6);
				        g.setColor(new Color(56,64,85)); 
			        	g.fillRect(576+(j*36), 357+(i*12), 12, 6);
				        g.setColor(new Color(71,80,95)); 
			        	g.fillRect(588+(j*36), 357+(i*12), 12, 6);
			        }
		        }
        	}
        	if (etapa >= 2123)
        				        g.setColor(new Color(31,40,56));
        	if (etapa >= 2124)
        				        g.fillOval(617, 460, 97, 97);
        	if (etapa >= 2125)
        				        g.fillRect(618, 517, 96, 137);
        	if (etapa >= 2126)
        				        g.setColor(new Color(5,7,10)); //Negro 
        	if (etapa >= 2127)
        				        g.fillRect(634, 504, 65, 112);
        	if (etapa >= 2128)
        				        g.setColor(new Color(99,99,62)); // Verde 
        	if (etapa >= 2129)
        				        g.fillRect(642, 512, 49, 96);
        	if (etapa >= 2130)
        				        g.setColor(new Color(5,7,10)); //Negro 
        	if (etapa >= 2131)
        				        g.drawLine(667, 512, 667, 612);
        	if (etapa >= 2132)
        				        g.drawLine(640, 536, 695, 536);
        	if (etapa >= 2133)
        				        g.drawLine(640, 560, 695, 560);
        	if (etapa >= 2134)
        				        g.drawLine(640, 584, 695, 584);
        	if (etapa >= 2135)
        				        g.setColor(new Color(117,117,73)); // Verde 
        	if (etapa >= 2136)
        				        g.drawRect(650, 520, 33, 36);
        	if (etapa >= 2137)
        				        g.fillRect(650, 520, 17, 16);
        	if (etapa >= 2138)
        				        g.fillRect(668, 537, 16, 19);
        	if (etapa >= 2139)
        				        g.drawRect(650, 564, 33, 36);
        	if (etapa >= 2140)
        				        g.fillRect(650, 565, 17, 19);
        	if (etapa >= 2141)
        				        g.fillRect(668, 585, 16, 16);
        	if (etapa >= 2142)
        				        g.setColor(new Color(181,192,126));
        	if (etapa >= 2143)
        				        g.fillRect(520, 667, 448, 30);
        	if (etapa >= 2144)
        				        g.setColor(new Color(127,135,89));
        	if (etapa >= 2145)
        				        g.fillRect(512, 600, 60, 67);
        	if (etapa >= 2146)
        				        g.setColor(new Color(224,214,215));
        	if (etapa >= 2147)
        				        g.fillPolygon(new int[]{617, 713, 699, 570}, new int[]{667, 667, 710, 710}, 4);
        	if (etapa >= 2148)
        				        g.setColor(new Color(150,152,171));
        	if (etapa >= 2149)
        				        g.fillRect(618, 628, 96, 13);
        	if (etapa >= 2150)
        				        g.setColor(new Color(121,121,127));
        	if (etapa >= 2151)
        				        g.fillRect(618, 638, 96, 13);
        	if (etapa >= 2152)
        				        g.setColor(new Color(150,152,171));
        	if (etapa >= 2153)
        				        g.fillRect(618, 644, 96, 12);
        	if (etapa >= 2154)
        				        g.setColor(new Color(121,121,127));
        	if (etapa >= 2155)
        				        g.fillRect(618, 649, 96, 18);
        	if (etapa >= 2156)
        				        g.setColor(new Color(150,152,171));
        	if (etapa >= 2157)
        				        g.fillRect(618, 655, 96, 5);
        	if (etapa >= 2158) {
        		for(int f=0;f<5;f++) {
				      //Bloque (25 hojas)
					       for(int g2=0;g2<2;g2++) {
						       for(int h=0;h<2;h++) {
						        //Bloque (5 hojas)
							        //Hojas 2x2
							        for(int i=0;i<2;i++) {
								        for(int j=0;j<2;j++) {
									        g.setColor(new Color(64,120,66)); // Verde 1
									        g.fillOval(582+(j*6)+(g2*12), 550+(i*6)+(h*12)+(f*24), 6, 6);
									        g.setColor(new Color(147,179,118)); // Verde 2
									        g.drawOval(582+(j*6)+(g2*12), 550+(i*6)+(h*12)+(f*24), 6, 6);
								        }
							        }
							        //Hoja central del 2x2
							        g.setColor(new Color(64,120,66)); // Verde 1
							        g.fillOval(585+(g2*12), 553+(h*12)+(f*24), 6, 6);
							        g.setColor(new Color(147,179,118)); // Verde 2
							        g.drawOval(585+(g2*12), 553+(h*12)+(f*24), 6, 6);
						       }
					       }
				        
				        //Bloque central de los Bloques
					      //Hojas 2x2
					        for(int i=0;i<2;i++) {
						        for(int j=0;j<2;j++) {
							        g.setColor(new Color(64,120,66)); // Verde 1
							        g.fillOval(582+(j*6), 550+(i*6)+(f*24), 6, 6);
							        g.setColor(new Color(147,179,118)); // Verde 2
							        g.drawOval(582+(j*6), 550+(i*6)+(f*24), 6, 6);
						        }
					        }
					        for(int i=0;i<2;i++) {
						        //Hojas centrales de 2 2x2
						        g.setColor(new Color(64,120,66)); // Verde 1
						        g.fillOval(585+(i*6), 553+(i*6)+(f*24), 6, 6);
						        g.setColor(new Color(147,179,118)); // Verde 2
						        g.drawOval(585+(i*6), 553+(i*6)+(f*24), 6, 6);
					        }
				   }
			     // Parte superior
				   for(int f=0;f<5;f++) {
			        //Bloque central de los Bloques
				      //Hojas 2x2
				        for(int i=0;i<2;i++) {
					        for(int j=0;j<2;j++) {
						        g.setColor(new Color(64,120,66)); // Verde 1
						        g.fillOval(588+(j*6), 502+(i*6)+(f*12), 6, 6);
						        g.setColor(new Color(147,179,118)); // Verde 2
						        g.drawOval(588+(j*6), 502+(i*6)+(f*12), 6, 6);
					        }
				        }
				        //Hojas centrales de 2 2x2
				        g.setColor(new Color(64,120,66)); // Verde 1
				        g.fillOval(591, 505+(f*12), 6, 6);
				        g.setColor(new Color(147,179,118)); // Verde 2
				        g.drawOval(591, 505+(f*12), 6, 6);
				   }
				   

			    // Planta derecha
			        
			        // Parte inferior
					   for(int f=0;f<5;f++) {
					      //Bloque (25 hojas)
						       for(int g2=0;g2<2;g2++) {
							       for(int h=0;h<2;h++) {
							        //Bloque (5 hojas)
								        //Hojas 2x2  261
								        for(int i=0;i<2;i++) {
									        for(int j=0;j<2;j++) {
										        g.setColor(new Color(64,120,66)); // Verde 1
										        g.fillOval(723+(j*6)+(g2*12), 550+(i*6)+(h*12)+(f*24), 6, 6);
										        g.setColor(new Color(147,179,118)); // Verde 2
										        g.drawOval(723+(j*6)+(g2*12), 550+(i*6)+(h*12)+(f*24), 6, 6);
									        }
								        }
								        //Hoja central del 2x2
								        g.setColor(new Color(64,120,66)); // Verde 1
								        g.fillOval(726+(g2*12), 553+(h*12)+(f*24), 6, 6);
								        g.setColor(new Color(147,179,118)); // Verde 2
								        g.drawOval(726+(g2*12), 553+(h*12)+(f*24), 6, 6);
							       }
						       }
					        
					        //Bloque central de los Bloques
						      //Hojas 2x2
						        for(int i=0;i<2;i++) {
							        for(int j=0;j<2;j++) {
								        g.setColor(new Color(64,120,66)); // Verde 1
								        g.fillOval(723+(j*6), 550+(i*6)+(f*24), 6, 6);
								        g.setColor(new Color(147,179,118)); // Verde 2
								        g.drawOval(723+(j*6), 550+(i*6)+(f*24), 6, 6);
							        }
						        }
						        for(int i=0;i<2;i++) {
							        //Hojas centrales de 2 2x2
							        g.setColor(new Color(64,120,66)); // Verde 1
							        g.fillOval(726+(i*6), 553+(i*6)+(f*24), 6, 6);
							        g.setColor(new Color(147,179,118)); // Verde 2
							        g.drawOval(726+(i*6), 553+(i*6)+(f*24), 6, 6);
						        }
					   }
        	}
        	if (etapa >= 2159)
        				        g.setColor(new Color(209,205,200));
        	if (etapa >= 2160)
        				        g.fillRect(124, 454, 448, 193);
        	if (etapa >= 2161)
        				        g.setColor(new Color(71,80,95)); //Gris oscuro
        	if (etapa >= 2162)
        				        g.fillRect(124, 588, 448, 59);
        	if (etapa >= 2163)
        				        g.setColor(new Color(11,14,20)); //Negro 
        	if (etapa >= 2164)
        				        g.fillRect(124, 588, 448, 5);
        	if (etapa >= 2165)
        				        g.setColor(new Color(176,170,157)); 
        	if (etapa >= 2166)
        				        g.fillRect(124, 461, 448, 8);
        	if (etapa >= 2167)
        				        g.setColor(new Color(196,195,189)); 
        	if (etapa >= 2168)
        				        g.fillRect(124, 469, 448, 11);
        	if (etapa >= 2169)
        					        g.setColor(new Color(176,170,157)); 
        	if (etapa >= 2170) {
        		g.drawLine(135, 456, 571, 456);
        		g.setColor(new Color(176,170,157)); 
        		g.drawLine(135, 468, 571, 468);
        	}
        					        
        	if (etapa >= 2171)
        					        g.setColor(new Color(176,170,157)); 
        	if (etapa >= 2172)
        					        g.drawLine(135, 456, 135, 587);
        	if (etapa >= 2173)
        				        g.setColor(new Color(171,155,130)); 
        	if (etapa >= 2174)
        				        g.fillRect(124, 454, 448, 7);
        	if (etapa >= 2175)
        				        g.setColor(new Color(11,14,20)); //Negro 
        	if (etapa >= 2176)
        				        g.fillOval(155, 499, 14, 17);
        	if (etapa >= 2177) {
        		g.setColor(new Color(176,170,157)); 
        		g.drawLine(135, 480, 571, 480);
		        g.setColor(Color.darkGray);
        	}
        	if (etapa >= 2178)
        				        g.fillOval(157, 501, 10, 13);
        	if (etapa >= 2179)
        				        g.fillRect(157, 486, 3, 17);
        	if (etapa >= 2180)
        				        g.fillRect(151, 486, 3, 17);
        	if (etapa >= 2181)
        				        g.fillOval(150, 480, 10, 10);
        	if (etapa >= 2182)
        				        g.setColor(new Color(176,170,157)); 
        	if (etapa >= 2183)
        				        g.fillOval(153, 483, 4, 9);
        	if (etapa >= 2184) {
        		g.setColor(new Color(176,170,157)); 
        		g.drawLine(135, 492, 571, 492);
        				        g.setColor(new Color(71,80,95)); //Gris oscuro
        	}
        	if (etapa >= 2185)
        				        g.fillRect(148, 492, 8, 6);
        	if (etapa >= 2186)
        				        g.fillRect(142, 497, 20, 3);
        	if (etapa >= 2187)
        				        g.fillRect(140, 499, 24, 6);
        	if (etapa >= 2188)
        				        g.setColor(new Color(11,14,20)); //Negro 
        	if (etapa >= 2189)
        				        g.fillOval(542, 499, 14, 17);
        	if (etapa >= 2190) {
        		g.setColor(new Color(176,170,157)); 
        		g.drawLine(135, 504, 571, 504);
        				        g.setColor(Color.darkGray);
        	}
        	if (etapa >= 2191)
        				        g.fillOval(544, 501, 10, 13);
        	if (etapa >= 2192)
        				        g.fillRect(544, 486, 3, 17);
        	if (etapa >= 2193)
        				        g.fillRect(538, 486, 3, 17);
        	if (etapa >= 2194)
        				        g.fillOval(537, 480, 10, 10);
        	if (etapa >= 2195) {

        		g.setColor(new Color(176,170,157)); 
        		g.drawLine(135, 516, 571, 516);
        				        g.setColor(new Color(176,170,157)); 
        	}
        	if (etapa >= 2196)
        				        g.fillOval(540, 483, 4, 9);
        	if (etapa >= 2197)
        				        g.setColor(new Color(71,80,95)); //Gris oscuro
        	if (etapa >= 2198)
        				        g.fillRect(535, 492, 8, 6);
        	if (etapa >= 2199)
        				        g.fillRect(529, 497, 20, 3);
        	if (etapa >= 2200)
        				        g.fillRect(527, 499, 24, 6);
        	if (etapa >= 2201) {
        		g.setColor(new Color(176,170,157)); 
        		g.drawLine(135, 528, 571, 528);
        		g.setColor(new Color(176,170,157)); 
        		g.drawLine(135, 540, 571, 540);
        		g.setColor(new Color(176,170,157)); 
        		g.drawLine(135, 552, 571, 552);
        		g.setColor(new Color(176,170,157)); 
        		g.drawLine(135, 564, 571, 564);
        		g.setColor(new Color(176,170,157)); 
        		g.drawLine(135, 576, 571, 576);
        		//5
        		for(int i=0;i<11;i++) {
			        for(int j=0;j<24;j++) {
			        	g.setColor(new Color(166,116,89)); 
				        g.fillRect(206+(j*13), 513+(i*13), 13, 13);
				        g.setColor(new Color(96,43,26)); 
				        g.drawOval(207+(j*13), 514+(i*13), 3, 3);
				        g.drawLine(209+(j*13), 520+(i*13), 209+(j*13), 524+(i*13));
				        g.drawLine(214+(j*13), 516+(i*13), 214+(j*13), 519+(i*13));
				        g.drawOval(215+(j*13), 522+(i*13), 2, 2);
			        }
		        }
		        //Ventanas
        	}
        	if (etapa >= 2202)
        				        g.setColor(new Color(11,14,20)); //Negro 
        	if (etapa >= 2203)
        				        g.fillRect(205, 513, 2, 134);
        	if (etapa >= 2204)
        				        g.drawLine(205, 512, 518, 512);
        	if (etapa >= 2205)
        				        g.drawLine(518, 512, 518, 646);
        	if (etapa >= 2206) {
        		g.setColor(new Color(99, 99, 62)); // Verde
        		g.fillRect(212, 518, 68, 40);
        		g.setColor(new Color(11, 14, 20)); // Negro
        		g.drawRect(212, 518, 68, 40);
        		g.fillRect(234, 518, 3, 41);
        		g.fillRect(256, 518, 3, 41);
        		g.fillRect(212, 538, 68, 3);
        				        g.setColor(new Color(140,165,200));
        	}
        	if (etapa >= 2207)
        				        g.fillPolygon(new int[]{207, 180, 335, 313, 520, 555}, new int[]{647, 660, 660, 667, 667, 647}, 6);
        	if (etapa >= 2208)
        				        ;//6
        	if (etapa >= 2209)
        				        g.setColor(new Color(139,150,147)); // El Verde menos oscuro
        	if (etapa >= 2210)
        				        g.fillRect(755, 439, 261, 177); 
        	if (etapa >= 2211)
        				        g.setColor(new Color(46,47,40)); // Verde oscuro
        	if (etapa >= 2212)
        				        g.fillRect(755, 451, 261, 7);
        	if (etapa >= 2213) {
        		g.setColor(new Color(99, 99, 62)); // Verde
        		g.fillRect(290, 518, 68, 40);
        		g.setColor(new Color(11, 14, 20)); // Negro
        		g.drawRect(290, 518, 68, 40);
        		g.fillRect(312, 518, 3, 41);
        		g.fillRect(334, 518, 3, 41);
        		g.fillRect(290, 538, 68, 3);

        				        g.setColor(new Color(101,114,102)); // Verde menos menos oscuro
        	}
        	if (etapa >= 2214)
        				        g.fillRect(755, 459, 32, 150);
        	if (etapa >= 2215)
        				        g.fillRect(755, 459, 261, 20);
        	if (etapa >= 2216)
        				        g.setColor(new Color(67,78,69)); // Verde menos oscuro
        	if (etapa >= 2217)
        				        g.fillRect(755, 458, 261, 7);
        	if (etapa >= 2218)
        				        g.fillRect(755, 461, 10, 28);
        	if (etapa >= 2219) {
        		g.setColor(new Color(99, 99, 62)); // Verde
        		g.fillRect(368, 518, 68, 40);
        		g.setColor(new Color(11, 14, 20)); // Negro
        		g.drawRect(368, 518, 68, 40);
        		g.fillRect(390, 518, 3, 41);
        		g.fillRect(412, 518, 3, 41);
        		g.fillRect(368, 538, 68, 3);
        				        g.setColor(new Color(46,47,40)); // Verde oscuro
        	}
        	if (etapa >= 2220)
        				        g.fillRect(755, 451, 4, 30);
        	if (etapa >= 2221)
        				        g.setColor(new Color(67,78,69)); // Verde menos oscuro
        	if (etapa >= 2222)
        				        g.fillRect(755, 487, 4, 120);
        	if (etapa >= 2223)
        				        g.setColor(new Color(67,78,69)); // Verde menos oscuro
        	if (etapa >= 2224)
        				        ;//7
        	if (etapa >= 2225)
        			        	g.setColor(new Color(8,11,6)); // El verde más oscuro
        	if (etapa >= 2226)
        				        g.fillRect(790, 485, 44, 101);
        	if (etapa >= 2227) {
        		g.setColor(new Color(99, 99, 62)); // Verde
        		g.fillRect(446, 518, 68, 40);
        		g.setColor(new Color(11, 14, 20)); // Negro
        		g.drawRect(446, 518, 68, 40);
        		g.fillRect(468, 518, 3, 41);
        		g.fillRect(490, 518, 3, 41);
        		g.fillRect(446, 538, 68, 3);

        			        	g.setColor(new Color(170,153,133)); // cafe claro
        	}
        	if (etapa >= 2228)
        				        g.fillRect(794, 489, 36, 93);
        	if (etapa >= 2229)
        			        	g.setColor(new Color(150,135,118)); // cafe
        	if (etapa >= 2230)
        				        g.fillRect(797, 492, 11, 40);
        	if (etapa >= 2231)
        				        g.fillRect(797, 539, 11, 40);
        	if (etapa >= 2232)
        				        g.fillRect(815, 492, 11, 40);
        	if (etapa >= 2233)
        				        g.fillRect(815, 539, 11, 40);
        	if (etapa >= 2234)
        			        	g.setColor(new Color(170,153,133)); // cafe claro
        	if (etapa >= 2235)
        				        g.fillRect(801, 496, 3, 14);
        	if (etapa >= 2236)
        				        g.fillRect(801, 514, 3, 14);
        	if (etapa >= 2237)
        				        g.fillRect(819, 496, 3, 14);
        	if (etapa >= 2238)
        				        g.fillRect(819, 514, 3, 14);
        	if (etapa >= 2239)
        				        g.fillRect(801, 543, 3, 14);
        	if (etapa >= 2240)
        				        g.fillRect(801, 561, 3, 14);
        	if (etapa >= 2241)
        				        g.fillRect(819, 543, 3, 14);
        	if (etapa >= 2242)
        				        g.fillRect(819, 561, 3, 14);
        	if (etapa >= 2243)
        			        	g.setColor(new Color(8,11,6)); // El verde más oscuro
        	if (etapa >= 2244)
        				        g.drawLine(811, 486, 811, 589);
        	if (etapa >= 2245)
        				        g.drawLine(790, 535, 830, 535);
        	if (etapa >= 2246)
        			        	g.setColor(new Color(8,11,6)); // El verde más oscuro
        	if (etapa >= 2247)
        				        g.fillRect(859, 485, 44, 101);
        	if (etapa >= 2248)
        			        	g.setColor(new Color(170,153,133)); // cafe claro
        	if (etapa >= 2249)
        				        g.fillRect(863, 489, 36, 93);
        	if (etapa >= 2250)
        			        	g.setColor(new Color(150,135,118)); // cafe
        	if (etapa >= 2251)
        				        g.fillRect(866, 492, 11, 40);
        	if (etapa >= 2252)
        				        g.fillRect(866, 539, 11, 40);
        	if (etapa >= 2253)
        				        g.fillRect(884, 492, 11, 40);
        	if (etapa >= 2254)
        				        g.fillRect(884, 539, 11, 40);
        	if (etapa >= 2255)
        			        	g.setColor(new Color(170,153,133)); // cafe claro
        	if (etapa >= 2256)
        				        g.fillRect(870, 496, 3, 14);
        	if (etapa >= 2257)
        				        g.fillRect(870, 514, 3, 14);
        	if (etapa >= 2258)
        				        g.fillRect(888, 496, 3, 14);
        	if (etapa >= 2259)
        				        g.fillRect(888, 514, 3, 14);
        	if (etapa >= 2260)
        				        g.fillRect(870, 543, 3, 14);
        	if (etapa >= 2261)
        				        g.fillRect(870, 561, 3, 14);
        	if (etapa >= 2262)
        				        g.fillRect(888, 543, 3, 14);
        	if (etapa >= 2263)
        				        g.fillRect(888, 561, 3, 14);
        	if (etapa >= 2264)
        				        g.setColor(new Color(8,11,6)); // El verde más oscuro
        	if (etapa >= 2265)
        				        g.drawLine(880, 486, 880, 589);
        	if (etapa >= 2266) {
		        g.drawLine(859, 535, 899, 535);
        		for(int f=0;f<5;f++) {
			        //Bloque central de los Bloques
				      //Hojas 2x2
				        for(int i=0;i<2;i++) {
					        for(int j=0;j<2;j++) {
						        g.setColor(new Color(64,120,66)); // Verde 1
						        g.fillOval(729+(j*6), 502+(i*6)+(f*12), 6, 6);
						        g.setColor(new Color(147,179,118)); // Verde 2
						        g.drawOval(729+(j*6), 502+(i*6)+(f*12), 6, 6);
					        }
				        }
				        //Hojas centrales de 2 2x2
				        g.setColor(new Color(64,120,66)); // Verde 1
				        g.fillOval(732, 505+(f*12), 6, 6);
				        g.setColor(new Color(147,179,118)); // Verde 2
				        g.drawOval(732, 505+(f*12), 6, 6);
				   }
        				        
        	}
        	if (etapa >= 2267)
        				        g.setColor(new Color(8,11,6)); // El verde más oscuro
        	if (etapa >= 2268)
        				        g.fillRect(928, 485, 44, 101);
        	if (etapa >= 2269)
        				        g.setColor(new Color(170,153,133)); // cafe claro
        	if (etapa >= 2270)
        				        g.fillRect(932, 489, 36, 93);
        	if (etapa >= 2271)
        				        g.setColor(new Color(150,135,118)); // cafe
        	if (etapa >= 2272)
        				        g.fillRect(935, 492, 11, 40);
        	if (etapa >= 2273)
        				        g.fillRect(935, 539, 11, 40);
        	if (etapa >= 2274)
        				        g.fillRect(953, 492, 11, 40);
        	if (etapa >= 2275)
        				        g.fillRect(953, 539, 11, 40);
        	if (etapa >= 2276)
        				        g.setColor(new Color(170,153,133)); // cafe claro
        	if (etapa >= 2277)
        				        g.fillRect(939, 496, 3, 14);
        	if (etapa >= 2278)
        				        g.fillRect(939, 514, 3, 14);
        	if (etapa >= 2279)
        				        g.fillRect(957, 496, 3, 14);
        	if (etapa >= 2280)
        				        g.fillRect(957, 514, 3, 14);
        	if (etapa >= 2281)
        				        g.fillRect(939, 543, 3, 14);
        	if (etapa >= 2282)
        				        g.fillRect(939, 561, 3, 14);
        	if (etapa >= 2283)
        				        g.fillRect(957, 543, 3, 14);
        	if (etapa >= 2284)
        				        g.fillRect(957, 561, 3, 14);
        	if (etapa >= 2285)
        				        g.setColor(new Color(8,11,6)); // El verde más oscuro
        	if (etapa >= 2286)
        				        g.drawLine(949, 486, 949, 589);
        	if (etapa >= 2287)
        				        g.drawLine(928, 535, 968, 535);
        	if (etapa >= 2288)
        				        g.setColor(new Color(11,14,20)); //Negro 
        	if (etapa >= 2289)
        				        g.fillRect(755, 585, 261, 5);
        	if (etapa >= 2290)
        				        g.setColor(new Color(71,80,95)); //Gris oscuro
        	if (etapa >= 2291)
        				        g.fillRect(755, 590, 261, 50);
        	if (etapa >= 2292)
        				        g.setColor(new Color(31,40,56)); //Gris más oscuro
        	if (etapa >= 2293)
        				        g.fillRect(755, 590, 5, 50);
        	if (etapa >= 2294)
        				        g.setColor(new Color(172,172,184)); //Gris 
        	if (etapa >= 2295)
        				        g.fillPolygon(new int[]{756, 756, 1045, 1017}, new int[]{625, 642, 642, 625}, 4);
        	if (etapa >= 2296)
        				        g.setColor(new Color(115,114,134)); // Otro Gris 
        	if (etapa >= 2297)
        				        g.fillRect(755, 625, 5, 40);
        	if (etapa >= 2298)
        				        g.setColor(new Color(71,80,95)); //Gris oscuro
        	if (etapa >= 2299)
        				        g.fillRect(755, 642, 289, 25);
        	if (etapa >= 2300)
        				        g.setColor(new Color(115,114,134)); // Otro Gris 
        	if (etapa >= 2301)
        				        g.fillRect(755, 642, 289, 7);
        	if (etapa >= 2302)
        				        g.setColor(new Color(71,80,95)); //Gris oscuro
        	if (etapa >= 2303)
        				        g.fillRect(755, 642, 5, 8);
        	if (etapa >= 2304)
        				        g.setColor(new Color(31,40,56)); //Gris más oscuro
        	if (etapa >= 2305)
        				        g.fillRect(755, 650, 5, 16);
        	if (etapa >= 2306)
        				        ;//8
        	if (etapa >= 2307)
        			        	g.setColor(new Color(8,11,6)); // Verde oscuro
        	if (etapa >= 2308)
        				        g.fillRect(92, 434, 480, 11);
        	if (etapa >= 2309)
        				        g.setColor(new Color(11,14,20)); //Negro 
        	if (etapa >= 2310)
        				        g.fillRect(96, 445, 476, 10);
        	if (etapa >= 2311)
        					        g.setColor(new Color(127,118,113)); //Gris
        	if (etapa >= 2312)
        					        g.fillPolygon(new int[]{205, 495, 455, 90}, new int[]{330, 330, 434, 434}, 4);
        	if (etapa >= 2313)
        					        g.setColor(new Color(173,163,161)); //Gris claro
        	if (etapa >= 2314)
        					        g.drawLine(200, 358, 220, 358);
        	if (etapa >= 2315)
        					        g.drawLine(200, 358, 193, 365);
        	if (etapa >= 2316)
        					        g.drawLine(220, 358, 213, 365);
        	if (etapa >= 2317)
        					        g.drawLine(194, 365, 214, 365);
        	if (etapa >= 2318)
        					        g.drawLine(185, 365, 205, 365);
        	if (etapa >= 2319)
        					        g.drawLine(185, 365, 178, 372);
        	if (etapa >= 2320)
        					        g.drawLine(205, 365, 198, 372);
        	if (etapa >= 2321)
        					        g.drawLine(179, 372, 199, 372);
        	if (etapa >= 2322)
        					        g.drawLine(205, 365, 225, 365);
        	if (etapa >= 2323)
        					        g.drawLine(205, 365, 198, 372);
        	if (etapa >= 2324)
        					        g.drawLine(225, 365, 218, 372);
        	if (etapa >= 2325)
        					        g.drawLine(199, 372, 219, 372);
        	if (etapa >= 2326)
        					        g.drawLine(160, 403, 180, 403);
        	if (etapa >= 2327)
        					        g.drawLine(160, 403, 153, 410);
        	if (etapa >= 2328)
        					        g.drawLine(180, 403, 173, 410);
        	if (etapa >= 2329)
        					        g.drawLine(154, 410, 174, 410);
        	if (etapa >= 2330)
        					        g.drawLine(145, 410, 165, 410);
        	if (etapa >= 2331)
        					        g.drawLine(145, 410, 138, 417);
        	if (etapa >= 2332)
        					        g.drawLine(165, 410, 158, 417);
        	if (etapa >= 2333)
        					        g.drawLine(139, 417, 159, 417);
        	if (etapa >= 2334)
        					        g.drawLine(165, 410, 185, 410);
        	if (etapa >= 2335)
        					        g.drawLine(165, 410, 158, 417);
        	if (etapa >= 2336)
        					        g.drawLine(185, 410, 178, 417);
        	if (etapa >= 2337)
        					        g.drawLine(159, 417, 179, 417);
        	if (etapa >= 2338)
        							g.drawLine(160, 403, 180, 403);
        	if (etapa >= 2339)
        							g.drawLine(160, 403, 153, 410);
        	if (etapa >= 2340)
        							g.drawLine(180, 403, 173, 410);
        	if (etapa >= 2341)
        							g.drawLine(154, 410, 174, 410);
        	if (etapa >= 2342)
        							g.drawLine(145, 410, 165, 410);
        	if (etapa >= 2343)
        							g.drawLine(145, 410, 138, 417);
        	if (etapa >= 2344)
        							g.drawLine(165, 410, 158, 417);
        	if (etapa >= 2345)
        							g.drawLine(139, 417, 159, 417);
        	if (etapa >= 2346)
        							g.drawLine(165, 410, 185, 410);
        	if (etapa >= 2347)
        							g.drawLine(165, 410, 158, 417);
        	if (etapa >= 2348)
        							g.drawLine(185, 410, 178, 417);
        	if (etapa >= 2349)
        							g.drawLine(159, 417, 179, 417);
        	if (etapa >= 2350)
        							g.drawLine(240, 383, 260, 383);
        	if (etapa >= 2351)
        							g.drawLine(240, 383, 233, 390);
        	if (etapa >= 2352)
        							g.drawLine(260, 383, 253, 390);
        	if (etapa >= 2353)
        							g.drawLine(234, 390, 254, 390);
        	if (etapa >= 2354)
        							g.drawLine(225, 390, 245, 390);
        	if (etapa >= 2355)
        							g.drawLine(225, 390, 218, 397);
        	if (etapa >= 2356)
        							g.drawLine(245, 390, 238, 397);
        	if (etapa >= 2357)
        							g.drawLine(219, 397, 239, 397);
        	if (etapa >= 2358)
        							g.drawLine(245, 390, 265, 390);
        	if (etapa >= 2359)
        							g.drawLine(245, 390, 238, 397);
        	if (etapa >= 2360)
        							g.drawLine(265, 390, 258, 397);
        	if (etapa >= 2361)
        							g.drawLine(239, 397, 259, 397);
        	if (etapa >= 2362)
        							g.drawLine(270, 343, 290, 343);
        	if (etapa >= 2363)
        							g.drawLine(270, 343, 263, 350);
        	if (etapa >= 2364)
        							g.drawLine(290, 343, 283, 350);
        	if (etapa >= 2365)
        							g.drawLine(264, 350, 284, 350);
        	if (etapa >= 2366)
        							g.drawLine(255, 350, 275, 350);
        	if (etapa >= 2367)
        							g.drawLine(255, 350, 248, 357);
        	if (etapa >= 2368)
        							g.drawLine(275, 350, 268, 357);
        	if (etapa >= 2369)
        							g.drawLine(249, 357, 269, 357);
        	if (etapa >= 2370)
        							g.drawLine(275, 350, 295, 350);
        	if (etapa >= 2371)
        							g.drawLine(275, 350, 268, 357);
        	if (etapa >= 2372)
        							g.drawLine(295, 350, 288, 357);
        	if (etapa >= 2373)
        							g.drawLine(269, 357, 289, 357);
        	if (etapa >= 2374)
        							g.drawLine(300, 403, 320, 403);
        	if (etapa >= 2375)
        							g.drawLine(300, 403, 293, 410);
        	if (etapa >= 2376)
        							g.drawLine(320, 403, 313, 410);
        	if (etapa >= 2377)
        							g.drawLine(294, 410, 314, 410);
        	if (etapa >= 2378)
        							g.drawLine(285, 410, 305, 410);
        	if (etapa >= 2379)
        							g.drawLine(285, 410, 278, 417);
        	if (etapa >= 2380)
        							g.drawLine(305, 410, 298, 417);
        	if (etapa >= 2381)
        							g.drawLine(279, 417, 299, 417);
        	if (etapa >= 2382)
        							g.drawLine(305, 410, 325, 410);
        	if (etapa >= 2383)
        							g.drawLine(305, 410, 298, 417);
        	if (etapa >= 2384)
        							g.drawLine(325, 410, 318, 417);
        	if (etapa >= 2385)
        							g.drawLine(299, 417, 319, 417);
        	if (etapa >= 2386)
        					        g.setColor(new Color(67,82,104));
        	if (etapa >= 2387)
        					        g.fillPolygon(new int[]{315, 595, 612, 535, 390, 410, 250}, new int[]{330, 330, 360, 434, 434, 410, 410}, 7);
        	if (etapa >= 2388)
        					        g.setColor(new Color(47,61,87)); //Azul más oscuro
        	if (etapa >= 2389)
        							g.drawLine(300, 403, 320, 403);
        	if (etapa >= 2390)
        							g.drawLine(300, 403, 293, 410);
        	if (etapa >= 2391)
        							g.drawLine(320, 403, 313, 410);
        	if (etapa >= 2392)
        					        g.setColor(new Color(173,163,161)); //Gris claro
        	if (etapa >= 2393)
        							g.drawLine(293, 410, 314, 410);
        	if (etapa >= 2394)
        					        g.setColor(new Color(47,61,87)); //Azul más oscuro
        	if (etapa >= 2395)
        							g.drawLine(410, 403, 430, 403);
        	if (etapa >= 2396)
        							g.drawLine(410, 403, 403, 410);
        	if (etapa >= 2397)
        							g.drawLine(430, 403, 423, 410);
        	if (etapa >= 2398)
        							g.drawLine(404, 410, 424, 410);
        	if (etapa >= 2399)
        							g.drawLine(395, 410, 415, 410);
        	if (etapa >= 2400)
        							g.drawLine(395, 410, 388, 417);
        	if (etapa >= 2401)
        							g.drawLine(415, 410, 408, 417);
        	if (etapa >= 2402)
        							g.drawLine(389, 417, 409, 417);
        	if (etapa >= 2403)
        							g.drawLine(415, 410, 435, 410);
        	if (etapa >= 2404)
        							g.drawLine(415, 410, 408, 417);
        	if (etapa >= 2405)
        							g.drawLine(435, 410, 428, 417);
        	if (etapa >= 2406)
        							g.drawLine(409, 417, 429, 417);
        	if (etapa >= 2407)
        					        g.setColor(new Color(173,163,161)); //Gris claro
        	if (etapa >= 2408)
        							g.drawLine(395, 410, 410, 410);
        	if (etapa >= 2409)
        							g.drawLine(395, 410, 388, 417);
        	if (etapa >= 2410)
        							g.drawLine(389, 417, 404, 417);
        	if (etapa >= 2411)
        					        g.setColor(new Color(47,61,87)); //Azul más oscuro
        	if (etapa >= 2412)
        							g.drawLine(510, 403, 530, 403);
        	if (etapa >= 2413)
        							g.drawLine(510, 403, 503, 410);
        	if (etapa >= 2414)
        							g.drawLine(530, 403, 523, 410);
        	if (etapa >= 2415)
        							g.drawLine(504, 410, 524, 410);
        	if (etapa >= 2416)
        							g.drawLine(495, 410, 515, 410);
        	if (etapa >= 2417)
        							g.drawLine(495, 410, 488, 417);
        	if (etapa >= 2418)
        							g.drawLine(515, 410, 508, 417);
        	if (etapa >= 2419)
        							g.drawLine(489, 417, 509, 417);
        	if (etapa >= 2420)
        							g.drawLine(515, 410, 535, 410);
        	if (etapa >= 2421)
        							g.drawLine(515, 410, 508, 417);
        	if (etapa >= 2422)
        							g.drawLine(535, 410, 528, 417);
        	if (etapa >= 2423)
        							g.drawLine(509, 417, 529, 417);
        	if (etapa >= 2424)
        							g.drawLine(510, 403, 530, 403);
        	if (etapa >= 2425)
        							g.drawLine(510, 403, 503, 410);
        	if (etapa >= 2426)
        							g.drawLine(530, 403, 523, 410);
        	if (etapa >= 2427)
        							g.drawLine(504, 410, 524, 410);
        	if (etapa >= 2428)
        							g.drawLine(495, 410, 515, 410);
        	if (etapa >= 2429)
        							g.drawLine(495, 410, 488, 417);
        	if (etapa >= 2430)
        							g.drawLine(515, 410, 508, 417);
        	if (etapa >= 2431)
        							g.drawLine(489, 417, 509, 417);
        	if (etapa >= 2432)
        							g.drawLine(515, 410, 535, 410);
        	if (etapa >= 2433)
        							g.drawLine(515, 410, 508, 417);
        	if (etapa >= 2434)
        							g.drawLine(535, 410, 528, 417);
        	if (etapa >= 2435)
        							g.drawLine(509, 417, 529, 417);
        	if (etapa >= 2436)
        							g.drawLine(320, 383, 320, 383);
        	if (etapa >= 2437)
        							g.drawLine(365, 383, 385, 383);
        	if (etapa >= 2438)
        							g.drawLine(365, 383, 358, 390);
        	if (etapa >= 2439)
        							g.drawLine(385, 383, 378, 390);
        	if (etapa >= 2440)
        							g.drawLine(359, 390, 379, 390);
        	if (etapa >= 2441)
        							g.drawLine(350, 390, 370, 390);
        	if (etapa >= 2442)
        							g.drawLine(350, 390, 343, 397);
        	if (etapa >= 2443)
        							g.drawLine(370, 390, 363, 397);
        	if (etapa >= 2444)
        							g.drawLine(344, 397, 364, 397);
        	if (etapa >= 2445)
        							g.drawLine(370, 390, 390, 390);
        	if (etapa >= 2446)
        							g.drawLine(370, 390, 363, 397);
        	if (etapa >= 2447)
        							g.drawLine(390, 390, 383, 397);
        	if (etapa >= 2448)
        							g.drawLine(364, 397, 384, 397);
        	if (etapa >= 2449)
        							g.drawLine(415, 344, 435, 344);
        	if (etapa >= 2450)
        							g.drawLine(415, 344, 408, 351);
        	if (etapa >= 2451)
        							g.drawLine(435, 344, 428, 351);
        	if (etapa >= 2452)
        							g.drawLine(409, 351, 429, 351);
        	if (etapa >= 2453)
        							g.drawLine(400, 351, 420, 351);
        	if (etapa >= 2454)
        							g.drawLine(400, 351, 393, 358);
        	if (etapa >= 2455)
        							g.drawLine(420, 351, 413, 358);
        	if (etapa >= 2456)
        							g.drawLine(394, 358, 414, 358);
        	if (etapa >= 2457)
        							g.drawLine(420, 351, 440, 351);
        	if (etapa >= 2458)
        							g.drawLine(420, 351, 413, 358);
        	if (etapa >= 2459)
        							g.drawLine(440, 351, 433, 358);
        	if (etapa >= 2460)
        							g.drawLine(414, 358, 434, 358);
        	if (etapa >= 2461)
        							g.drawLine(327, 362, 347, 362);
        	if (etapa >= 2462)
        							g.drawLine(327, 362, 320, 369);
        	if (etapa >= 2463)
        							g.drawLine(347, 362, 340, 369);
        	if (etapa >= 2464)
        							g.drawLine(321, 369, 341, 369);
        	if (etapa >= 2465)
        							g.drawLine(312, 369, 332, 369);
        	if (etapa >= 2466)
        							g.drawLine(312, 369, 305, 376);
        	if (etapa >= 2467)
        							g.drawLine(332, 369, 325, 376);
        	if (etapa >= 2468)
        							g.drawLine(306, 376, 326, 376);
        	if (etapa >= 2469)
        							g.drawLine(332, 369, 352, 369);
        	if (etapa >= 2470)
        							g.drawLine(332, 369, 325, 376);
        	if (etapa >= 2471)
        							g.drawLine(352, 369, 345, 376);
        	if (etapa >= 2472)
        							g.drawLine(326, 376, 346, 376);
        	if (etapa >= 2473)
        				        	g.setColor(new Color(8,11,6)); // Verde oscuro
        	if (etapa >= 2474)
        					        g.fillRect(392, 254, 480, 8);
        	if (etapa >= 2475)
        					        g.setColor(new Color(11,14,20)); //Negro 
        	if (etapa >= 2476)
        					        g.fillRect(396, 262, 476, 8);
        	if (etapa >= 2477)
        					        g.setColor(new Color(127,118,113)); //Gris
        	if (etapa >= 2478)
        					        g.fillPolygon(new int[]{455, 695, 585, 390}, new int[]{180, 180, 254, 254}, 4);
        	if (etapa >= 2479)
        					        g.setColor(new Color(173,163,161)); //Gris claro
        	if (etapa >= 2480)
        					        g.drawLine(500, 188, 520, 188);
        	if (etapa >= 2481)
        					        g.drawLine(500, 188, 493, 195);
        	if (etapa >= 2482)
        					        g.drawLine(520, 188, 513, 195);
        	if (etapa >= 2483)
        					        g.drawLine(494, 195, 514, 195);
        	if (etapa >= 2484)
        					        g.drawLine(485, 195, 505, 195);
        	if (etapa >= 2485)
        					        g.drawLine(485, 195, 478, 202);
        	if (etapa >= 2486)
        					        g.drawLine(505, 195, 498, 202);
        	if (etapa >= 2487)
        					        g.drawLine(479, 202, 499, 202);
        	if (etapa >= 2488)
        					        g.drawLine(505, 195, 525, 195);
        	if (etapa >= 2489)
        					        g.drawLine(505, 195, 498, 202);
        	if (etapa >= 2490)
        					        g.drawLine(525, 195, 518, 202);
        	if (etapa >= 2491)
        					        g.drawLine(499, 202, 519, 202);
        	if (etapa >= 2492)
        					        g.drawLine(470, 223, 490, 223);
        	if (etapa >= 2493)
        					        g.drawLine(470, 223, 463, 230);
        	if (etapa >= 2494)
        					        g.drawLine(490, 223, 483, 230);
        	if (etapa >= 2495)
        					        g.drawLine(464, 230, 484, 230);
        	if (etapa >= 2496)
        					        g.drawLine(455, 230, 475, 230);
        	if (etapa >= 2497)
        					        g.drawLine(455, 230, 448, 237);
        	if (etapa >= 2498)
        					        g.drawLine(475, 230, 468, 237);
        	if (etapa >= 2499)
        					        g.drawLine(449, 237, 469, 237);
        	if (etapa >= 2500)
        					        g.drawLine(475, 230, 495, 230);
        	if (etapa >= 2501)
        					        g.drawLine(475, 230, 468, 237);
        	if (etapa >= 2502)
        					        g.drawLine(495, 230, 488, 237);
        	if (etapa >= 2503)
        					        g.drawLine(469, 237, 489, 237);
        	if (etapa >= 2504)
        					        g.setColor(new Color(67,82,104)); // Azul
        	if (etapa >= 2505)
        					        g.fillPolygon(new int[]{565, 695, 585, 535}, new int[]{180, 180, 254, 254}, 4);
        	if (etapa >= 2506)
        				        	g.setColor(new Color(139,150,147)); // Verde oscuro
        	if (etapa >= 2507)
        					        g.fillRect(415, 270, 193, 114);
        	if (etapa >= 2508)
        				        	g.setColor(new Color(99,110,112)); // Gris
        	if (etapa >= 2509)
        					        ;//9
        	if (etapa >= 2510)
        				        	g.setColor(new Color(46,47,40)); 
        	if (etapa >= 2511)
        					        g.fillRect(415, 270, 193, 5);
        	if (etapa >= 2512)
        				        	g.setColor(new Color(67,78,69)); // Verde muy oscuro
        	if (etapa >= 2513)
        					        g.fillRect(415, 275, 193, 5);
        	if (etapa >= 2514)
        				        	g.setColor(new Color(101,114,102)); // Verde oscuro oscuro
        	if (etapa >= 2515)
        					        g.fillRect(415, 280, 193, 32);
        	if (etapa >= 2516)
        				        	g.setColor(new Color(115,134,136)); // El verde más oscuro
        	if (etapa >= 2517)
        				        	g.fillRect(415, 341, 185, 4);
        	if (etapa >= 2518)
        				        	g.setColor(new Color(67,78,69)); // Verde muy oscuro
        	if (etapa >= 2519)
        				        	;//10
        	if (etapa >= 2520)
        			        	g.setColor(new Color(8,11,6)); // Verde oscuro
        	if (etapa >= 2521)
        				        g.fillRect(755, 430, 310, 11);
        	if (etapa >= 2522)
        				        g.setColor(new Color(11,14,20)); //Negro 
        	if (etapa >= 2523)
        				        g.fillRect(755, 440, 305, 11);
        	if (etapa >= 2524)
        				        g.setColor(new Color(127,118,113)); //Gris
        	if (etapa >= 2525)
        				        g.fillPolygon(new int[]{605, 1025, 1065, 775}, new int[]{330, 330, 430, 430}, 4);
        	if (etapa >= 2526)
        				        g.setColor(new Color(173,163,161)); //Gris claro
        	if (etapa >= 2527)
        				        g.drawLine(1020, 403, 1000, 403);
        	if (etapa >= 2528)
        				        g.drawLine(1020, 403, 1027, 410);
        	if (etapa >= 2529)
        				        g.drawLine(1000, 403, 1007, 410);
        	if (etapa >= 2530)
        				        g.drawLine(1026, 410, 1006, 410);
        	if (etapa >= 2531)
        				        g.drawLine(1035, 410, 1015, 410);
        	if (etapa >= 2532)
        				        g.drawLine(1035, 410, 1042, 417);
        	if (etapa >= 2533)
        				        g.drawLine(1015, 410, 1022, 417);
        	if (etapa >= 2534)
        				        g.drawLine(1041, 417, 1021, 417);
        	if (etapa >= 2535)
        				        g.drawLine(1015, 410, 995, 410);
        	if (etapa >= 2536)
        				        g.drawLine(1015, 410, 1022, 417);
        	if (etapa >= 2537)
        				        g.drawLine(995, 410, 1002, 417);
        	if (etapa >= 2538)
        				        g.drawLine(1021, 417, 1001, 417);
        	if (etapa >= 2539)
        				        g.drawLine(1020, 403, 1000, 403);
        	if (etapa >= 2540)
        				        g.drawLine(1020, 403, 1027, 410);
        	if (etapa >= 2541)
        				        g.drawLine(1000, 403, 1007, 410);
        	if (etapa >= 2542)
        				        g.drawLine(1026, 410, 1006, 410);
        	if (etapa >= 2543)
        				        g.drawLine(1035, 410, 1015, 410);
        	if (etapa >= 2544)
        				        g.drawLine(1035, 410, 1042, 417);
        	if (etapa >= 2545)
        				        g.drawLine(1015, 410, 1022, 417);
        	if (etapa >= 2546)
        				        g.drawLine(1041, 417, 1021, 417);
        	if (etapa >= 2547)
        				        g.drawLine(1015, 410, 995, 410);
        	if (etapa >= 2548)
        				        g.drawLine(1015, 410, 1022, 417);
        	if (etapa >= 2549)
        				        g.drawLine(995, 410, 1002, 417);
        	if (etapa >= 2550)
        				        g.drawLine(1021, 417, 1001, 417);
        	if (etapa >= 2551)
        				        g.drawLine(930, 403, 910, 403);
        	if (etapa >= 2552)
        				        g.drawLine(930, 403, 937, 410);
        	if (etapa >= 2553)
        				        g.drawLine(910, 403, 917, 410);
        	if (etapa >= 2554)
        				        g.drawLine(936, 410, 916, 410);
        	if (etapa >= 2555)
        				        g.drawLine(945, 410, 925, 410);
        	if (etapa >= 2556)
        				        g.drawLine(945, 410, 952, 417);
        	if (etapa >= 2557)
        				        g.drawLine(925, 410, 932, 417);
        	if (etapa >= 2558)
        				        g.drawLine(951, 417, 931, 417);
        	if (etapa >= 2559)
        				        g.drawLine(925, 410, 905, 410);
        	if (etapa >= 2560)
        				        g.drawLine(925, 410, 932, 417);
        	if (etapa >= 2561)
        				        g.drawLine(905, 410, 912, 417);
        	if (etapa >= 2562)
        				        g.drawLine(931, 417, 911, 417);
        	if (etapa >= 2563)
        				        g.drawLine(840, 403, 820, 403);
        	if (etapa >= 2564)
        				        g.drawLine(840, 403, 847, 410);
        	if (etapa >= 2565)
        				        g.drawLine(820, 403, 827, 410);
        	if (etapa >= 2566)
        				        g.drawLine(846, 410, 826, 410);
        	if (etapa >= 2567)
        				        g.drawLine(855, 410, 835, 410);
        	if (etapa >= 2568)
        				        g.drawLine(855, 410, 862, 417);
        	if (etapa >= 2569)
        				        g.drawLine(835, 410, 842, 417);
        	if (etapa >= 2570)
        				        g.drawLine(861, 417, 841, 417);
        	if (etapa >= 2571)
        				        g.drawLine(835, 410, 815, 410);
        	if (etapa >= 2572)
        				        g.drawLine(835, 410, 842, 417);
        	if (etapa >= 2573)
        				        g.drawLine(815, 410, 822, 417);
        	if (etapa >= 2574)
        				        g.drawLine(841, 417, 821, 417);
        	if (etapa >= 2575)
        				        g.setColor(new Color(67,82,104)); //Azul oscuro
        	if (etapa >= 2576)
        				        g.fillPolygon(new int[]{710, 895, 875, 750}, new int[]{370, 370, 400, 400}, 4);
        	if (etapa >= 2577)
        					        g.setColor(new Color(127,118,113)); //Gris
        	if (etapa >= 2578)
        					        g.fillRect(755, 150, 287, 11);
        	if (etapa >= 2579)
        					        ;//11
        	if (etapa >= 2580)
        					        g.setColor(new Color(216,226,255)); 
        	if (etapa >= 2581)
        					        g.fillRect(1042, 93, 7, 280);
        	if (etapa >= 2582)
        					        g.fillPolygon(new int[]{971, 990, 971}, new int[]{98, 98, 118}, 3);
        	if (etapa >= 2583)
        				        	g.setColor(new Color(8,11,6)); // El verde más oscuro
        	if (etapa >= 2584)
        					        g.fillPolygon(new int[]{971, 990, 990, 971}, new int[]{112, 92, 98, 118}, 4);
        	if (etapa >= 2585)
        					        g.fillRect(990, 94, 52, 6);
        	if (etapa >= 2586)
        					        g.fillPolygon(new int[]{971, 990, 990, 971}, new int[]{102, 82, 88, 108}, 4);
        	if (etapa >= 2587)
        					        g.fillRect(990, 84, 52, 6);
        	if (etapa >= 2588)
        					        g.fillRect(973, 100, 4, 11);
        	if (etapa >= 2589)
        					        g.fillRect(988, 84, 4, 16);
        	if (etapa >= 2590)
        					        g.fillPolygon(new int[]{1026, 1040, 1040, 1028}, new int[]{94, 84, 88, 98}, 4);
        	if (etapa >= 2591)
        					        g.fillRect(1036, 86, 4, 11);
        	if (etapa >= 2592)
        					        g.fillPolygon(new int[]{973, 973, 990, 1038, 1040, 1000}, new int[]{100, 92, 72, 72, 87, 87}, 6);
        	if (etapa >= 2593)
        			        	g.setColor(new Color(139,150,147)); // Verde oscuro
        	if (etapa >= 2594)
        				        g.fillPolygon(new int[]{752, 890, 1028, 1028, 752}, new int[]{260, 130, 260, 380, 380}, 5);
        	if (etapa >= 2595)
        				        g.setColor(new Color(115,134,136)); // Azul
        	if (etapa >= 2596)
        				        g.fillRect(752, 310, 276, 8);
        	if (etapa >= 2597)
        			        	g.setColor(new Color(100,111,113)); // Gris
        	if (etapa >= 2598)
        			        	;//12
        	if (etapa >= 2599)
        			        	g.setColor(new Color(8,11,6)); // El verde más oscuro
        	if (etapa >= 2600)
        				        g.fillPolygon(new int[]{712, 884, 1062, 1051, 1024, 884, 772}, new int[]{244, 80, 240, 255, 255, 112, 244}, 7);
        	if (etapa >= 2601)
        			        	g.setColor(new Color(46,47,40)); // Verde muy muy oscuro
        	if (etapa >= 2602)
        				        g.fillPolygon(new int[]{753, 884, 1028, 1028, 884, 753}, new int[]{236, 104, 236, 245, 113, 245}, 6);
        	if (etapa >= 2603)
        			        	g.setColor(new Color(67,78,69)); // Verde muy oscuro
        	if (etapa >= 2604)
        				        g.fillPolygon(new int[]{753, 884, 1028, 1028, 884, 753}, new int[]{245, 113, 245, 254, 122, 254}, 6);
        	if (etapa >= 2605)
        			        	g.setColor(new Color(101,114,102)); // Verde oscuro
        	if (etapa >= 2606)
        				        g.fillPolygon(new int[]{752, 884, 1028, 1028, 930, 838, 752}, new int[]{254, 122, 254, 279, 195, 195, 279}, 7);
        	if (etapa >= 2607)
        			        	g.setColor(new Color(67,78,69)); // Verde muy oscuro
        	if (etapa >= 2608)
        				        ;//13
        	if (etapa >= 2609)
        			        	g.setColor(new Color(101,114,102)); // Verde oscuro
        	if (etapa >= 2610)
        				        g.fillRect(864, 182, 40, 30);
        	if (etapa >= 2611)
        			        	g.setColor(new Color(67,78,69)); // Verde muy oscuro
        	if (etapa >= 2612)
        				        g.fillRect(864, 165, 40, 30);
        	if (etapa >= 2613)
        			        	g.setColor(new Color(46,47,40)); // Verde muy muy oscuro
        	if (etapa >= 2614)
        				        ;//14
        	if (etapa >= 2615)
        			        	g.setColor(new Color(209,205,200)); // Blanco
        	if (etapa >= 2616)
        				        g.fillRect(589, 260, 163, 114);
        	if (etapa >= 2617)
        				        g.fillRect(589, 260, 16, 144);
        	if (etapa >= 2618)
        			        	g.setColor(new Color(171,155,130)); // Cafe
        	if (etapa >= 2619)
        				        g.fillRect(589, 246, 163, 22);
        	if (etapa >= 2620)
        			        	g.setColor(new Color(176,170,157)); 
        	if (etapa >= 2621)
        				        g.fillRect(589, 268, 163, 10);
        	if (etapa >= 2622)
        			        	g.setColor(new Color(196,195,189)); 
        	if (etapa >= 2623)
        				        g.fillRect(589, 278, 163, 10);
        	if (etapa >= 2624)
        			        	g.setColor(new Color(176,170,157)); 
        	if (etapa >= 2625)
        						g.drawLine(603, 268, 603, 388);
        	if (etapa >= 2626)
        						g.drawLine(737, 268, 737, 373);
        	if (etapa >= 2627)
        						;//15
        	if (etapa >= 2628)
        			        	g.setColor(new Color(37,47,66)); // Azul
        	if (etapa >= 2629)
        				        g.fillRect(639, 350, 43, 25);
        	if (etapa >= 2630)
        			        	g.setColor(new Color(8,11,6)); // El verde más oscuro
        	if (etapa >= 2631)
        				        g.fillOval(640, 263, 56, 56);
        	if (etapa >= 2632)
        			        	g.setColor(new Color(8,11,6));
        	if (etapa >= 2633)
        			        	g.setColor(new Color(181,166,149)); // Cafe claro
        	if (etapa >= 2634)
        				        g.fillOval(644, 267, 48, 48);
        	if (etapa >= 2635)
        			        	g.setColor(new Color(8,11,6)); // El verde más oscuro
        	if (etapa >= 2636)
        			        	g.drawLine(667, 267, 667, 318);
        	if (etapa >= 2637)
        			        	g.drawLine(642, 291, 694, 291);
        	if (etapa >= 2638)
        			        	g.setColor(new Color(170,153,133)); // Cafe
        	if (etapa >= 2639)
        				        g.fillRect(668, 279, 12, 12);
        	if (etapa >= 2640)
        				        g.fillRect(655, 292, 12, 12);
        	if (etapa >= 2641)
        				        g.drawRect(652, 276, 6, 6);
        	if (etapa >= 2642)
        				        g.drawRect(655, 279, 6, 6);
        	if (etapa >= 2643)
        				        g.fillRect(655, 279, 3, 3);
        	if (etapa >= 2644)
        				        g.drawRect(673, 297, 6, 6);
        	if (etapa >= 2645)
        				        g.drawRect(676, 300, 6, 6);
        	if (etapa >= 2646)
        				        g.fillRect(676, 300, 3, 3);
        	if (etapa >= 2647)
        			        	g.setColor(new Color(181,166,149)); // Cafe claro
        	if (etapa >= 2648)
        				        g.fillRect(674, 273, 7, 12);
        	if (etapa >= 2649)
        				        g.fillRect(649, 298, 12, 7);
        	if (etapa >= 2650)
        			        	g.setColor(new Color(8,11,6)); // El verde más oscuro
        	if (etapa >= 2651)
        				        g.fillPolygon(new int[]{532, 664, 796, 756, 664, 572}, new int[]{434, 310, 434, 434, 342, 434}, 6);
        	if (etapa >= 2652)
        			        	g.setColor(new Color(21,27,38)); // Azul oscuro
        	if (etapa >= 2653)
        				        g.fillPolygon(new int[]{572, 664, 755, 755, 664, 572}, new int[]{429, 330, 429, 439, 342, 439}, 6);
        	if (etapa >= 2654)
        			        	g.setColor(new Color(31,40,56)); // Azul menos oscuro
        	if (etapa >= 2655)
        				        g.fillPolygon(new int[]{572, 664, 755, 755, 664, 572}, new int[]{439, 340, 439, 455, 357, 455}, 6);
        	if (etapa >= 2656)
        			        	g.setColor(new Color(8,11,6)); // Verde oscuro
        	if (etapa >= 2657)
        				        g.fillRect(565, 244, 188, 12);
        	if (etapa >= 2658)
        				        g.setColor(new Color(11,14,20)); //Negro
        	if (etapa >= 2659)
        				        g.fillRect(579, 252, 174, 8);
        	if (etapa >= 2660)
        				        g.setColor(new Color(127,118,113)); //Gris
        	if (etapa >= 2661)
        				        g.fillPolygon(new int[]{610, 811, 713, 565}, new int[]{150, 150, 244, 244}, 4);
        	if (etapa >= 2662)
        				        g.setColor(new Color(173,163,161)); //Gris claro
        	if (etapa >= 2663)
        				        g.drawLine(650, 174, 670, 174);
        	if (etapa >= 2664)
        				        g.drawLine(650, 174, 643, 181);
        	if (etapa >= 2665)
        				        g.drawLine(670, 174, 663, 181);
        	if (etapa >= 2666)
        				        g.drawLine(644, 181, 664, 181);
        	if (etapa >= 2667)
        				        g.drawLine(635, 181, 655, 181);
        	if (etapa >= 2668)
        				        g.drawLine(635, 181, 628, 188);
        	if (etapa >= 2669)
        				        g.drawLine(655, 181, 648, 188);
        	if (etapa >= 2670)
        				        g.drawLine(629, 188, 649, 188);
        	if (etapa >= 2671)
        				        g.drawLine(655, 181, 675, 181);
        	if (etapa >= 2672)
        				        g.drawLine(655, 181, 648, 188);
        	if (etapa >= 2673)
        				        g.drawLine(675, 181, 668, 188);
        	if (etapa >= 2674)
        				        g.drawLine(649, 188, 669, 188);
        	if (etapa >= 2675)
        				        g.drawLine(620, 209, 640, 209);
        	if (etapa >= 2676)
        				        g.drawLine(620, 209, 613, 216);
        	if (etapa >= 2677)
        				        g.drawLine(640, 209, 633, 216);
        	if (etapa >= 2678)
        				        g.drawLine(614, 216, 634, 216);
        	if (etapa >= 2679)
        				        g.drawLine(605, 216, 625, 216);
        	if (etapa >= 2680)
        				        g.drawLine(605, 216, 598, 223);
        	if (etapa >= 2681)
        				        g.drawLine(625, 216, 618, 223);
        	if (etapa >= 2682)
        				        g.drawLine(599, 223, 619, 223);
        	if (etapa >= 2683)
        				        g.drawLine(625, 216, 645, 216);
        	if (etapa >= 2684)
        				        g.drawLine(625, 216, 618, 223);
        	if (etapa >= 2685)
        				        g.drawLine(645, 216, 638, 223);
        	if (etapa >= 2686)
        				        g.drawLine(619, 223, 639, 223);
        	if (etapa >= 2687)
        				        g.drawLine(710, 188, 730, 188);
        	if (etapa >= 2688)
        				        g.drawLine(710, 188, 703, 195);
        	if (etapa >= 2689)
        				        g.drawLine(730, 188, 723, 195);
        	if (etapa >= 2690)
        				        g.drawLine(704, 195, 724, 195);
        	if (etapa >= 2691)
        				        g.drawLine(695, 195, 715, 195);
        	if (etapa >= 2692)
        				        g.drawLine(695, 195, 688, 202);
        	if (etapa >= 2693)
        				        g.drawLine(715, 195, 708, 202);
        	if (etapa >= 2694)
        				        g.drawLine(689, 202, 709, 202);
        	if (etapa >= 2695)
        				        g.drawLine(715, 195, 735, 195);
        	if (etapa >= 2696)
        				        g.drawLine(715, 195, 708, 202);
        	if (etapa >= 2697)
        				        g.drawLine(735, 195, 728, 202);
    }
    


    public static void etapasParte3(int etapa, Graphics g) {
    	if (etapa >= 2698) {
    		

            // Cielo
    	        g.setColor(new Color(216,226,255));
    	        g.fillRect(5, 5, 1175, 525);
    	        
    	        //Nubes
    	        g.setColor(new Color(220,241,255));
    	        g.fillOval(-99, -127, 250, 190);
    	        g.fillOval(-19, -22, 220, 40);
    	        g.setColor(Color.white);
    	        g.fillOval(-100, -130, 250, 190);
    	        g.fillOval(-20, -25, 220, 40);
    	        
    	        g.setColor(new Color(220,241,255));
    	        g.fillOval(430, -60, 240, 80);
    	        g.setColor(Color.white);
    	        g.fillOval(428, -63, 240, 80);
    	        g.setColor(new Color(220,241,255));
    	        g.fillOval(548, -25, 58, 50);
    	        g.setColor(Color.white);
    	        g.fillOval(545, -27, 62, 50);
    	        g.setColor(new Color(220,241,255));
    	        g.fillOval(260, -35, 240, 80);
    	        g.setColor(Color.white);
    	        g.fillOval(258, -38, 243, 80);
    	        g.setColor(new Color(220,241,255));
    	        g.fillOval(298, 16, 70, 40);
    	        g.setColor(Color.white);
    	        g.fillOval(301, 14, 70, 40);
    	        g.setColor(new Color(220,241,255));
    	        g.fillOval(398, 30, 52, 23);
    	        g.setColor(Color.white);
    	        g.fillOval(401, 28, 50, 22);
    	        
    	        g.setColor(new Color(220,241,255));
    	        g.fillOval(990, -35, 240, 70);
    	        g.setColor(Color.white);
    	        g.fillOval(988, -38, 243, 70);
    	        g.setColor(new Color(220,241,255));
    	        g.fillOval(1051, 8, 71, 41);
    	        g.setColor(Color.white);
    	        g.fillOval(1050, 6, 70, 40);
    	        
    	        g.setColor(new Color(220,241,255));
    	        g.fillOval(111, 158, 81, 26);
    	        g.setColor(Color.white);
    	        g.fillOval(111, 156, 81, 26);
    	        g.fillOval(131, 146, 81, 31);
    	        g.fillOval(121, 146, 36, 32);
    	        g.setColor(new Color(220,241,255));
    	        g.fillOval(171, 160, 29, 25);
    	        g.setColor(Color.white);
    	        g.fillOval(171, 158, 29, 25);
    	        g.setColor(new Color(220,241,255));
    	        g.fillOval(121, 160, 29, 30);
    	        g.setColor(Color.white);
    	        g.fillOval(121, 158, 29, 30);
    	        g.setColor(new Color(220,241,255));
    	        g.fillOval(161, 135, 29, 27);
    	        g.setColor(Color.white);
    	        g.fillOval(161, 133, 29, 27);
    	        g.setColor(new Color(220,241,255));
    	        g.fillOval(150, 145, 26, 23);
    	        g.setColor(Color.white);
    	        g.fillOval(150, 143, 26, 23);
    	        g.setColor(new Color(220,241,255));
    	        g.fillOval(170, 145, 26, 23);
    	        g.setColor(Color.white);
    	        g.fillOval(170, 143, 26, 23);
    	        
    	        g.setColor(new Color(220,241,255));
    	        g.fillOval(491, 126, 93, 36);
    	        g.setColor(Color.white);
    	        g.fillOval(490, 124, 93, 36);
    	        g.fillOval(501, 118, 38, 34);
    	        g.setColor(new Color(220,241,255));
    	        g.fillOval(551, 130, 37, 33);
    	        g.setColor(Color.white);
    	        g.fillOval(551, 128, 37, 32);
    	        g.setColor(new Color(220,241,255));
    	        g.fillOval(501, 132, 35, 37);
    	        g.setColor(Color.white);
    	        g.fillOval(501, 130, 35, 37);
    	        g.fillOval(531, 120, 40, 40);
    	        
    	        g.setColor(new Color(220,241,255));
    	        g.fillOval(1111, 158, 81, 26);
    	        g.setColor(Color.white);
    	        g.fillOval(1111, 156, 81, 26);
    	        g.fillOval(1131, 146, 81, 31);
    	        g.fillOval(1121, 146, 36, 32);
    	        g.setColor(new Color(220,241,255));
    	        g.fillOval(1171, 160, 29, 25);
    	        g.setColor(Color.white);
    	        g.fillOval(1171, 158, 29, 25);
    	        g.setColor(new Color(220,241,255));
    	        g.fillOval(1121, 160, 29, 30);
    	        g.setColor(Color.white);
    	        g.fillOval(1121, 158, 29, 30);
    	        g.setColor(new Color(220,241,255));
    	        g.fillOval(1161, 135, 29, 27);
    	        g.setColor(Color.white);
    	        g.fillOval(1161, 133, 29, 27);
    	        g.setColor(new Color(220,241,255));
    	        g.fillOval(1150, 145, 26, 23);
    	        g.setColor(Color.white);
    	        g.fillOval(1150, 143, 26, 23);
    	        g.setColor(new Color(220,241,255));
    	        g.fillOval(1170, 145, 26, 23);
    	        g.setColor(Color.white);
    	        g.fillOval(1170, 143, 26, 23);
    	        
    	        g.setColor(new Color(220,241,255));
    	        g.fillOval(341, 195, 19, 17);
    	        g.setColor(Color.white);
    	        g.fillOval(341, 193, 12, 12);
    	        g.setColor(new Color(220,241,255));
    	        g.setColor(Color.white);
    	        g.fillOval(360, 196, 12, 11);
    	        g.setColor(new Color(220,241,255));
    	        g.fillOval(330, 205, 16, 13);
    	        g.setColor(Color.white);
    	        g.fillOval(330, 203, 16, 13);
    	        g.setColor(new Color(220,241,255));
    	        g.fillOval(350, 205, 16, 13);
    	        g.setColor(Color.white);
    	        g.fillOval(350, 203, 16, 13);
    	        g.fillOval(330, 197, 40, 17);
    	        
            // Marco dibujo
    	        g.setColor(Color.black);
    	        g.fillRect(0, 0, 1190, 5);
    	        g.fillRect(0, 755, 1190, 6);
    	        g.fillRect(0, 0, 5, 765);
    	        g.fillRect(1180, 0, 5, 765);
    	        
            // Suelo
    	        g.setColor(new Color(181,192,126));//Azul
    	        g.fillRect(5, 530, 1175, 225);
            
              	//lado izquierdo
    		        
    		        //Calle 
    		        g.setColor(new Color(237,233,234));
    		        g.fillPolygon(new int[]{126, 126, 5, 5}, new int[]{539, 561, 586, 549}, 4);
    	
    		        //Banqueta izquierda
    		        g.setColor(new Color(237,233,234));
    		        g.fillPolygon(new int[]{126, 126, 5, 5}, new int[]{571, 577, 606, 596}, 4);
    		        
    		        //Sombra casa
    		        g.setColor(new Color(139,148,97));
    		        g.fillRect(5, 608, 125, 35);
    		        
    		    //lado inferior
    		        g.setColor(new Color(237,233,234));
    		        g.fillPolygon(new int[]{518, 400, 5, 5, 200}, new int[]{667, 732, 732, 702, 646}, 5);
    		        g.fillPolygon(new int[]{5, 400, 430, 5}, new int[]{732, 732, 755, 755}, 4);
    		        
    		        // Banqueta
    			        g.setColor(new Color(237,233,234));
    			        g.fillRect(5, 710, 1175, 20);
    			        g.setColor(new Color(211,203,192));
    			        //Detalles lineas
    		        	g.drawLine(5, 710, 1179, 710);
    		        	g.drawLine(405, 730, 1179, 730);
    		        	g.drawLine(477, 710, 445, 729);
    		        	g.drawLine(587, 710, 571, 729);
    		        	g.drawLine(708, 710, 704, 729);
    		        	g.drawLine(828, 710, 834, 729);
    		        	g.drawLine(938, 710, 954, 729);
    		        	g.drawLine(1034, 710, 1058, 729);
    		        	g.drawLine(1120, 710, 1154, 729);
    	        	
            //Horizonte fondo
    	        
    	        //lado izquierdo
    		        g.setColor(new Color(36,49,38));
    		        g.fillRect(5, 503, 125, 37);
    		        
    		        //Lineas verticales 
    		        g.setColor(new Color(26,36,27));
    		        for(int j=0;j<5;j++) 
    		        	g.drawLine(5, 503+(j*9), 130, 503+(j*9));
    	
    		        //Lineas horizontales 
    		        for(int j=0;j<39;j++) 
    		        	g.drawLine(5+(j*3), 504, 5+(j*3), 539);
    	        
    	        //lado derecho
    		        g.setColor(new Color(36,49,38));
    		        g.fillRect(1002, 526, 178, 75);

    		        //Lineas verticales 
    		        g.setColor(new Color(26,36,27));
    		        for(int j=0;j<6;j++)
    		        	g.drawLine(1002, 526+(j*15), 1180, 526+(j*15));
    		        
    		        //Lineas horizontales 
    		        for(int j=0;j<39;j++) 
    		        	g.drawLine(1002+(j*5), 526, 1002+(j*5), 601);
    		        
    	    //Casa
    	        
    	        //Planta baja
    	        
    		        //Parte medio
    	        
    	        		//Pared
    			        for(int i=0;i<27;i++) {
    				        for(int j=0;j<6;j++) {
    				        	g.setColor(new Color(71,80,95)); 
    			        		g.fillRect(570+(j*36), 351+(i*12), 12, 6);
    				        	g.setColor(new Color(86,96,105));
    			        		g.fillRect(582+(j*36), 351+(i*12), 12, 6);
    					        g.setColor(new Color(56,64,85)); 
    			        		g.fillRect(594+(j*36), 351+(i*12), 12, 6);
    				        	g.setColor(new Color(86,96,105)); 
    				        	g.fillRect(564+(j*36), 357+(i*12), 12, 6);
    					        g.setColor(new Color(56,64,85)); 
    				        	g.fillRect(576+(j*36), 357+(i*12), 12, 6);
    					        g.setColor(new Color(71,80,95)); 
    				        	g.fillRect(588+(j*36), 357+(i*12), 12, 6);
    				        }
    			        }

    			        //Entrada
    			        g.setColor(new Color(31,40,56));
    			        g.fillOval(617, 460, 97, 97);
    			        g.fillRect(618, 517, 96, 137);
    			        g.setColor(new Color(5,7,10)); //Negro 
    			        g.fillRect(634, 504, 65, 112);
    			        g.setColor(new Color(99,99,62)); // Verde 
    			        g.fillRect(642, 512, 49, 96);
    			        g.setColor(new Color(5,7,10)); //Negro 
    			        g.drawLine(667, 512, 667, 612);
    			        g.drawLine(640, 536, 695, 536);
    			        g.drawLine(640, 560, 695, 560);
    			        g.drawLine(640, 584, 695, 584);
    			        g.setColor(new Color(117,117,73)); // Verde 
    			        g.drawRect(650, 520, 33, 36);
    			        g.fillRect(650, 520, 17, 16);
    			        g.fillRect(668, 537, 16, 19);
    			        g.drawRect(650, 564, 33, 36);
    			        g.fillRect(650, 565, 17, 19);
    			        g.fillRect(668, 585, 16, 16);
    			        
    			        // Pasto
    			        g.setColor(new Color(181,192,126));
    			        g.fillRect(520, 667, 448, 30);
    			        
    			        //Sombra pasto
    			        g.setColor(new Color(127,135,89));
    			        g.fillRect(512, 600, 60, 67);
    			        
    			        //Camino entrada
    			        g.setColor(new Color(224,214,215));
    			        g.fillPolygon(new int[]{617, 713, 699, 570}, new int[]{667, 667, 710, 710}, 4);
    			        
    			        // Escalera
    			        g.setColor(new Color(150,152,171));
    			        g.fillRect(618, 628, 96, 13);
    			        g.setColor(new Color(121,121,127));
    			        g.fillRect(618, 638, 96, 13);
    			        g.setColor(new Color(150,152,171));
    			        g.fillRect(618, 644, 96, 12);
    			        g.setColor(new Color(121,121,127));
    			        g.fillRect(618, 649, 96, 18);
    			        g.setColor(new Color(150,152,171));
    			        g.fillRect(618, 655, 96, 5);

    			        //Planta izquierda
    			        
    			        // Parte inferior
    					   for(int f=0;f<5;f++) {
    					      //Bloque (25 hojas)
    						       for(int g2=0;g2<2;g2++) {
    							       for(int h=0;h<2;h++) {
    							        //Bloque (5 hojas)
    								        //Hojas 2x2
    								        for(int i=0;i<2;i++) {
    									        for(int j=0;j<2;j++) {
    										        g.setColor(new Color(64,120,66)); // Verde 1
    										        g.fillOval(582+(j*6)+(g2*12), 550+(i*6)+(h*12)+(f*24), 6, 6);
    										        g.setColor(new Color(147,179,118)); // Verde 2
    										        g.drawOval(582+(j*6)+(g2*12), 550+(i*6)+(h*12)+(f*24), 6, 6);
    									        }
    								        }
    								        //Hoja central del 2x2
    								        g.setColor(new Color(64,120,66)); // Verde 1
    								        g.fillOval(585+(g2*12), 553+(h*12)+(f*24), 6, 6);
    								        g.setColor(new Color(147,179,118)); // Verde 2
    								        g.drawOval(585+(g2*12), 553+(h*12)+(f*24), 6, 6);
    							       }
    						       }
    					        
    					        //Bloque central de los Bloques
    						      //Hojas 2x2
    						        for(int i=0;i<2;i++) {
    							        for(int j=0;j<2;j++) {
    								        g.setColor(new Color(64,120,66)); // Verde 1
    								        g.fillOval(582+(j*6), 550+(i*6)+(f*24), 6, 6);
    								        g.setColor(new Color(147,179,118)); // Verde 2
    								        g.drawOval(582+(j*6), 550+(i*6)+(f*24), 6, 6);
    							        }
    						        }
    						        for(int i=0;i<2;i++) {
    							        //Hojas centrales de 2 2x2
    							        g.setColor(new Color(64,120,66)); // Verde 1
    							        g.fillOval(585+(i*6), 553+(i*6)+(f*24), 6, 6);
    							        g.setColor(new Color(147,179,118)); // Verde 2
    							        g.drawOval(585+(i*6), 553+(i*6)+(f*24), 6, 6);
    						        }
    					   }
    				     // Parte superior
    					   for(int f=0;f<5;f++) {
    				        //Bloque central de los Bloques
    					      //Hojas 2x2
    					        for(int i=0;i<2;i++) {
    						        for(int j=0;j<2;j++) {
    							        g.setColor(new Color(64,120,66)); // Verde 1
    							        g.fillOval(588+(j*6), 502+(i*6)+(f*12), 6, 6);
    							        g.setColor(new Color(147,179,118)); // Verde 2
    							        g.drawOval(588+(j*6), 502+(i*6)+(f*12), 6, 6);
    						        }
    					        }
    					        //Hojas centrales de 2 2x2
    					        g.setColor(new Color(64,120,66)); // Verde 1
    					        g.fillOval(591, 505+(f*12), 6, 6);
    					        g.setColor(new Color(147,179,118)); // Verde 2
    					        g.drawOval(591, 505+(f*12), 6, 6);
    					   }
    					   
    	
    				    // Planta derecha
    				        
    				        // Parte inferior
    						   for(int f=0;f<5;f++) {
    						      //Bloque (25 hojas)
    							       for(int g2=0;g2<2;g2++) {
    								       for(int h=0;h<2;h++) {
    								        //Bloque (5 hojas)
    									        //Hojas 2x2  261
    									        for(int i=0;i<2;i++) {
    										        for(int j=0;j<2;j++) {
    											        g.setColor(new Color(64,120,66)); // Verde 1
    											        g.fillOval(723+(j*6)+(g2*12), 550+(i*6)+(h*12)+(f*24), 6, 6);
    											        g.setColor(new Color(147,179,118)); // Verde 2
    											        g.drawOval(723+(j*6)+(g2*12), 550+(i*6)+(h*12)+(f*24), 6, 6);
    										        }
    									        }
    									        //Hoja central del 2x2
    									        g.setColor(new Color(64,120,66)); // Verde 1
    									        g.fillOval(726+(g2*12), 553+(h*12)+(f*24), 6, 6);
    									        g.setColor(new Color(147,179,118)); // Verde 2
    									        g.drawOval(726+(g2*12), 553+(h*12)+(f*24), 6, 6);
    								       }
    							       }
    						        
    						        //Bloque central de los Bloques
    							      //Hojas 2x2
    							        for(int i=0;i<2;i++) {
    								        for(int j=0;j<2;j++) {
    									        g.setColor(new Color(64,120,66)); // Verde 1
    									        g.fillOval(723+(j*6), 550+(i*6)+(f*24), 6, 6);
    									        g.setColor(new Color(147,179,118)); // Verde 2
    									        g.drawOval(723+(j*6), 550+(i*6)+(f*24), 6, 6);
    								        }
    							        }
    							        for(int i=0;i<2;i++) {
    								        //Hojas centrales de 2 2x2
    								        g.setColor(new Color(64,120,66)); // Verde 1
    								        g.fillOval(726+(i*6), 553+(i*6)+(f*24), 6, 6);
    								        g.setColor(new Color(147,179,118)); // Verde 2
    								        g.drawOval(726+(i*6), 553+(i*6)+(f*24), 6, 6);
    							        }
    						   }
    						   
    					     // Parte superior
    						   for(int f=0;f<5;f++) {
    					        //Bloque central de los Bloques
    						      //Hojas 2x2
    						        for(int i=0;i<2;i++) {
    							        for(int j=0;j<2;j++) {
    								        g.setColor(new Color(64,120,66)); // Verde 1
    								        g.fillOval(729+(j*6), 502+(i*6)+(f*12), 6, 6);
    								        g.setColor(new Color(147,179,118)); // Verde 2
    								        g.drawOval(729+(j*6), 502+(i*6)+(f*12), 6, 6);
    							        }
    						        }
    						        //Hojas centrales de 2 2x2
    						        g.setColor(new Color(64,120,66)); // Verde 1
    						        g.fillOval(732, 505+(f*12), 6, 6);
    						        g.setColor(new Color(147,179,118)); // Verde 2
    						        g.drawOval(732, 505+(f*12), 6, 6);
    						   }
    							   
    		        //Parte izquierda
    			        g.setColor(new Color(209,205,200));
    			        g.fillRect(124, 454, 448, 193);
    	
    			        g.setColor(new Color(71,80,95)); //Gris oscuro
    			        g.fillRect(124, 588, 448, 59);
    			        
    			        g.setColor(new Color(11,14,20)); //Negro 
    			        g.fillRect(124, 588, 448, 5);
    			        
    				    //Sombra
    			        g.setColor(new Color(176,170,157)); 
    			        g.fillRect(124, 461, 448, 8);
    			        g.setColor(new Color(196,195,189)); 
    			        g.fillRect(124, 469, 448, 11);
    			        
    				        // Textura Lineas horizontales 
    				        g.setColor(new Color(176,170,157)); 
    				        for(int i=0;i<11;i++) 
    					        g.drawLine(135, 456+(i*12), 571, 456+(i*12));
    				        g.setColor(new Color(176,170,157)); 
    				        g.drawLine(135, 456, 135, 587);
    				        
    			        //El resto de sombra
    			        g.setColor(new Color(171,155,130)); 
    			        g.fillRect(124, 454, 448, 7);
    			        
    			        //lampara izquierda
    			        g.setColor(new Color(11,14,20)); //Negro 
    			        g.fillOval(155, 499, 14, 17);
    			        g.setColor(Color.darkGray);
    			        g.fillOval(157, 501, 10, 13);
    			        g.fillRect(157, 486, 3, 17);
    			        g.fillRect(151, 486, 3, 17);
    			        g.fillOval(150, 480, 10, 10);
    			        g.setColor(new Color(176,170,157)); 
    			        g.fillOval(153, 483, 4, 9);
    			        g.setColor(new Color(71,80,95)); //Gris oscuro
    			        g.fillRect(148, 492, 8, 6);
    			        g.fillRect(142, 497, 20, 3);
    			        g.fillRect(140, 499, 24, 6);
    			        
    			        //lampara derecha
    			        g.setColor(new Color(11,14,20)); //Negro 
    			        g.fillOval(542, 499, 14, 17);
    			        g.setColor(Color.darkGray);
    			        g.fillOval(544, 501, 10, 13);
    			        g.fillRect(544, 486, 3, 17);
    			        g.fillRect(538, 486, 3, 17);
    			        g.fillOval(537, 480, 10, 10);
    			        g.setColor(new Color(176,170,157)); 
    			        g.fillOval(540, 483, 4, 9);
    			        g.setColor(new Color(71,80,95)); //Gris oscuro
    			        g.fillRect(535, 492, 8, 6);
    			        g.fillRect(529, 497, 20, 3);
    			        g.fillRect(527, 499, 24, 6);
    			        
    			        //Portón
    			        	//Madera 
    				        for(int i=0;i<11;i++) {
    					        for(int j=0;j<24;j++) {
    					        	g.setColor(new Color(166,116,89)); 
    						        g.fillRect(206+(j*13), 513+(i*13), 13, 13);
    						        g.setColor(new Color(96,43,26)); 
    						        g.drawOval(207+(j*13), 514+(i*13), 3, 3);
    						        g.drawLine(209+(j*13), 520+(i*13), 209+(j*13), 524+(i*13));
    						        g.drawLine(214+(j*13), 516+(i*13), 214+(j*13), 519+(i*13));
    						        g.drawOval(215+(j*13), 522+(i*13), 2, 2);
    					        }
    				        }
    				        //Ventanas
    				        for(int i=0;i<4;i++) {
    					        g.setColor(new Color(99,99,62)); // Verde
    					        g.fillRect(212+(i*68)+10*i, 518, 68, 40);
    					        g.setColor(new Color(11,14,20)); //Negro 
    					        g.drawRect(212+(i*68)+10*i, 518, 68, 40);
    					        g.fillRect(234+(i*68)+10*i,518,3,41);
    					        g.fillRect(256+(i*68)+10*i,518,3,41);
    					        g.fillRect(212+(i*68)+10*i,538,68,3);
    				        }
    			        
    			        g.setColor(new Color(11,14,20)); //Negro 
    			        g.fillRect(205, 513, 2, 134);
    			        g.drawLine(205, 512, 518, 512);
    			        g.drawLine(518, 512, 518, 646);
    			        
    			        // Sombra piso 
    			        g.setColor(new Color(140,165,200));
    			        g.fillPolygon(new int[]{207, 180, 335, 313, 520, 555}, new int[]{647, 660, 660, 667, 667, 647}, 6);
    			        
    					  // Planta
    					        
    					    //Bloque 100 hojas
    					        for(int e=0;e<3;e++) {
    						        for(int f=0;f<2;f++) {
    					        	//Bloque (25 hojas)
    						        for(int g2=0;g2<2;g2++) {
    							        for(int h=0;h<2;h++) {
    							        //Bloque (5 hojas)
    								        //Hojas 2x2
    								        for(int i=0;i<2;i++) {
    									        for(int j=0;j<2;j++) {
    										        g.setColor(new Color(64,120,66)); // Verde 1
    										        g.fillOval(521+(j*6)+(g2*12)+(f*24), 596+(i*6)+(h*12)+(e*24), 6, 6);
    										        g.setColor(new Color(147,179,118)); // Verde 2
    										        g.drawOval(521+(j*6)+(g2*12)+(f*24), 596+(i*6)+(h*12)+(e*24), 6, 6);
    									        }
    								        }
    								        //Hoja central del 2x2
    								        g.setColor(new Color(64,120,66)); // Verde 1
    								        g.fillOval(524+(g2*12)+(f*24), 599+(h*12)+(e*24), 6, 6);
    								        g.setColor(new Color(147,179,118)); // Verde 2
    								        g.drawOval(524+(g2*12)+(f*24), 599+(h*12)+(e*24), 6, 6);
    							        }
    						        }
    						        //Bloque central de los Bloques
    							      //Hojas 2x2
    							        for(int i=0;i<2;i++) {
    								        for(int j=0;j<2;j++) {
    									        g.setColor(new Color(64,120,66)); // Verde 1
    									        g.fillOval(521+(j*6)+(f*24), 596+(i*6)+(e*24), 6, 6);
    									        g.setColor(new Color(147,179,118)); // Verde 2
    									        g.drawOval(521+(j*6)+(f*24), 596+(i*6)+(e*24), 6, 6);
    								        }
    							        }
    							        for(int i=0;i<2;i++) {
    								        //Hojas centrales de 2 2x2
    								        g.setColor(new Color(64,120,66)); // Verde 1
    								        g.fillOval(524+(i*6)+(f*24), 599+(i*6)+(e*24), 6, 6);
    								        g.setColor(new Color(147,179,118)); // Verde 2
    								        g.drawOval(524+(i*6)+(f*24), 599+(i*6)+(e*24), 6, 6);
    							        }
    					        }
    				        }
    			        
    		        //Parte derecha

    			        //Pared y sombras
    			        g.setColor(new Color(139,150,147)); // El Verde menos oscuro
    			        g.fillRect(755, 439, 261, 177); 
    			        g.setColor(new Color(46,47,40)); // Verde oscuro
    			        g.fillRect(755, 451, 261, 7);
    			        g.setColor(new Color(101,114,102)); // Verde menos menos oscuro
    			        g.fillRect(755, 459, 32, 150);
    			        g.fillRect(755, 459, 261, 20);
    			        g.setColor(new Color(67,78,69)); // Verde menos oscuro
    			        g.fillRect(755, 458, 261, 7);
    			        g.fillRect(755, 461, 10, 28);
    			        g.setColor(new Color(46,47,40)); // Verde oscuro
    			        g.fillRect(755, 451, 4, 30);
    			        g.setColor(new Color(67,78,69)); // Verde menos oscuro
    			        g.fillRect(755, 487, 4, 120);
    			        
    			        //Lineas verticales
    			        g.setColor(new Color(67,78,69)); // Verde menos oscuro
    			        for(int i=0;i<16;i++)
    			        	g.drawLine(758+(i*16), 460, 758+(i*16), 590);

    			        //Ventana izquierda
    		        	g.setColor(new Color(8,11,6)); // El verde más oscuro
    			        g.fillRect(790, 485, 44, 101);
    		        	g.setColor(new Color(170,153,133)); // cafe claro
    			        g.fillRect(794, 489, 36, 93);
    		        	g.setColor(new Color(150,135,118)); // cafe
    			        g.fillRect(797, 492, 11, 40);
    			        g.fillRect(797, 539, 11, 40);
    			        g.fillRect(815, 492, 11, 40);
    			        g.fillRect(815, 539, 11, 40);
    		        	g.setColor(new Color(170,153,133)); // cafe claro
    			        g.fillRect(801, 496, 3, 14);
    			        g.fillRect(801, 514, 3, 14);
    			        g.fillRect(819, 496, 3, 14);
    			        g.fillRect(819, 514, 3, 14);
    			        g.fillRect(801, 543, 3, 14);
    			        g.fillRect(801, 561, 3, 14);
    			        g.fillRect(819, 543, 3, 14);
    			        g.fillRect(819, 561, 3, 14);
    		        	g.setColor(new Color(8,11,6)); // El verde más oscuro
    			        g.drawLine(811, 486, 811, 589);
    			        g.drawLine(790, 535, 830, 535);
    			        
    			        //Ventana medio
    		        	g.setColor(new Color(8,11,6)); // El verde más oscuro
    			        g.fillRect(859, 485, 44, 101);
    		        	g.setColor(new Color(170,153,133)); // cafe claro
    			        g.fillRect(863, 489, 36, 93);
    		        	g.setColor(new Color(150,135,118)); // cafe
    			        g.fillRect(866, 492, 11, 40);
    			        g.fillRect(866, 539, 11, 40);
    			        g.fillRect(884, 492, 11, 40);
    			        g.fillRect(884, 539, 11, 40);
    		        	g.setColor(new Color(170,153,133)); // cafe claro
    			        g.fillRect(870, 496, 3, 14);
    			        g.fillRect(870, 514, 3, 14);
    			        g.fillRect(888, 496, 3, 14);
    			        g.fillRect(888, 514, 3, 14);
    			        g.fillRect(870, 543, 3, 14);
    			        g.fillRect(870, 561, 3, 14);
    			        g.fillRect(888, 543, 3, 14);
    			        g.fillRect(888, 561, 3, 14);
    			        g.setColor(new Color(8,11,6)); // El verde más oscuro
    			        g.drawLine(880, 486, 880, 589);
    			        g.drawLine(859, 535, 899, 535);

    			        //Ventana derecha
    			        g.setColor(new Color(8,11,6)); // El verde más oscuro
    			        g.fillRect(928, 485, 44, 101);
    			        g.setColor(new Color(170,153,133)); // cafe claro
    			        g.fillRect(932, 489, 36, 93);
    			        g.setColor(new Color(150,135,118)); // cafe
    			        g.fillRect(935, 492, 11, 40);
    			        g.fillRect(935, 539, 11, 40);
    			        g.fillRect(953, 492, 11, 40);
    			        g.fillRect(953, 539, 11, 40);
    			        g.setColor(new Color(170,153,133)); // cafe claro
    			        g.fillRect(939, 496, 3, 14);
    			        g.fillRect(939, 514, 3, 14);
    			        g.fillRect(957, 496, 3, 14);
    			        g.fillRect(957, 514, 3, 14);
    			        g.fillRect(939, 543, 3, 14);
    			        g.fillRect(939, 561, 3, 14);
    			        g.fillRect(957, 543, 3, 14);
    			        g.fillRect(957, 561, 3, 14);
    			        g.setColor(new Color(8,11,6)); // El verde más oscuro
    			        g.drawLine(949, 486, 949, 589);
    			        g.drawLine(928, 535, 968, 535);

    			        //Linea divisora horizontal
    			        g.setColor(new Color(11,14,20)); //Negro 
    			        g.fillRect(755, 585, 261, 5);
    			        
    			        // Parte baja
    			        g.setColor(new Color(71,80,95)); //Gris oscuro
    			        g.fillRect(755, 590, 261, 50);
    			        g.setColor(new Color(31,40,56)); //Gris más oscuro
    			        g.fillRect(755, 590, 5, 50);
    			        g.setColor(new Color(172,172,184)); //Gris 
    			        g.fillPolygon(new int[]{756, 756, 1045, 1017}, new int[]{625, 642, 642, 625}, 4);
    			        g.setColor(new Color(115,114,134)); // Otro Gris 
    			        g.fillRect(755, 625, 5, 40);
    			        g.setColor(new Color(71,80,95)); //Gris oscuro
    			        g.fillRect(755, 642, 289, 25);
    			        g.setColor(new Color(115,114,134)); // Otro Gris 
    			        g.fillRect(755, 642, 289, 7);
    			        g.setColor(new Color(71,80,95)); //Gris oscuro
    			        g.fillRect(755, 642, 5, 8);
    			        g.setColor(new Color(31,40,56)); //Gris más oscuro
    			        g.fillRect(755, 650, 5, 16);
    					        
    				//Plantas
    					        
    					//Hojas inferiores      
    					for(int f=0;f<7;f++) {
    			        	//Bloque (25 hojas)
    				        for(int g2=0;g2<2;g2++) {
    					        for(int h=0;h<2;h++) {
    					        //Bloque (5 hojas)
    						        //Hojas 2x2
    						        for(int i=0;i<2;i++) {
    							        for(int j=0;j<2;j++) {
    								        g.setColor(new Color(64,120,66)); // Verde 1
    								        g.fillOval(788+(j*6)+(g2*12)+(f*40), 643+(i*6)+(h*12), 6, 6);
    								        g.setColor(new Color(147,179,118)); // Verde 2
    								        g.drawOval(788+(j*6)+(g2*12)+(f*40), 643+(i*6)+(h*12), 6, 6);
    							        }
    						        }
    						        //Hoja central del 2x2
    						        g.setColor(new Color(64,120,66)); // Verde 1
    						        g.fillOval(791+(g2*12)+(f*40), 646+(h*12), 6, 6);
    						        g.setColor(new Color(147,179,118)); // Verde 2
    						        g.drawOval(791+(g2*12)+(f*40), 646+(h*12), 6, 6);
    					        }
    				        }
    				        //Bloque central de los Bloques 2x2
    					      //Hojas 2x2
    					        for(int i=0;i<2;i++) {
    						        for(int j=0;j<2;j++) {
    							        g.setColor(new Color(64,120,66)); // Verde 1
    							        g.fillOval(788+(j*6)+(f*40), 643+(i*6), 6, 6);
    							        g.setColor(new Color(147,179,118)); // Verde 2
    							        g.drawOval(788+(j*6)+(f*40), 643+(i*6), 6, 6);
    						        }
    					        }
    					        for(int i=0;i<2;i++) {
    						        //Hojas centrales de 2 2x2
    						        g.setColor(new Color(64,120,66)); // Verde 1
    						        g.fillOval(791+(i*6)+(f*40), 646+(i*6), 6, 6);
    						        g.setColor(new Color(147,179,118)); // Verde 2
    						        g.drawOval(791+(i*6)+(f*40), 646+(i*6), 6, 6);
    					        }
    					        
    					        // Hojas superiores
    					        if (f % 2 == 0) {
    						        g.setColor(new Color(64,120,66)); // Verde 1
    						        g.fillOval(791+(f*40), 640, 6, 6);
    						        g.fillOval(803+(f*40), 640, 6, 6);
    						        g.setColor(new Color(147,179,118)); // Verde 2
    						        g.drawOval(791+(f*40), 640, 6, 6);
    						        g.drawOval(803+(f*40), 640, 6, 6);
    					        } else {
    						      //Bloque (5 hojas)
    						        //Hojas 2x2
    						        for(int i=0;i<2;i++) {
    							        for(int j=0;j<2;j++) {
    								        g.setColor(new Color(64,120,66)); // Verde 1
    								        g.fillOval(794+(j*6)+(f*40), 637+(i*6), 6, 6);
    								        g.setColor(new Color(147,179,118)); // Verde 2
    								        g.drawOval(794+(j*6)+(f*40), 637+(i*6), 6, 6);
    							        }
    						        }
    						        //Hoja central del 2x2
    						        g.setColor(new Color(64,120,66)); // Verde 1
    						        g.fillOval(797+(f*40), 640, 6, 6);
    						        g.setColor(new Color(147,179,118)); // Verde 2
    						        g.drawOval(797+(f*40), 640, 6, 6);
    					        	
    					        }
    					 }
    			        
    	        //Planta alta
    		        
    		        
    		        //Parte izquierda
    			        
    				    //Tejado
    			        // Parte baja 
    		        	g.setColor(new Color(8,11,6)); // Verde oscuro
    			        g.fillRect(92, 434, 480, 11);
    			        g.setColor(new Color(11,14,20)); //Negro 
    			        g.fillRect(96, 445, 476, 10);
    			        

    				    // Parte media
    				        g.setColor(new Color(127,118,113)); //Gris
    				        g.fillPolygon(new int[]{205, 495, 455, 90}, new int[]{330, 330, 434, 434}, 4);
    				        
    				        //Ladrillos triple
    				        g.setColor(new Color(173,163,161)); //Gris claro
    				        g.drawLine(200, 358, 220, 358);
    				        g.drawLine(200, 358, 193, 365);
    				        g.drawLine(220, 358, 213, 365);
    				        g.drawLine(194, 365, 214, 365);
    				        g.drawLine(185, 365, 205, 365);
    				        g.drawLine(185, 365, 178, 372);
    				        g.drawLine(205, 365, 198, 372);
    				        g.drawLine(179, 372, 199, 372);
    				        g.drawLine(205, 365, 225, 365);
    				        g.drawLine(205, 365, 198, 372);
    				        g.drawLine(225, 365, 218, 372);
    				        g.drawLine(199, 372, 219, 372);
    				        
    				        g.drawLine(160, 403, 180, 403);
    				        g.drawLine(160, 403, 153, 410);
    				        g.drawLine(180, 403, 173, 410);
    				        g.drawLine(154, 410, 174, 410);
    				        g.drawLine(145, 410, 165, 410);
    				        g.drawLine(145, 410, 138, 417);
    				        g.drawLine(165, 410, 158, 417);
    				        g.drawLine(139, 417, 159, 417);
    				        g.drawLine(165, 410, 185, 410);
    				        g.drawLine(165, 410, 158, 417);
    				        g.drawLine(185, 410, 178, 417);
    				        g.drawLine(159, 417, 179, 417);
    	
    						g.drawLine(160, 403, 180, 403);
    						g.drawLine(160, 403, 153, 410);
    						g.drawLine(180, 403, 173, 410);
    						g.drawLine(154, 410, 174, 410);
    						g.drawLine(145, 410, 165, 410);
    						g.drawLine(145, 410, 138, 417);
    						g.drawLine(165, 410, 158, 417);
    						g.drawLine(139, 417, 159, 417);
    						g.drawLine(165, 410, 185, 410);
    						g.drawLine(165, 410, 158, 417);
    						g.drawLine(185, 410, 178, 417);
    						g.drawLine(159, 417, 179, 417);
    						
    						g.drawLine(240, 383, 260, 383);
    						g.drawLine(240, 383, 233, 390);
    						g.drawLine(260, 383, 253, 390);
    						g.drawLine(234, 390, 254, 390);
    						g.drawLine(225, 390, 245, 390);
    						g.drawLine(225, 390, 218, 397);
    						g.drawLine(245, 390, 238, 397);
    						g.drawLine(219, 397, 239, 397);
    						g.drawLine(245, 390, 265, 390);
    						g.drawLine(245, 390, 238, 397);
    						g.drawLine(265, 390, 258, 397);
    						g.drawLine(239, 397, 259, 397);

    						g.drawLine(270, 343, 290, 343);
    						g.drawLine(270, 343, 263, 350);
    						g.drawLine(290, 343, 283, 350);
    						g.drawLine(264, 350, 284, 350);
    						g.drawLine(255, 350, 275, 350);
    						g.drawLine(255, 350, 248, 357);
    						g.drawLine(275, 350, 268, 357);
    						g.drawLine(249, 357, 269, 357);
    						g.drawLine(275, 350, 295, 350);
    						g.drawLine(275, 350, 268, 357);
    						g.drawLine(295, 350, 288, 357);
    						g.drawLine(269, 357, 289, 357);
    						
    						g.drawLine(300, 403, 320, 403);
    						g.drawLine(300, 403, 293, 410);
    						g.drawLine(320, 403, 313, 410);
    						g.drawLine(294, 410, 314, 410);
    						g.drawLine(285, 410, 305, 410);
    						g.drawLine(285, 410, 278, 417);
    						g.drawLine(305, 410, 298, 417);
    						g.drawLine(279, 417, 299, 417);
    						g.drawLine(305, 410, 325, 410);
    						g.drawLine(305, 410, 298, 417);
    						g.drawLine(325, 410, 318, 417);
    						g.drawLine(299, 417, 319, 417);

    						//Parte oscura
    				        g.setColor(new Color(67,82,104)); //Azul oscuro
    				        g.fillPolygon(new int[]{315, 595, 612, 535, 390, 410, 250}, new int[]{330, 330, 360, 434, 434, 410, 410}, 7);

    				        //Más ladrillos triple
    				        g.setColor(new Color(47,61,87)); //Azul más oscuro
    						g.drawLine(300, 403, 320, 403);
    						g.drawLine(300, 403, 293, 410);
    						g.drawLine(320, 403, 313, 410);

    				        g.setColor(new Color(173,163,161)); //Gris claro
    						g.drawLine(293, 410, 314, 410);
    						
    				        g.setColor(new Color(47,61,87)); //Azul más oscuro
    						g.drawLine(410, 403, 430, 403);
    						g.drawLine(410, 403, 403, 410);
    						g.drawLine(430, 403, 423, 410);
    						g.drawLine(404, 410, 424, 410);
    						g.drawLine(395, 410, 415, 410);
    						g.drawLine(395, 410, 388, 417);
    						g.drawLine(415, 410, 408, 417);
    						g.drawLine(389, 417, 409, 417);
    						g.drawLine(415, 410, 435, 410);
    						g.drawLine(415, 410, 408, 417);
    						g.drawLine(435, 410, 428, 417);
    						g.drawLine(409, 417, 429, 417);

    				        g.setColor(new Color(173,163,161)); //Gris claro
    						g.drawLine(395, 410, 410, 410);
    						g.drawLine(395, 410, 388, 417);
    						g.drawLine(389, 417, 404, 417);

    				        g.setColor(new Color(47,61,87)); //Azul más oscuro
    						g.drawLine(510, 403, 530, 403);
    						g.drawLine(510, 403, 503, 410);
    						g.drawLine(530, 403, 523, 410);
    						g.drawLine(504, 410, 524, 410);
    						g.drawLine(495, 410, 515, 410);
    						g.drawLine(495, 410, 488, 417);
    						g.drawLine(515, 410, 508, 417);
    						g.drawLine(489, 417, 509, 417);
    						g.drawLine(515, 410, 535, 410);
    						g.drawLine(515, 410, 508, 417);
    						g.drawLine(535, 410, 528, 417);
    						g.drawLine(509, 417, 529, 417);
    						
    						g.drawLine(510, 403, 530, 403);
    						g.drawLine(510, 403, 503, 410);
    						g.drawLine(530, 403, 523, 410);
    						g.drawLine(504, 410, 524, 410);
    						g.drawLine(495, 410, 515, 410);
    						g.drawLine(495, 410, 488, 417);
    						g.drawLine(515, 410, 508, 417);
    						g.drawLine(489, 417, 509, 417);
    						g.drawLine(515, 410, 535, 410);
    						g.drawLine(515, 410, 508, 417);
    						g.drawLine(535, 410, 528, 417);
    						g.drawLine(509, 417, 529, 417);
    						g.drawLine(320, 383, 320, 383);
    						
    						g.drawLine(365, 383, 385, 383);
    						g.drawLine(365, 383, 358, 390);
    						g.drawLine(385, 383, 378, 390);
    						g.drawLine(359, 390, 379, 390);
    						g.drawLine(350, 390, 370, 390);
    						g.drawLine(350, 390, 343, 397);
    						g.drawLine(370, 390, 363, 397);
    						g.drawLine(344, 397, 364, 397);
    						g.drawLine(370, 390, 390, 390);
    						g.drawLine(370, 390, 363, 397);
    						g.drawLine(390, 390, 383, 397);
    						g.drawLine(364, 397, 384, 397);
    						
    						g.drawLine(415, 344, 435, 344);
    						g.drawLine(415, 344, 408, 351);
    						g.drawLine(435, 344, 428, 351);
    						g.drawLine(409, 351, 429, 351);
    						g.drawLine(400, 351, 420, 351);
    						g.drawLine(400, 351, 393, 358);
    						g.drawLine(420, 351, 413, 358);
    						g.drawLine(394, 358, 414, 358);
    						g.drawLine(420, 351, 440, 351);
    						g.drawLine(420, 351, 413, 358);
    						g.drawLine(440, 351, 433, 358);
    						g.drawLine(414, 358, 434, 358);
    						
    						g.drawLine(327, 362, 347, 362);
    						g.drawLine(327, 362, 320, 369);
    						g.drawLine(347, 362, 340, 369);
    						g.drawLine(321, 369, 341, 369);
    						g.drawLine(312, 369, 332, 369);
    						g.drawLine(312, 369, 305, 376);
    						g.drawLine(332, 369, 325, 376);
    						g.drawLine(306, 376, 326, 376);
    						g.drawLine(332, 369, 352, 369);
    						g.drawLine(332, 369, 325, 376);
    						g.drawLine(352, 369, 345, 376);
    						g.drawLine(326, 376, 346, 376);

    					//Parte superior
    						
    						//Tejado
    			        	g.setColor(new Color(8,11,6)); // Verde oscuro
    				        g.fillRect(392, 254, 480, 8);
    				        g.setColor(new Color(11,14,20)); //Negro 
    				        g.fillRect(396, 262, 476, 8);
    				        
    				        g.setColor(new Color(127,118,113)); //Gris
    				        g.fillPolygon(new int[]{455, 695, 585, 390}, new int[]{180, 180, 254, 254}, 4);
    				        
    				        //Ladrillos triple
    				        g.setColor(new Color(173,163,161)); //Gris claro
    				        g.drawLine(500, 188, 520, 188);
    				        g.drawLine(500, 188, 493, 195);
    				        g.drawLine(520, 188, 513, 195);
    				        g.drawLine(494, 195, 514, 195);
    				        g.drawLine(485, 195, 505, 195);
    				        g.drawLine(485, 195, 478, 202);
    				        g.drawLine(505, 195, 498, 202);
    				        g.drawLine(479, 202, 499, 202);
    				        g.drawLine(505, 195, 525, 195);
    				        g.drawLine(505, 195, 498, 202);
    				        g.drawLine(525, 195, 518, 202);
    				        g.drawLine(499, 202, 519, 202);
    				        
    				        g.drawLine(470, 223, 490, 223);
    				        g.drawLine(470, 223, 463, 230);
    				        g.drawLine(490, 223, 483, 230);
    				        g.drawLine(464, 230, 484, 230);
    				        g.drawLine(455, 230, 475, 230);
    				        g.drawLine(455, 230, 448, 237);
    				        g.drawLine(475, 230, 468, 237);
    				        g.drawLine(449, 237, 469, 237);
    				        g.drawLine(475, 230, 495, 230);
    				        g.drawLine(475, 230, 468, 237);
    				        g.drawLine(495, 230, 488, 237);
    				        g.drawLine(469, 237, 489, 237);

    				        g.setColor(new Color(67,82,104)); // Azul
    				        g.fillPolygon(new int[]{565, 695, 585, 535}, new int[]{180, 180, 254, 254}, 4);
    						
    					//Pared
    			        	g.setColor(new Color(139,150,147)); // Verde oscuro
    				        g.fillRect(415, 270, 193, 114);
    				        
    				        //Lineas
    			        	g.setColor(new Color(99,110,112)); // Gris
    				        for(int i=0;i<8;i++)
    				        	g.drawLine(426+(i*21), 270, 426+(i*21), 383);
    				        
    				        //Sombras
    			        	g.setColor(new Color(46,47,40)); 
    				        g.fillRect(415, 270, 193, 5);
    			        	g.setColor(new Color(67,78,69)); // Verde muy oscuro
    				        g.fillRect(415, 275, 193, 5);
    			        	g.setColor(new Color(101,114,102)); // Verde oscuro oscuro
    				        g.fillRect(415, 280, 193, 32);
    				        
    				        //Linea horizontal
    			        	g.setColor(new Color(115,134,136)); // El verde más oscuro
    			        	g.fillRect(415, 341, 185, 4);
    				        
    				        //Lineas oscuras
    			        	g.setColor(new Color(67,78,69)); // Verde muy oscuro
    				        for(int i=0;i<8;i++)
    				        	g.drawLine(426+(i*21), 275, 426+(i*21), 383);
    				        
    				        //Ventanas
    				        for(int i=0;i<3;i++) {
    				        	g.setColor(new Color(8,11,6)); // El verde más oscuro
    				        	g.fillRect(436+(i*53), 273, 46, 46);
    				        	g.setColor(new Color(181,166,149)); // Cafe claro
    				        	g.fillRect(440+(i*53), 277, 38, 38);
    				        	g.setColor(new Color(97,86,63)); // Cafe
    				        	g.drawOval(449+(i*53), 285, 20, 20);
    				        	g.setColor(new Color(8,11,6)); // El verde más oscuro
    				        	g.drawLine(459+(i*53), 277, 459+(i*53), 318);
    				        	g.drawLine(439+(i*53), 295, 479+(i*53), 295);
    				        }
    				        
    			    //Parte derecha
    			        
    			        // Tejado parte mas baja
    		        	g.setColor(new Color(8,11,6)); // Verde oscuro
    			        g.fillRect(755, 430, 310, 11);

    			        g.setColor(new Color(11,14,20)); //Negro 
    			        g.fillRect(755, 440, 305, 11);
    			        
    			        //Tejado parte media
    			        g.setColor(new Color(127,118,113)); //Gris
    			        g.fillPolygon(new int[]{605, 1025, 1065, 775}, new int[]{330, 330, 430, 430}, 4);
    			        
    			        //Ladrillos triple
    			        g.setColor(new Color(173,163,161)); //Gris claro
    			        g.drawLine(1020, 403, 1000, 403);
    			        g.drawLine(1020, 403, 1027, 410);
    			        g.drawLine(1000, 403, 1007, 410);
    			        g.drawLine(1026, 410, 1006, 410);
    			        g.drawLine(1035, 410, 1015, 410);
    			        g.drawLine(1035, 410, 1042, 417);
    			        g.drawLine(1015, 410, 1022, 417);
    			        g.drawLine(1041, 417, 1021, 417);
    			        g.drawLine(1015, 410, 995, 410);
    			        g.drawLine(1015, 410, 1022, 417);
    			        g.drawLine(995, 410, 1002, 417);
    			        g.drawLine(1021, 417, 1001, 417);
    			        
    			        g.drawLine(1020, 403, 1000, 403);
    			        g.drawLine(1020, 403, 1027, 410);
    			        g.drawLine(1000, 403, 1007, 410);
    			        g.drawLine(1026, 410, 1006, 410);
    			        g.drawLine(1035, 410, 1015, 410);
    			        g.drawLine(1035, 410, 1042, 417);
    			        g.drawLine(1015, 410, 1022, 417);
    			        g.drawLine(1041, 417, 1021, 417);
    			        g.drawLine(1015, 410, 995, 410);
    			        g.drawLine(1015, 410, 1022, 417);
    			        g.drawLine(995, 410, 1002, 417);
    			        g.drawLine(1021, 417, 1001, 417);
    			        
    			        g.drawLine(930, 403, 910, 403);
    			        g.drawLine(930, 403, 937, 410);
    			        g.drawLine(910, 403, 917, 410);
    			        g.drawLine(936, 410, 916, 410);
    			        g.drawLine(945, 410, 925, 410);
    			        g.drawLine(945, 410, 952, 417);
    			        g.drawLine(925, 410, 932, 417);
    			        g.drawLine(951, 417, 931, 417);
    			        g.drawLine(925, 410, 905, 410);
    			        g.drawLine(925, 410, 932, 417);
    			        g.drawLine(905, 410, 912, 417);
    			        g.drawLine(931, 417, 911, 417);
    			        
    			        g.drawLine(840, 403, 820, 403);
    			        g.drawLine(840, 403, 847, 410);
    			        g.drawLine(820, 403, 827, 410);
    			        g.drawLine(846, 410, 826, 410);
    			        g.drawLine(855, 410, 835, 410);
    			        g.drawLine(855, 410, 862, 417);
    			        g.drawLine(835, 410, 842, 417);
    			        g.drawLine(861, 417, 841, 417);
    			        g.drawLine(835, 410, 815, 410);
    			        g.drawLine(835, 410, 842, 417);
    			        g.drawLine(815, 410, 822, 417);
    			        g.drawLine(841, 417, 821, 417);

    					//Parte oscura
    			        g.setColor(new Color(67,82,104)); //Azul oscuro
    			        g.fillPolygon(new int[]{710, 895, 875, 750}, new int[]{370, 370, 400, 400}, 4);
    			        
    			        // Chimenea
    				        g.setColor(new Color(127,118,113)); //Gris
    				        g.fillRect(755, 150, 287, 11);
    	
    				        //Pared sombra
    				        for(int i=0;i<14;i++) {
    					        for(int j=0;j<8;j++) {
    						        g.setColor(new Color(92,103,145)); //Azul 1
    						        g.fillRect(971+(j*7), 98+(i*8), 7, 8);
    						        g.setColor(new Color(116,126,161)); //Azul 2
    						        g.fillRect(971+(j*7), 98+(i*8), 3, 2);
    						        g.fillRect(974+(j*7), 102+(i*8), 4, 2);
    						        g.setColor(new Color(103,110,150)); //Azul 3
    						        g.fillRect(971+(j*7), 100+(i*8), 3, 3);
    						        g.fillRect(974+(j*7), 104+(i*8), 4, 2);
    					        }
    				        }
    				        
    				        //Pared frontal
    				        for(int i=0;i<34;i++) {
    					        for(int j=0;j<8;j++) {
    						        g.setColor(new Color(111,125,176)); //Azul 1
    						        g.fillRect(990+(j*7), 100+(i*8), 7, 8);
    						        g.setColor(new Color(136,148,189)); //Azul 2
    						        g.fillRect(990+(j*7), 100+(i*8), 3, 2);
    						        g.fillRect(993+(j*7), 104+(i*8), 4, 2);
    						        g.setColor(new Color(124,132,181)); //Azul 3
    						        g.fillRect(990+(j*7), 102+(i*8), 3, 3);
    						        g.fillRect(993+(j*7), 106+(i*8), 4, 2);
    					        }
    				        }
    				        
    				        //Quitar paredes sobresalientes
    				        g.setColor(new Color(216,226,255)); 
    				        g.fillRect(1042, 93, 7, 280);
    				        g.fillPolygon(new int[]{971, 990, 971}, new int[]{98, 98, 118}, 3);
    				        
    				        //Parte superior
    			        	g.setColor(new Color(8,11,6)); // El verde más oscuro
    				        g.fillPolygon(new int[]{971, 990, 990, 971}, new int[]{112, 92, 98, 118}, 4);
    				        g.fillRect(990, 94, 52, 6);
    				        g.fillPolygon(new int[]{971, 990, 990, 971}, new int[]{102, 82, 88, 108}, 4);
    				        g.fillRect(990, 84, 52, 6);
    				        g.fillRect(973, 100, 4, 11);
    				        g.fillRect(988, 84, 4, 16);
    				        g.fillPolygon(new int[]{1026, 1040, 1040, 1028}, new int[]{94, 84, 88, 98}, 4);
    				        g.fillRect(1036, 86, 4, 11);
    				        g.fillPolygon(new int[]{973, 973, 990, 1038, 1040, 1000}, new int[]{100, 92, 72, 72, 87, 87}, 6);
    				        
    			        //Pared
    		        	g.setColor(new Color(139,150,147)); // Verde oscuro
    			        g.fillPolygon(new int[]{752, 890, 1028, 1028, 752}, new int[]{260, 130, 260, 380, 380}, 5);
    			        
    			        //Linea horizontal
    			        g.setColor(new Color(115,134,136)); // Azul
    			        g.fillRect(752, 310, 276, 8);
    			        
    			        //Lineas verticales
    		        	g.setColor(new Color(100,111,113)); // Gris
    			        for(int i=0;i<11;i++) 
    						g.drawLine(774+(i*23), 190, 774+(i*23), 380);
    			        
    			        //Tejado superior y sombra
    		        	g.setColor(new Color(8,11,6)); // El verde más oscuro
    			        g.fillPolygon(new int[]{712, 884, 1062, 1051, 1024, 884, 772}, new int[]{244, 80, 240, 255, 255, 112, 244}, 7);
    		        	g.setColor(new Color(46,47,40)); // Verde muy muy oscuro
    			        g.fillPolygon(new int[]{753, 884, 1028, 1028, 884, 753}, new int[]{236, 104, 236, 245, 113, 245}, 6);
    		        	g.setColor(new Color(67,78,69)); // Verde muy oscuro
    			        g.fillPolygon(new int[]{753, 884, 1028, 1028, 884, 753}, new int[]{245, 113, 245, 254, 122, 254}, 6);
    		        	g.setColor(new Color(101,114,102)); // Verde oscuro
    			        g.fillPolygon(new int[]{752, 884, 1028, 1028, 930, 838, 752}, new int[]{254, 122, 254, 279, 195, 195, 279}, 7);
    			        
    			        //Lineas sombra
    		        	g.setColor(new Color(67,78,69)); // Verde muy oscuro
    			        for(int i=0;i<11;i++) {
    			        	if(i<3)
    			        		g.drawLine(774+(i*23), 230-(i*24), 774+(i*23), 257-(i*23));
    			        	else if(i<5)
    			        		g.drawLine(774+(i*23), 230-(i*24), 774+(i*23), 194);
    			        	else if(i<7)
    			        		g.drawLine(774+(i*23), (i*24), 774+(i*23), 194);
    			        	else 
    			        		g.drawLine(774+(i*23), (i*23), 774+(i*23), 27+(i*24));
    			        }
    			        
    		        	g.setColor(new Color(101,114,102)); // Verde oscuro
    			        g.fillRect(864, 182, 40, 30);
    		        	g.setColor(new Color(67,78,69)); // Verde muy oscuro
    			        g.fillRect(864, 165, 40, 30);

    		        	g.setColor(new Color(46,47,40)); // Verde muy muy oscuro
    			        for(int i=0;i<8;i++) 
    				        g.drawRect(864, 164+(i*6), 39, 6);

    			        for(int i=0;i<3;i++) {
    			        	//Ventanas
    			        	g.setColor(new Color(8,11,6)); // El verde más oscuro
    				        g.fillRect(790+(i*80), 262, 49, 106);
    			        	g.setColor(new Color(181,166,149)); // Cafe claro
    				        g.fillRect(796+(i*80), 268, 37, 94);
    			        	g.setColor(new Color(8,11,6)); // El verde más oscuro
    				        g.drawLine(814+(i*80), 263, 814+(i*80), 366);
    				        g.drawLine(790+(i*80), 314, 834+(i*80), 314);
    			        	g.setColor(new Color(170,153,133)); // El verde más oscuro
    				        g.fillRect(796+(i*80), 284, 18, 15);
    				        g.fillRect(815+(i*80), 268, 18, 15);
    				        g.fillRect(815+(i*80), 299, 18, 15);
    				        g.fillRect(796+(i*80), 315, 18, 15);
    				        g.fillRect(796+(i*80), 347, 18, 15);
    				        g.fillRect(815+(i*80), 331, 18, 15);
    			        	g.setColor(new Color(125,111,82)); // Cafe
    				        g.drawRect(801+(i*80), 288, 6, 6);
    				        g.drawRect(821+(i*80), 335, 6, 6);
    			        	g.setColor(new Color(181,166,149)); // Cafe claro
    				        g.drawRect(821+(i*80), 274, 6, 32);
    				        g.drawRect(802+(i*80), 322, 6, 32);
    			        }
    			        
    		        // Parte medio
    			        
    			        //Pared
    		        	g.setColor(new Color(209,205,200)); // Blanco
    			        g.fillRect(589, 260, 163, 114);
    			        g.fillRect(589, 260, 16, 144);
    			        
    			        //Sombras
    		        	g.setColor(new Color(171,155,130)); // Cafe
    			        g.fillRect(589, 246, 163, 22);
    		        	g.setColor(new Color(176,170,157)); 
    			        g.fillRect(589, 268, 163, 10);
    		        	g.setColor(new Color(196,195,189)); 
    			        g.fillRect(589, 278, 163, 10);

    			        //Lineas verticales
    		        	g.setColor(new Color(176,170,157)); 
    					g.drawLine(603, 268, 603, 388);
    					g.drawLine(737, 268, 737, 373);
    					
    					//Lineas horizontales
    			        for(int i=0;i<8;i++)
    						g.drawLine(603, 291+(i*11), 736, 291+(i*11));
    			        
    			        //Sombra
    		        	g.setColor(new Color(37,47,66)); // Azul
    			        g.fillRect(639, 350, 43, 25);
    			        
    			        //Ventana
    		        	g.setColor(new Color(8,11,6)); // El verde más oscuro
    			        g.fillOval(640, 263, 56, 56);
    		        	g.setColor(new Color(8,11,6));
    		        	g.setColor(new Color(181,166,149)); // Cafe claro
    			        g.fillOval(644, 267, 48, 48);

    			        //Cruz 
    		        	g.setColor(new Color(8,11,6)); // El verde más oscuro
    		        	g.drawLine(667, 267, 667, 318);
    		        	g.drawLine(642, 291, 694, 291);
    		        	
    		        	//Decoraciones 
    		        	g.setColor(new Color(170,153,133)); // Cafe
    			        g.fillRect(668, 279, 12, 12);
    			        g.fillRect(655, 292, 12, 12);
    			        
    			        g.drawRect(652, 276, 6, 6);
    			        g.drawRect(655, 279, 6, 6);
    			        g.fillRect(655, 279, 3, 3);
    			        
    			        g.drawRect(673, 297, 6, 6);
    			        g.drawRect(676, 300, 6, 6);
    			        g.fillRect(676, 300, 3, 3);
    			        
    		        	g.setColor(new Color(181,166,149)); // Cafe claro
    			        g.fillRect(674, 273, 7, 12);
    			        g.fillRect(649, 298, 12, 7);
    			        
    		        	//Tejado abajo
    		        	g.setColor(new Color(8,11,6)); // El verde más oscuro
    			        g.fillPolygon(new int[]{532, 664, 796, 756, 664, 572}, new int[]{434, 310, 434, 434, 342, 434}, 6);

    			        //Sombra tejado
    		        	g.setColor(new Color(21,27,38)); // Azul oscuro
    			        g.fillPolygon(new int[]{572, 664, 755, 755, 664, 572}, new int[]{429, 330, 429, 439, 342, 439}, 6);
    		        	g.setColor(new Color(31,40,56)); // Azul menos oscuro
    			        g.fillPolygon(new int[]{572, 664, 755, 755, 664, 572}, new int[]{439, 340, 439, 455, 357, 455}, 6);
    			        
    					//Tejado parte superior
    		        	g.setColor(new Color(8,11,6)); // Verde oscuro
    			        g.fillRect(565, 244, 188, 12);
    			        g.setColor(new Color(11,14,20)); //Negro
    			        g.fillRect(579, 252, 174, 8);
    			        
    			        g.setColor(new Color(127,118,113)); //Gris
    			        g.fillPolygon(new int[]{610, 811, 713, 565}, new int[]{150, 150, 244, 244}, 4);
    			        
    			        //Ladrillos triple
    			        g.setColor(new Color(173,163,161)); //Gris claro
    			        g.drawLine(650, 174, 670, 174);
    			        g.drawLine(650, 174, 643, 181);
    			        g.drawLine(670, 174, 663, 181);
    			        g.drawLine(644, 181, 664, 181);
    			        g.drawLine(635, 181, 655, 181);
    			        g.drawLine(635, 181, 628, 188);
    			        g.drawLine(655, 181, 648, 188);
    			        g.drawLine(629, 188, 649, 188);
    			        g.drawLine(655, 181, 675, 181);
    			        g.drawLine(655, 181, 648, 188);
    			        g.drawLine(675, 181, 668, 188);
    			        g.drawLine(649, 188, 669, 188);

    			        g.drawLine(620, 209, 640, 209);
    			        g.drawLine(620, 209, 613, 216);
    			        g.drawLine(640, 209, 633, 216);
    			        g.drawLine(614, 216, 634, 216);
    			        g.drawLine(605, 216, 625, 216);
    			        g.drawLine(605, 216, 598, 223);
    			        g.drawLine(625, 216, 618, 223);
    			        g.drawLine(599, 223, 619, 223);
    			        g.drawLine(625, 216, 645, 216);
    			        g.drawLine(625, 216, 618, 223);
    			        g.drawLine(645, 216, 638, 223);
    			        g.drawLine(619, 223, 639, 223);
    			        
    			        g.drawLine(710, 188, 730, 188);
    			        g.drawLine(710, 188, 703, 195);
    			        g.drawLine(730, 188, 723, 195);
    			        g.drawLine(704, 195, 724, 195);
    			        g.drawLine(695, 195, 715, 195);
    			        g.drawLine(695, 195, 688, 202);
    			        g.drawLine(715, 195, 708, 202);
    			        g.drawLine(689, 202, 709, 202);
    			        g.drawLine(715, 195, 735, 195);
    			        g.drawLine(715, 195, 708, 202);
    			        g.drawLine(735, 195, 728, 202);
    			        g.drawLine(709, 202, 729, 202);
    		
    	}
    }
}
