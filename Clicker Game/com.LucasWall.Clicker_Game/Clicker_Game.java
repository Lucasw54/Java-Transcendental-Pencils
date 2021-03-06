package com.LucasWall.Clicker_Game;

//Imports
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Timer;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.border.Border;

public class Clicker_Game implements ActionListener
{//Beginning of Clicker_Game
	//Global Objects
	
	//------Random GUI Globals
	public static JPanel panel;
	public static JFrame frame;
	public static JLabel WelcomeLabel;
	public static JLabel label1;
	public static JLabel label2;
	public static JSeparator Divider1Label;
	public static JLabel Inspiration1Label;
	public static JLabel Inspiration2Label;
	public static Clicker_Game instance;
	public static JButton Quit1;
	public static JLabel DeveloperModeLabel;
	public static JButton DeveloperMode;
	public static JButton Save;
	public static JButton Load;
	public static JButton Back;
	public static JButton Options;
	public static JProgressBar bar = new JProgressBar();
	public static int counter = 0;
	public static boolean load = false;
	public static JLabel GUImodeLabel;
	public static JButton GUImode1Label;
	public static JButton GUImode2Label;
	public static JButton GUImode3Label;
	public static JButton GUImode4Label;
	public static JButton GUImode5Label;
	public static JButton GUImode6Label;
	public static JButton GUImode7Label;
	
	//Gui - Game Globals
	public static JButton MakePencil;
	public static JLabel PencilLabel;
	public static JLabel BusinessLabel;
	public static JSeparator Business;
	public static JLabel FundsLabel;
	public static JLabel InventoryLabel;
	public static JButton IncreasePrice;
	public static JButton DecreasePrice;
	public static JLabel PricePerPencilLabel;
	public static JLabel DemandLabel;
	public static JButton MarketingUpgrade;
	public static JLabel MarketingLvlLabel;
	public static JLabel MarketingUpgradeCost;
	public static JLabel ManufacturingLabel;
	public static JSeparator ManufacturingSeperator;
	public static JLabel PencilsPerSecond;
	public static JButton WoodBuy;
	public static JLabel WoodAmtLabel;
	public static JLabel WoodCostLabel;
	public static JButton LeadBuy;
	public static JLabel LeadAmtLabel;
	public static JLabel LeadCostLabel;
	public static JButton AutoAssemblerBuy;
	public static JLabel AutoAssemblerLabel;
	public static JLabel AutoAssemblerCostLabel;
	public static JLabel ComputationalResourcesLabel;
	public static JSeparator ComputationalResourcesSeparator;
	public static JLabel TrustLabel;
	public static JLabel Up1TrustAt;
	public static JButton ProcessorsButton;
	public static JLabel ProcessorsLabel;
	public static JButton MemoryButton;
	public static JLabel MemoryLabel;
	public static JLabel OperationsLabel;
	public static JLabel CreativityLabel;
	
	//Projects / Upgrades
	public static JLabel ProjectsLabel;
	public static JSeparator ProjectsSeparator;
	public static JLabel ImprovedAutoAssemblerLabel1;
	public static JLabel ImprovedAutoAssemblerLabel2;
	public static JButton ImprovedAutoAssemblersButton;
	public static JButton ImprovedWoodCuttingButton;
	public static JLabel ImprovedWoodCuttingLabel1;
	public static JLabel ImprovedWoodCuttingLabel2;
	public static JButton ImprovedLeadMoldingButton;
	public static JLabel ImprovedLeadMoldingLabel1;
	public static JLabel ImprovedLeadMoldingLabel2;
	public static JButton RevTrackerButton;
	public static JLabel RevTrackerLabel1;
	public static JLabel RevTrackerLabel2;
	public static JButton CreativityButton;
	public static JLabel CreativityLabel1;
	public static JLabel CreativityLabel2;
	public static boolean UpgradeA = true;
	public static boolean UpgradeB = true;
	public static boolean UpgradeC = true;
	public static boolean UpgradeD = true;
	public static boolean UpgradeE = true;
	public static boolean UpgradeF = true;
	public static boolean UpgradeG = true;
	public static boolean UpgradeH = true;
	public static boolean UpgradeI = true;
	public static boolean UpgradeJ = true;
	public static boolean UpgradeK = true;
	public static boolean UpgradeL = true;
	public static boolean UpgradeM = true;
	public static boolean UpgradeN = true;
	public static boolean UpgradeO = true;
	public static boolean UpgradeP = true;
	public static boolean UpgradeQ = true;
	public static boolean UpgradeR = true;
	public static boolean UpgradeS = true;
	public static boolean UpgradeT = true;
	
	public static double Slot1 = 1;
	public static double Slot2 = 1;
	public static double Slot3 = 1;
	public static double Slot4 = 1;
	public static double Slot5 = 1;
	public static double Slot6 = 1;
	
	public static JLabel Slot1Obj1;
	public static JLabel Slot1Obj2;
	public static JButton Slot1Obj3;
	public static JLabel Slot2Obj1;
	public static JLabel Slot2Obj2;
	public static JButton Slot2Obj3;
	public static JLabel Slot3Obj1;
	public static JLabel Slot3Obj2;
	public static JButton Slot3Obj3;

	//------Achievements
	public static JButton Achievements;
	public static JLabel AchievementsLabel;
	public static JSeparator AchievementsSeparator;
	public static JLabel AchievementsNotice;
	//Pencil Amounts
	public static JLabel PencilAchievements;
	public static JLabel PencilAchieve1;
	public static JLabel PencilAchieve1Image;
	public static JLabel PencilAchieve2;
	public static JLabel PencilAchieve2Image2;
	public static JLabel PencilAchieve3;
	public static JLabel PencilAchieve3Image;
	public static JLabel PencilAchieve4;
	public static JLabel PencilAchieve4Image;
	public static JLabel PencilAchieve5;
	public static JLabel PencilAchieve5Image;
	public static JLabel PencilAchieve6;
	public static JLabel PencilAchieve6Image;
	public static JLabel PencilAchieve7;
	public static JLabel PencilAchieve7Image;
	public static JLabel PencilAchieve8;
	public static JLabel PencilAchieve8Image;
	
	//AutoAssembler Amounts
	public static JLabel AutoAssemblerAchievements;
	public static JLabel AutoAssemblerAchieve1;
	public static JLabel AutoAssemblerAchieve1Image;
	public static JLabel AutoAssemblerAchieve2;
	public static JLabel AutoAssemblerAchieve2Image;
	public static JLabel AutoAssemblerAchieve3;
	public static JLabel AutoAssemblerAchieve3Image;

	//Materials Used
	public static JLabel MaterialsDepletedAchievements;
	public static JLabel MaterialsDepletedAchieve1;
	public static JLabel MaterialsDepletedAchieve1Image;
	public static JLabel MaterialsDepletedAchieve2;
	public static JLabel MaterialsDepletedAchieve2Image;
	public static JLabel MaterialsDepletedAchieve3;
	public static JLabel MaterialsDepletedAchieve3Image;
	public static JLabel MaterialsDepletedAchieve4;
	public static JLabel MaterialsDepletedAchieve4Image;
	public static JLabel MaterialsDepletedAchieve5;
	public static JLabel MaterialsDepletedAchieve5Image;
	public static JLabel MaterialsDepletedAchieve6;
	public static JLabel MaterialsDepletedAchieve6Image;
	public static JLabel MaterialsDepletedAchieve7;
	public static JLabel MaterialsDepletedAchieve7Image;
	public static JLabel MaterialsDepletedAchieve8;
	public static JLabel MaterialsDepletedAchieve8Image;
	
	//----Miscelaneous 
	public static boolean a = false;//Disabling buttons
	public static boolean b = false;

	public static int c = 0;
	
	//-----Selling
	public static int result = 0;
	public static int SellDemand = 0;
	public static boolean d = true;
	
	//------Game Objects
	
	public static double Pencils = 0;
	public static double Funds = 0;
	public static double Inventory = 0;
	public static double Price = 0.25;
	public static double MaterialsDepleted = 0;
	public static int Demand = 3200; 
	public static double DemandShow = Demand/100;
	public static double MarketingLvl = 1;
	public static double UpgradeMarketingCost = 100;
	public static double InventorySubbed;
	public static double PencilsPerSecondValue;
	public static double WoodAmt = 1000;
	public static double LeadAmt = 500;
	public static double WoodCost = 5;
	public static double WoodRefil = 1000;
	public static double LeadCost = 7;
	public static double LeadRefil = 500;
	public static double AssemblerAmt = 0;
	public static double AssemblerCost = 5;
	public static double Trust = 0;
	public static double TrustUsed = 0;
	public static double TrustRate = 75;
	public static double TrustUp = 1000;
	public static double Processors = 1;
	public static double Memory = 1;
	public static double Operations = 0;
	public static double MaxOperations = 1000;
	public static double Creativity = 0;
	public static double OpsNeededImprovedAutoAssemblers = 750;
	public static double OpsNeededImprovedWoodCutting = 875;
	public static double OpsNeededImprovedLeadMolding = 875;
	public static double WoodNeeded = 2;
	public static double LeadNeeded = 1;
	
	//------Establishing new colours
	public static final Color TAX = new Color(158, 182, 222);
	public static final Color DARK_GREY = new Color(102, 102, 102);
	public static final Color NEWBlUE = new Color(201, 222, 242);
	public static final Color BLACK = new Color(1, 2, 2);
	public static final Color GREEN = new Color(75,181,67);
	public static final Color DARKBLUE = new Color(70, 88, 250);
	public static final Color NEWGREY = new Color(130, 122, 121);
	
	//------Decimal Format
	public static DecimalFormat money = new DecimalFormat("$###,###,##0.00");
	public static DecimalFormat number = new DecimalFormat("###,###,###");
	public static DecimalFormat seminumber = new DecimalFormat("###,###,##0.00");
	
	//------New Borders
	public static Border border1 = BorderFactory.createRaisedBevelBorder();
	public static Border border2 = BorderFactory.createLoweredBevelBorder();
	
	public enum Actions
	{//Beginning of Actions
		LOAD,
		SAVE,
		RETURN,
		QUIT,
		ACHIEVEMENTS,
		DEV,
		OPTIONS,
		GUIMODE1,
		GUIMODE2,
		GUIMODE3,
		GUIMODE4,
		GUIMODE5,
		GUIMODE6,
		GUIMODE7,
		MAKEPENCIL,
		PRICEDOWN,
		PRICEUP,
		MARKETINGUPGRADE,
		WOOD,
		LEAD,
		ASSEMBLERBUY,
		PROCESSORS,
		MEMORY,
		IMPROVEDAUTOASSEMBLERS,
		IMPROVEDWOODCUTTING,
		IMPROVEDLEADMOLDING
		
	}//End of Actions
	
	public static void Load() {
		Clicker_Game instance = new Clicker_Game();
		//image loading screen
		panel = new JPanel();
		
		bar.setValue(0);
		bar.setBounds(320,600,500,50);
		bar.setStringPainted(true);
		panel.add(bar);
		
		panel.setBackground(TAX); //Sets background
		panel.setLayout(null); //Sets panel to open in center
		
		//new frame
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setSize(1280, 800);
		frame.setLocationRelativeTo(null);
		frame.setBackground(DARK_GREY);
		frame.setResizable(false);
		
		frame.getContentPane().addComponentListener(new ComponentAdapter() {
			public void componentResized(ComponentEvent e) {
				Component c = (Component)e.getSource();
				//frame.setTitle("W: " + c.getWidth() + "H: " + c.getHeight());
				int a = c.getWidth();
				int b = c.getHeight();
				
				double WelcomeLabelWidth = a - (a * 0.6666);
				double WelcomeLabelHeight = b - (b - (b * 0.0625));
				double WelcomeLabelOver = a * 0.3437;
				double WelcomeLabelDown = b * 0.02;
				
				//double Divider1LabelWidth = a - (a * 0.6666);
				//double Divider1LabelHeight = b - (b - (b * 0.0625));
				//double Divider1LabelOver = a * 0.3437;
				//double Divider1LabelDown = b * 0.025;
				
				//double CalculateOver = a * 0.01875;
				//double CalculateDown = b * 0.75;
				//double CalculateWidth = a - (a * 0.0375);
				//double CalculateHeight = b - (b - (b * 0.0625));
				
				
				WelcomeLabel.setBounds((int) WelcomeLabelOver, (int) WelcomeLabelDown, (int) WelcomeLabelWidth, (int) WelcomeLabelHeight);
				//Divider1Label.setBounds((int) Divider1LabelOver, (int) Divider1LabelDown, (int) Divider1LabelWidth, (int) Divider1LabelHeight);
				//Calculate.setBounds((int) CalculateOver, (int) CalculateDown, (int) CalculateWidth, (int) CalculateHeight);				
			}
		});
		
		BufferedImage img1 = null;
		BufferedImage img2 = null;
		try {
			img1 = ImageIO.read(new File("Universal_Paperclips_Title_Screen.png"));
		    img2 = ImageIO.read(new File("LVL1Pencil.png"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		Image dimg = img1.getScaledInstance(600, 450, 100);
		Image eimg = img2.getScaledInstance(40, 30, 100);
		
		//Creating image icons
		ImageIcon image1 = new ImageIcon(dimg);
		ImageIcon image2 = new ImageIcon(eimg);
		
		//image loading screen
		label1 = new JLabel(image1);
		label1.setBounds(350,100,600,450);
		panel.add(label1);
		
		WelcomeLabel = new JLabel("");
		panel.add(WelcomeLabel);
		WelcomeLabel.setHorizontalAlignment(JLabel.CENTER);
		
		Divider1Label = new JSeparator();
		Divider1Label.setBounds(0, 40, 1280, 25);
		panel.add(Divider1Label);
		Divider1Label.setForeground(BLACK);

		Inspiration1Label = new JLabel("This Game was Heavily Inspired by Universal Paperclips:)");
		Inspiration1Label.setBounds(450,650,400,20);
		panel.add(Inspiration1Label);
		
		Inspiration2Label = new JLabel("https://www.decisionproblem.com/paperclips/");
		Inspiration2Label.setBounds(480,670,400,20);
		panel.add(Inspiration2Label);
		
		
		WelcomeLabel.setVisible(false);
		Divider1Label.setVisible(false);
		Inspiration1Label.setVisible(true);
		Inspiration2Label.setVisible(true);
		
		//----------Menu stuff
		Quit1 = new JButton("Quit");
		Quit1.setBounds(10, 10, 80, 25);
		Quit1.setActionCommand(Actions.QUIT.name());
		Quit1.addActionListener(instance);
		panel.add(Quit1);
		
		DeveloperMode = new JButton("Developer Mode");
		DeveloperMode.setBounds(1000, 10, 150, 25);
		DeveloperMode.setActionCommand(Actions.DEV.name());
		DeveloperMode.addActionListener(instance);
		panel.add(DeveloperMode);
		
		Achievements = new JButton("Achievements");
		Achievements.setBounds(100, 10, 150, 25);
		Achievements.setActionCommand(Actions.ACHIEVEMENTS.name());
		Achievements.addActionListener(instance);
		panel.add(Achievements);
		
		Save = new JButton("Save");
		Save.setBounds(560, 10, 80, 25);
		Save.setActionCommand(Actions.SAVE.name());
		Save.addActionListener(instance);
		panel.add(Save);
		
		Load = new JButton("Load");
		Load.setBounds(640, 10, 80, 25);
		Load.setActionCommand(Actions.LOAD.name());
		Load.addActionListener(instance);
		panel.add(Load);
		
		Options = new JButton("Options");
		Options.setBounds(1190, 10, 80, 25);
		Options.setActionCommand(Actions.OPTIONS.name());
		Options.addActionListener(instance);
		panel.add(Options);
		
		Back = new JButton("Back");
		Back.setBounds(90, 10, 80, 25);
		Back.setActionCommand(Actions.RETURN.name());
		Back.addActionListener(instance);
		panel.add(Back);
		
		Achievements.setVisible(false);
		Quit1.setVisible(false);
		DeveloperMode.setVisible(false);
		Save.setVisible(false);
		Load.setVisible(false);
		Options.setVisible(false);
		Back.setVisible(false);
		
		//-------------Game stuff
		//Column 1
		PencilLabel = new JLabel("Pencils: " + number.format(Pencils));
		PencilLabel.setBounds(40, 70, 1240, 25);
		panel.add(PencilLabel);
		PencilLabel.setFont(new Font("Serif", Font.BOLD, 24));
		
		label2 = new JLabel(image2);
		label2.setBounds(5,65,40,30);
		panel.add(label2);
		
		MakePencil = new JButton("Make Pencil");
		MakePencil.setBounds(10, 110, 120, 25);
		MakePencil.setActionCommand(Actions.MAKEPENCIL.name());
		MakePencil.addActionListener(instance);
		panel.add(MakePencil);
		
		BusinessLabel = new JLabel("Business");
		BusinessLabel.setBounds(20, 160, 100, 25);
		panel.add(BusinessLabel);
		BusinessLabel.setFont(new Font("Serif", Font.BOLD, 18));
		
		Business = new JSeparator();
		Business.setBounds(10, 180, 300, 25);
		panel.add(Business);
		Business.setForeground(BLACK);
		
		FundsLabel = new JLabel("Available Funds: " + money.format(Funds));
		FundsLabel.setBounds(20, 190, 400, 25);
		panel.add(FundsLabel);
		
		InventoryLabel = new JLabel("Unsold Inventory: " + number.format(Inventory));
		InventoryLabel.setBounds(20, 210, 400, 25);
		panel.add(InventoryLabel);
		
		PricePerPencilLabel = new JLabel("Price per Pencil: " +money.format(Price));
		PricePerPencilLabel.setBounds(80, 230, 400, 25);
		panel.add(PricePerPencilLabel);
				
	    IncreasePrice = new JButton("+");
	    IncreasePrice.setBounds(40, 230, 40, 25);
		IncreasePrice.setActionCommand(Actions.PRICEUP.name());
		IncreasePrice.addActionListener(instance);
		panel.add(IncreasePrice);
		
		DecreasePrice = new JButton("-");
		DecreasePrice.setBounds(10, 230, 40, 25);
		DecreasePrice.setActionCommand(Actions.PRICEDOWN.name());
		DecreasePrice.addActionListener(instance);
		panel.add(DecreasePrice);
		
		DemandLabel = new JLabel("Public Demand: " + number.format(DemandShow) +"%");
		DemandLabel.setBounds(20, 250, 300, 25);
		panel.add(DemandLabel);
		
		MarketingUpgrade = new JButton("Marketing");
		MarketingUpgrade.setBounds(10, 290, 100, 25);
		MarketingUpgrade.setActionCommand(Actions.MARKETINGUPGRADE.name());
		MarketingUpgrade.addActionListener(instance);
		panel.add(MarketingUpgrade);
		MarketingUpgrade.setEnabled(false);
		
		MarketingLvlLabel = new JLabel("Level: " + number.format(MarketingLvl));
		MarketingLvlLabel.setBounds(110, 290, 100, 25);
		panel.add(MarketingLvlLabel);

		MarketingUpgradeCost = new JLabel("Cost: " + UpgradeMarketingCost);
		MarketingUpgradeCost.setBounds(20, 310, 280, 25);
		panel.add(MarketingUpgradeCost);
		
		ManufacturingLabel = new JLabel("Manufacturing");
		ManufacturingLabel.setBounds(20, 350, 160, 25);
		panel.add(ManufacturingLabel);
		ManufacturingLabel.setFont(new Font("Serif", Font.BOLD, 18));
		
		ManufacturingSeperator = new JSeparator();
		ManufacturingSeperator.setBounds(10, 370, 300, 25);
		panel.add(ManufacturingSeperator);
		ManufacturingSeperator.setForeground(BLACK);
		
		PencilsPerSecond = new JLabel("Pencils per Second: " + seminumber.format(PencilsPerSecondValue));
		PencilsPerSecond.setBounds(20, 380, 300, 25);
		panel.add(PencilsPerSecond);
		
		WoodBuy = new JButton("Wood");
		WoodBuy.setBounds(10,410,80,25);
		WoodBuy.setActionCommand(Actions.WOOD.name());
		WoodBuy.addActionListener(instance);
		panel.add(WoodBuy);
		WoodBuy.setEnabled(false);
		
		WoodAmtLabel = new JLabel(number.format(WoodAmt) + " pieces");
		WoodAmtLabel.setBounds(90, 410, 300, 25);
		panel.add(WoodAmtLabel);
		
		WoodCostLabel = new JLabel("Cost: " + money.format(WoodCost));
		WoodCostLabel.setBounds(20, 430, 300, 25);
		panel.add(WoodCostLabel);
		
		LeadBuy = new JButton("Lead");
		LeadBuy.setBounds(10,470,80,25);
		LeadBuy.setActionCommand(Actions.LEAD.name());
		LeadBuy.addActionListener(instance);
		panel.add(LeadBuy);
		LeadBuy.setEnabled(false);
		
		LeadAmtLabel = new JLabel(number.format(LeadAmt) + " rods");
		LeadAmtLabel.setBounds(90, 470, 300, 25);
		panel.add(LeadAmtLabel);
		
		LeadCostLabel = new JLabel("Cost: " + money.format(LeadCost));
		LeadCostLabel.setBounds(20, 490, 300, 25);
		panel.add(LeadCostLabel);
		
		AutoAssemblerBuy = new JButton("AutoAssemblers");
		AutoAssemblerBuy.setBounds(10,530,150,25);
		AutoAssemblerBuy.setActionCommand(Actions.ASSEMBLERBUY.name());
		AutoAssemblerBuy.addActionListener(instance);
		panel.add(AutoAssemblerBuy);
		AutoAssemblerBuy.setEnabled(false);
		
		AutoAssemblerLabel = new JLabel(number.format(AssemblerAmt));
		AutoAssemblerLabel.setBounds(160, 530, 300, 25);
		panel.add(AutoAssemblerLabel);
		
		AutoAssemblerCostLabel = new JLabel("Cost: " + money.format(AssemblerCost));
		AutoAssemblerCostLabel.setBounds(20, 550, 300, 25);
		panel.add(AutoAssemblerCostLabel);
		
		PencilLabel.setVisible(false);
		label2.setVisible(false);
		MakePencil.setVisible(false);
		BusinessLabel.setVisible(false);
		Business.setVisible(false);
		FundsLabel.setVisible(false);
		InventoryLabel.setVisible(false);
		PricePerPencilLabel.setVisible(false);
		IncreasePrice.setVisible(false);
		DecreasePrice.setVisible(false);
		DemandLabel.setVisible(false);
		MarketingUpgrade.setVisible(false);
		MarketingLvlLabel.setVisible(false);
		MarketingUpgradeCost.setVisible(false);
		ManufacturingLabel.setVisible(false);
		ManufacturingSeperator.setVisible(false);
		PencilsPerSecond.setVisible(false);
		WoodBuy.setVisible(false);
		WoodAmtLabel.setVisible(false);
		WoodCostLabel.setVisible(false);
		LeadBuy.setVisible(false);
		LeadAmtLabel.setVisible(false);
		LeadCostLabel.setVisible(false);
		AutoAssemblerBuy.setVisible(false);
		AutoAssemblerLabel.setVisible(false);
		AutoAssemblerCostLabel.setVisible(false);
		
		//-----Column 2
		ComputationalResourcesLabel = new JLabel("Computational Resources");
		ComputationalResourcesLabel.setBounds(320, 110, 260, 25);
		panel.add(ComputationalResourcesLabel);
		ComputationalResourcesLabel.setFont(new Font("Serif", Font.BOLD, 18));
		
		ComputationalResourcesSeparator = new JSeparator();
		ComputationalResourcesSeparator.setBounds(320, 130, 300, 25);
		panel.add(ComputationalResourcesSeparator);
		ComputationalResourcesSeparator.setForeground(BLACK);
		
		TrustLabel = new JLabel("Trust: " + number.format(Trust));
		TrustLabel.setBounds(320, 140, 150, 25);
		panel.add(TrustLabel);
		
		Up1TrustAt = new JLabel("+1 Trust at: " + number.format(TrustUp) + " Pencils");
		Up1TrustAt.setBounds(320, 160, 290, 25);
		panel.add(Up1TrustAt);
		
		ProcessorsButton = new JButton("Processors");
		ProcessorsButton.setBounds(310, 190, 100, 25);
		ProcessorsButton.setActionCommand(Actions.PROCESSORS.name());
		ProcessorsButton.addActionListener(instance);
		panel.add(ProcessorsButton);
		
		ProcessorsLabel = new JLabel(number.format(Processors));
		ProcessorsLabel.setBounds(420, 190, 100, 25);
		panel.add(ProcessorsLabel);
		
		MemoryButton = new JButton("Memory");
		MemoryButton.setBounds(310, 220, 100 , 25);
		MemoryButton.setActionCommand(Actions.MEMORY.name());
		MemoryButton.addActionListener(instance);
		panel.add(MemoryButton);
		
		MemoryLabel = new JLabel(number.format(Memory));
		MemoryLabel.setBounds(420, 220, 100, 25);
		panel.add(MemoryLabel);
		
		OperationsLabel = new JLabel("Operations: " + number.format(Operations) + "/" + number.format(MaxOperations));
		OperationsLabel.setBounds(320, 260, 290, 25);
		panel.add(OperationsLabel);
		
		CreativityLabel = new JLabel("Creativitiy: " + number.format(Creativity));
		CreativityLabel.setBounds(320, 280, 200, 25);
		panel.add(CreativityLabel);
		
		ProjectsLabel = new JLabel("Projects");
		ProjectsLabel.setBounds(320, 320, 260, 25);
		panel.add(ProjectsLabel);
		ProjectsLabel.setFont(new Font("Serif", Font.BOLD, 18));
		
		ProjectsSeparator = new JSeparator();
		ProjectsSeparator.setBounds(320, 340, 300, 25);
		panel.add(ProjectsSeparator);
		ProjectsSeparator.setForeground(BLACK);
		
		//Projects
		ImprovedAutoAssemblerLabel1 = new JLabel("Improved AutoAssemblers (" + number.format(OpsNeededImprovedAutoAssemblers) + " ops)");
		ImprovedAutoAssemblerLabel1.setBounds(355, 345, 300, 60);
		panel.add(ImprovedAutoAssemblerLabel1);
		ImprovedAutoAssemblerLabel1.setFont(new Font("Arial", Font.BOLD, 13));
		
		ImprovedAutoAssemblerLabel2 = new JLabel("Increase AutoAssembler performance 25%");
		ImprovedAutoAssemblerLabel2.setBounds(337, 365, 300, 60);
		panel.add(ImprovedAutoAssemblerLabel2);
		
		ImprovedAutoAssemblersButton = new JButton();
		ImprovedAutoAssemblersButton.setBounds(320, 350, 300, 70);
		ImprovedAutoAssemblersButton.setActionCommand(Actions.IMPROVEDAUTOASSEMBLERS.name());
		ImprovedAutoAssemblersButton.addActionListener(instance);
		panel.add(ImprovedAutoAssemblersButton);
		
		ImprovedWoodCuttingLabel1 = new JLabel("Improved Wood Cutting (" + number.format(OpsNeededImprovedWoodCutting) + " ops)");
		ImprovedWoodCuttingLabel1.setBounds(365, 415, 300, 60);
		panel.add(ImprovedWoodCuttingLabel1);
		ImprovedWoodCuttingLabel1.setFont(new Font("Arial", Font.BOLD, 13));
		
		ImprovedWoodCuttingLabel2 = new JLabel("50% more wood supply after cutting");
		ImprovedWoodCuttingLabel2.setBounds(355, 435, 300, 60);
		panel.add(ImprovedWoodCuttingLabel2);
		
		ImprovedWoodCuttingButton = new JButton();
		ImprovedWoodCuttingButton.setBounds(320, 420, 300, 70);
		ImprovedWoodCuttingButton.setActionCommand(Actions.IMPROVEDWOODCUTTING.name());
		ImprovedWoodCuttingButton.addActionListener(instance);
		panel.add(ImprovedWoodCuttingButton);
		
		ImprovedLeadMoldingLabel1 = new JLabel("Improved Lead Molding (" + number.format(OpsNeededImprovedLeadMolding) + " ops)");
		ImprovedLeadMoldingLabel1.setBounds(365, 485, 300, 60);
		panel.add(ImprovedLeadMoldingLabel1);
		ImprovedLeadMoldingLabel1.setFont(new Font("Arial", Font.BOLD, 13));
		
		ImprovedLeadMoldingLabel2 = new JLabel("50% more lead supply after molding");
		ImprovedLeadMoldingLabel2.setBounds(355, 505, 300, 60);
		panel.add(ImprovedLeadMoldingLabel2);
		
		ImprovedLeadMoldingButton = new JButton();
		ImprovedLeadMoldingButton.setBounds(320, 490, 300, 70);
		ImprovedLeadMoldingButton.setActionCommand(Actions.IMPROVEDLEADMOLDING.name());
		ImprovedLeadMoldingButton.addActionListener(instance);
		panel.add(ImprovedLeadMoldingButton);
		
		ImprovedLeadMoldingButton.setVisible(false);
		ImprovedLeadMoldingLabel2.setVisible(false);
		ImprovedLeadMoldingLabel1.setVisible(false);
		ImprovedWoodCuttingLabel1.setVisible(false);
		ImprovedWoodCuttingLabel2.setVisible(false);
		ImprovedWoodCuttingButton.setVisible(false);
		ImprovedAutoAssemblerLabel2.setVisible(false);
		ImprovedAutoAssemblerLabel1.setVisible(false);
		ImprovedAutoAssemblersButton.setVisible(false);
		ComputationalResourcesLabel.setVisible(false);
		ComputationalResourcesSeparator.setVisible(false);
		TrustLabel.setVisible(false);
		Up1TrustAt.setVisible(false);
		ProcessorsButton.setVisible(false);
		ProcessorsLabel.setVisible(false);
		MemoryButton.setVisible(false);
		MemoryLabel.setVisible(false);
		OperationsLabel.setVisible(false);
		CreativityLabel.setVisible(false);
		ProjectsLabel.setVisible(false);
		ProjectsSeparator.setVisible(false);
		
		//--------Achievements Pane
		
		AchievementsLabel = new JLabel("Achievements");
		AchievementsLabel.setBounds(60,80,200,20);
		panel.add(AchievementsLabel);
		AchievementsLabel.setVisible(false);
		AchievementsLabel.setFont(new Font("Serif", Font.PLAIN, 24));
		
		AchievementsSeparator = new JSeparator();
		AchievementsSeparator.setBounds(40, 100, 300, 25);
		panel.add(AchievementsSeparator);
		AchievementsSeparator.setForeground(BLACK);
		
		PencilAchievements = new JLabel("Total Pencils Sold:");
		PencilAchievements.setBounds(50, 130, 200, 25);
		panel.add(PencilAchievements);
		PencilAchievements.setFont(new Font("Serif", Font.PLAIN, 18));
		
		PencilAchieve1 = new JLabel("100");
		PencilAchieve1.setBounds(50, 170, 60, 25);
		panel.add(PencilAchieve1);
		PencilAchieve1.setBorder(border1);
		PencilAchieve1.setHorizontalAlignment(JLabel.CENTER);
		
		PencilAchieve2 = new JLabel("500");
		PencilAchieve2.setBounds(120, 170, 60, 25);
		panel.add(PencilAchieve2);
		PencilAchieve2.setBorder(border1);
		PencilAchieve2.setHorizontalAlignment(JLabel.CENTER);
		
		PencilAchieve3 = new JLabel("1000");
		PencilAchieve3.setBounds(190, 170, 60, 25);
		panel.add(PencilAchieve3);
		PencilAchieve3.setBorder(border1);
		PencilAchieve3.setHorizontalAlignment(JLabel.CENTER);
		
		PencilAchieve4 = new JLabel("2500");
		PencilAchieve4.setBounds(260, 170, 60, 25);
		panel.add(PencilAchieve4);
		PencilAchieve4.setBorder(border1);
		PencilAchieve4.setHorizontalAlignment(JLabel.CENTER);
		
		PencilAchieve5 = new JLabel("5000");
		PencilAchieve5.setBounds(50, 200, 60, 25);
		panel.add(PencilAchieve5);
		PencilAchieve5.setBorder(border1);
		PencilAchieve5.setHorizontalAlignment(JLabel.CENTER);
		
		PencilAchieve6 = new JLabel("10000");
		PencilAchieve6.setBounds(120, 200, 60, 25);
		panel.add(PencilAchieve6);
		PencilAchieve6.setBorder(border1);
		PencilAchieve6.setHorizontalAlignment(JLabel.CENTER);
		
		PencilAchieve7 = new JLabel("100000");
		PencilAchieve7.setBounds(190, 200, 60, 25);
		panel.add(PencilAchieve7);
		PencilAchieve7.setBorder(border1);
		PencilAchieve7.setHorizontalAlignment(JLabel.CENTER);
		
		PencilAchieve8 = new JLabel("1000000");
		PencilAchieve8.setBounds(260, 200, 60, 25);
		panel.add(PencilAchieve8);
		PencilAchieve8.setBorder(border1);
		PencilAchieve8.setHorizontalAlignment(JLabel.CENTER);
		
		MaterialsDepletedAchievements = new JLabel("Materials Depleted:");
		MaterialsDepletedAchievements.setBounds(400, 130, 200, 25);
		panel.add(MaterialsDepletedAchievements);
		MaterialsDepletedAchievements.setFont(new Font("Serif", Font.PLAIN, 18));
		
		MaterialsDepletedAchieve1 = new JLabel("1000");
		MaterialsDepletedAchieve1.setBounds(400, 170, 60, 25);
		panel.add(MaterialsDepletedAchieve1);
		MaterialsDepletedAchieve1.setBorder(border1);
		MaterialsDepletedAchieve1.setHorizontalAlignment(JLabel.CENTER);
		
		MaterialsDepletedAchieve2 = new JLabel("2500");
		MaterialsDepletedAchieve2.setBounds(470, 170, 60, 25);
		panel.add(MaterialsDepletedAchieve2);
		MaterialsDepletedAchieve2.setBorder(border1);
		MaterialsDepletedAchieve2.setHorizontalAlignment(JLabel.CENTER);
		
		MaterialsDepletedAchieve3 = new JLabel("5000");
		MaterialsDepletedAchieve3.setBounds(540, 170, 60, 25);
		panel.add(MaterialsDepletedAchieve3);
		MaterialsDepletedAchieve3.setBorder(border1);
		MaterialsDepletedAchieve3.setHorizontalAlignment(JLabel.CENTER);
		
		MaterialsDepletedAchieve4 = new JLabel("10000");
		MaterialsDepletedAchieve4.setBounds(610, 170, 60, 25);
		panel.add(MaterialsDepletedAchieve4);
		MaterialsDepletedAchieve4.setBorder(border1);
		MaterialsDepletedAchieve4.setHorizontalAlignment(JLabel.CENTER);
		
		MaterialsDepletedAchieve5 = new JLabel("50000");
		MaterialsDepletedAchieve5.setBounds(400, 200, 60, 25);
		panel.add(MaterialsDepletedAchieve5);
		MaterialsDepletedAchieve5.setBorder(border1);
		MaterialsDepletedAchieve5.setHorizontalAlignment(JLabel.CENTER);
		
		MaterialsDepletedAchieve6 = new JLabel("100000");
		MaterialsDepletedAchieve6.setBounds(470, 200, 60, 25);
		panel.add(MaterialsDepletedAchieve6);
		MaterialsDepletedAchieve6.setBorder(border1);
		MaterialsDepletedAchieve6.setHorizontalAlignment(JLabel.CENTER);
		
		MaterialsDepletedAchieve7 = new JLabel("500000");
		MaterialsDepletedAchieve7.setBounds(540, 200, 60, 25);
		panel.add(MaterialsDepletedAchieve7);
		MaterialsDepletedAchieve7.setBorder(border1);
		MaterialsDepletedAchieve7.setHorizontalAlignment(JLabel.CENTER);
		
		MaterialsDepletedAchieve8 = new JLabel("1000000");
		MaterialsDepletedAchieve8.setBounds(610, 200, 60, 25);
		panel.add(MaterialsDepletedAchieve8);
		MaterialsDepletedAchieve8.setBorder(border1);
		MaterialsDepletedAchieve8.setHorizontalAlignment(JLabel.CENTER);
		
		MaterialsDepletedAchieve1.setVisible(false);
		MaterialsDepletedAchieve2.setVisible(false);
		MaterialsDepletedAchieve3.setVisible(false);
		MaterialsDepletedAchieve4.setVisible(false);
		MaterialsDepletedAchieve5.setVisible(false);
		MaterialsDepletedAchieve6.setVisible(false);
		MaterialsDepletedAchieve7.setVisible(false);
		MaterialsDepletedAchieve8.setVisible(false);
		MaterialsDepletedAchievements.setVisible(false);
		PencilAchieve1.setVisible(false);
		PencilAchieve2.setVisible(false);
		PencilAchieve3.setVisible(false);
		PencilAchieve4.setVisible(false);
		PencilAchieve5.setVisible(false);
		PencilAchieve6.setVisible(false);
		PencilAchieve7.setVisible(false);
		PencilAchieve8.setVisible(false);
		PencilAchievements.setVisible(false);
		AchievementsSeparator.setVisible(false);
		AchievementsLabel.setVisible(false);
		
		//-------Options Pane
		GUImodeLabel = new JLabel("Window Size: ");
		GUImodeLabel.setBounds(30,100,200,20);
		panel.add(GUImodeLabel);
		GUImodeLabel.setVisible(false);
		GUImodeLabel.setFont(new Font("Serif", Font.PLAIN, 24));
		
		GUImode1Label = new JButton("Default");
		GUImode1Label.setBounds(30,280,200,40);
		GUImode1Label.setActionCommand(Actions.GUIMODE1.name());
		GUImode1Label.addActionListener(instance);
		panel.add(GUImode1Label);
		GUImode1Label.setVisible(false);
		GUImode1Label.setFont(new Font("Serif", Font.PLAIN, 24));
		
		GUImode2Label = new JButton("2048 x 1280");
		GUImode2Label.setBounds(30,130,200,40);
		GUImode2Label.setActionCommand(Actions.GUIMODE2.name());
		GUImode2Label.addActionListener(instance);
		panel.add(GUImode2Label);
		GUImode2Label.setVisible(false);
		GUImode2Label.setFont(new Font("Serif", Font.PLAIN, 24));
		
		GUImode3Label = new JButton("1650 x 1050");
		GUImode3Label.setBounds(30,180,200,40);
		GUImode3Label.setActionCommand(Actions.GUIMODE3.name());
		GUImode3Label.addActionListener(instance);
		panel.add(GUImode3Label);
		GUImode3Label.setVisible(false);
		GUImode3Label.setFont(new Font("Serif", Font.PLAIN, 24));
		
		GUImode4Label = new JButton("1440 x 900");
		GUImode4Label.setBounds(30,230,200,40);
		GUImode4Label.setActionCommand(Actions.GUIMODE4.name());
		GUImode4Label.addActionListener(instance);
		panel.add(GUImode4Label);
		GUImode4Label.setVisible(false);
		GUImode4Label.setFont(new Font("Serif", Font.PLAIN, 24));

		GUImode5Label = new JButton("1152 x 720");
		GUImode5Label.setBounds(30,330,200,40);
		GUImode5Label.setActionCommand(Actions.GUIMODE5.name());
		GUImode5Label.addActionListener(instance);
		panel.add(GUImode5Label);
		GUImode5Label.setVisible(false);
		GUImode5Label.setFont(new Font("Serif", Font.PLAIN, 24));
		
		GUImode6Label = new JButton("1024 x 768");
		GUImode6Label.setBounds(30, 380,200,40);
		GUImode6Label.setActionCommand(Actions.GUIMODE6.name());
		GUImode6Label.addActionListener(instance);
		panel.add(GUImode6Label);
		GUImode6Label.setVisible(false);
		GUImode6Label.setFont(new Font("Serif", Font.PLAIN, 24));
		
		GUImode7Label = new JButton("800 x 600");
		GUImode7Label.setBounds(30,430,200,40);
		GUImode7Label.setActionCommand(Actions.GUIMODE7.name());
		GUImode7Label.addActionListener(instance);
		panel.add(GUImode7Label);
		GUImode7Label.setVisible(false);
		GUImode7Label.setFont(new Font("Serif", Font.PLAIN, 24));
		
		frame.setVisible(true);
		frame.setTitle("Transcendental Pencils");
		
		if (panel.isVisible()) 
		{//Beginning of if
			fill();
		}//End of if
		Modes();
	}
	public static void Modes() {
		Timer timer = new Timer();
		timer.schedule(new Timer_Sell(), 0, 1000);
	}
	public static void Game() {
		//Hides Load - Specific Elements
		label1.setVisible(false);
		bar.setVisible(false);
		Inspiration1Label.setVisible(false);
		Inspiration2Label.setVisible(false);
		//Shows Game - Specific Elements
		label2.setVisible(true);
		WelcomeLabel.setVisible(true);
		Divider1Label.setVisible(true);
		Save.setVisible(true);
		Load.setVisible(true);
		Options.setVisible(true);
		Quit1.setVisible(true);
		DeveloperMode.setVisible(true);
		Achievements.setVisible(true);
		PencilLabel.setVisible(true);
		MakePencil.setVisible(true);
		BusinessLabel.setVisible(true);
		Business.setVisible(true);
		FundsLabel.setVisible(true);
		InventoryLabel.setVisible(true);
		PricePerPencilLabel.setVisible(true);
		IncreasePrice.setVisible(true);
		DecreasePrice.setVisible(true);
		DemandLabel.setVisible(true);
		MarketingUpgrade.setVisible(true);
		MarketingLvlLabel.setVisible(true);
		MarketingUpgradeCost.setVisible(true);
		ManufacturingLabel.setVisible(true);
		ManufacturingSeperator.setVisible(true);
		PencilsPerSecond.setVisible(true);
		WoodBuy.setVisible(true);
		WoodAmtLabel.setVisible(true);
		WoodCostLabel.setVisible(true);
		LeadBuy.setVisible(true);
		LeadAmtLabel.setVisible(true);
		LeadCostLabel.setVisible(true);
		
		//Hides Achievements
		PencilAchievements.setVisible(false);
		PencilAchieve1.setVisible(false);
		PencilAchieve2.setVisible(false);
		PencilAchieve3.setVisible(false);
		PencilAchieve4.setVisible(false);
		PencilAchieve5.setVisible(false);
		PencilAchieve6.setVisible(false);
		PencilAchieve7.setVisible(false);
		PencilAchieve8.setVisible(false);
		AchievementsSeparator.setVisible(false);
		AchievementsLabel.setVisible(false);
		MaterialsDepletedAchieve1.setVisible(false);
		MaterialsDepletedAchieve2.setVisible(false);
		MaterialsDepletedAchieve3.setVisible(false);
		MaterialsDepletedAchieve4.setVisible(false);
		MaterialsDepletedAchieve5.setVisible(false);
		MaterialsDepletedAchieve6.setVisible(false);
		MaterialsDepletedAchieve7.setVisible(false);
		MaterialsDepletedAchieve8.setVisible(false);
		MaterialsDepletedAchievements.setVisible(false);
	}
	//--------------Achievements Pane
	public static void achievements() {
		//Menu Bar
		Save.setVisible(false);
		Load.setVisible(false);
		Options.setVisible(true);
		Back.setVisible(true);
		Achievements.setVisible(false);
		
		//Column 1
		DeveloperMode.setVisible(false);
		PencilLabel.setVisible(false);
		MakePencil.setVisible(false);
		BusinessLabel.setVisible(false);
		Business.setVisible(false);
		FundsLabel.setVisible(false);
		InventoryLabel.setVisible(false);
		PricePerPencilLabel.setVisible(false);
		IncreasePrice.setVisible(false);
		DecreasePrice.setVisible(false);
		DemandLabel.setVisible(false);
		MarketingUpgrade.setVisible(false);
		MarketingLvlLabel.setVisible(false);
		MarketingUpgradeCost.setVisible(false);
		label2.setVisible(false);
		ManufacturingLabel.setVisible(false);
		ManufacturingSeperator.setVisible(false);
		PencilsPerSecond.setVisible(false);
		WoodBuy.setVisible(false);
		WoodAmtLabel.setVisible(false);
		WoodCostLabel.setVisible(false);
		LeadBuy.setVisible(false);
		LeadAmtLabel.setVisible(false);
		LeadCostLabel.setVisible(false);
		AutoAssemblerBuy.setVisible(false);
		AutoAssemblerLabel.setVisible(false);
		AutoAssemblerCostLabel.setVisible(false);

		//Column 2
		ComputationalResourcesLabel.setVisible(false);
		ComputationalResourcesSeparator.setVisible(false);
		TrustLabel.setVisible(false);
		Up1TrustAt.setVisible(false);
		ProcessorsButton.setVisible(false);
		ProcessorsLabel.setVisible(false);
		MemoryButton.setVisible(false);
		MemoryLabel.setVisible(false);
		OperationsLabel.setVisible(false);
		CreativityLabel.setVisible(false);
		ProjectsLabel.setVisible(false);
		ProjectsSeparator.setVisible(false);
		ImprovedAutoAssemblerLabel1.setVisible(false);
		ImprovedAutoAssemblerLabel2.setVisible(false);
		ImprovedAutoAssemblersButton.setVisible(false);
		ImprovedWoodCuttingLabel1.setVisible(false);
		ImprovedWoodCuttingLabel2.setVisible(false);
		ImprovedWoodCuttingButton.setVisible(false);
		ImprovedLeadMoldingButton.setVisible(false);
		ImprovedLeadMoldingLabel2.setVisible(false);
		ImprovedLeadMoldingLabel1.setVisible(false);
		
		//Achievements Pane
		PencilAchievements.setVisible(true);
		PencilAchieve1.setVisible(true);
		PencilAchieve2.setVisible(true);
		PencilAchieve3.setVisible(true);
		PencilAchieve4.setVisible(true);
		PencilAchieve5.setVisible(true);
		PencilAchieve6.setVisible(true);
		PencilAchieve7.setVisible(true);
		PencilAchieve8.setVisible(true);
		AchievementsSeparator.setVisible(true);
		AchievementsLabel.setVisible(true);
		MaterialsDepletedAchieve1.setVisible(true);
		MaterialsDepletedAchieve2.setVisible(true);
		MaterialsDepletedAchieve3.setVisible(true);
		MaterialsDepletedAchieve4.setVisible(true);
		MaterialsDepletedAchieve5.setVisible(true);
		MaterialsDepletedAchieve6.setVisible(true);
		MaterialsDepletedAchieve7.setVisible(true);
		MaterialsDepletedAchieve8.setVisible(true);
		MaterialsDepletedAchievements.setVisible(true);
		
		//Options Pane
		GUImodeLabel.setVisible(false);
		GUImode1Label.setVisible(false);
		GUImode2Label.setVisible(false);
		GUImode3Label.setVisible(false);
		GUImode4Label.setVisible(false);
		GUImode5Label.setVisible(false);
		GUImode6Label.setVisible(false);
		GUImode7Label.setVisible(false);

	}
	
	
	
	//--------------Options Pane
	public static void options() {
		//Menu Bar
		Save.setVisible(false);
		Load.setVisible(false);
		Options.setVisible(false);
		Back.setVisible(true);
		Achievements.setVisible(false);
		
		//Column 1
		DeveloperMode.setVisible(false);
		PencilLabel.setVisible(false);
		MakePencil.setVisible(false);
		BusinessLabel.setVisible(false);
		Business.setVisible(false);
		FundsLabel.setVisible(false);
		InventoryLabel.setVisible(false);
		PricePerPencilLabel.setVisible(false);
		IncreasePrice.setVisible(false);
		DecreasePrice.setVisible(false);
		DemandLabel.setVisible(false);
		MarketingUpgrade.setVisible(false);
		MarketingLvlLabel.setVisible(false);
		MarketingUpgradeCost.setVisible(false);
		label2.setVisible(false);
		ManufacturingLabel.setVisible(false);
		ManufacturingSeperator.setVisible(false);
		PencilsPerSecond.setVisible(false);
		WoodBuy.setVisible(false);
		WoodAmtLabel.setVisible(false);
		WoodCostLabel.setVisible(false);
		LeadBuy.setVisible(false);
		LeadAmtLabel.setVisible(false);
		LeadCostLabel.setVisible(false);
		AutoAssemblerBuy.setVisible(false);
		AutoAssemblerLabel.setVisible(false);
		AutoAssemblerCostLabel.setVisible(false);
		
		//Column 2
		ComputationalResourcesLabel.setVisible(false);
		ComputationalResourcesSeparator.setVisible(false);
		TrustLabel.setVisible(false);
		Up1TrustAt.setVisible(false);
		ProcessorsButton.setVisible(false);
		ProcessorsLabel.setVisible(false);
		MemoryButton.setVisible(false);
		MemoryLabel.setVisible(false);
		OperationsLabel.setVisible(false);
		CreativityLabel.setVisible(false);
		ProjectsLabel.setVisible(false);
		ProjectsSeparator.setVisible(false);
		ImprovedAutoAssemblerLabel1.setVisible(false);
		ImprovedAutoAssemblerLabel2.setVisible(false);
		ImprovedAutoAssemblersButton.setVisible(false);
		ImprovedWoodCuttingLabel1.setVisible(false);
		ImprovedWoodCuttingLabel2.setVisible(false);
		ImprovedWoodCuttingButton.setVisible(false);
		ImprovedLeadMoldingButton.setVisible(false);
		ImprovedLeadMoldingLabel2.setVisible(false);
		ImprovedLeadMoldingLabel1.setVisible(false);
		
		//Achievements Pane
		PencilAchievements.setVisible(false);
		PencilAchieve1.setVisible(false);
		PencilAchieve2.setVisible(false);
		PencilAchieve3.setVisible(false);
		PencilAchieve4.setVisible(false);
		PencilAchieve5.setVisible(false);
		PencilAchieve6.setVisible(false);
		PencilAchieve7.setVisible(false);
		PencilAchieve8.setVisible(false);
		AchievementsSeparator.setVisible(false);
		AchievementsLabel.setVisible(false);
		MaterialsDepletedAchieve1.setVisible(false);
		MaterialsDepletedAchieve2.setVisible(false);
		MaterialsDepletedAchieve3.setVisible(false);
		MaterialsDepletedAchieve4.setVisible(false);
		MaterialsDepletedAchieve5.setVisible(false);
		MaterialsDepletedAchieve6.setVisible(false);
		MaterialsDepletedAchieve7.setVisible(false);
		MaterialsDepletedAchieve8.setVisible(false);
		MaterialsDepletedAchievements.setVisible(false);
		
		//Options Pane
		GUImodeLabel.setVisible(true);
		GUImode1Label.setVisible(true);
		GUImode2Label.setVisible(true);
		GUImode3Label.setVisible(true);
		GUImode4Label.setVisible(true);
		GUImode5Label.setVisible(true);
		GUImode6Label.setVisible(true);
		GUImode7Label.setVisible(true);
	}
	public static void main(String[] args) 
	{//Beginning of main
		Load();
		Continue();
		Game();
	}//End of main

	public static void Continue() {
	
		while(load !=true) 
		{//Beginning of while
			try {//Beginning of try
				//Make invisble while loading
				Thread.sleep(25);
			}

			catch (InterruptedException e) 
			{//Beginning of catch
				e.printStackTrace();
			}//End of catch
			DemandShow = Demand/100;
			if(Operations >= OpsNeededImprovedAutoAssemblers) {
				ImprovedAutoAssemblersButton.setEnabled(true);
				ImprovedAutoAssemblerLabel1.setForeground(BLACK);
				ImprovedAutoAssemblerLabel2.setForeground(BLACK);
			}
			else if(Operations < OpsNeededImprovedAutoAssemblers) {
				ImprovedAutoAssemblersButton.setEnabled(false);
				ImprovedAutoAssemblerLabel1.setForeground(NEWGREY);
				ImprovedAutoAssemblerLabel2.setForeground(NEWGREY);
			}
			if(Operations >= OpsNeededImprovedWoodCutting) {
				ImprovedWoodCuttingButton.setEnabled(true);
				ImprovedWoodCuttingLabel1.setForeground(BLACK);
				ImprovedWoodCuttingLabel2.setForeground(BLACK);
			}
			else if(Operations < OpsNeededImprovedWoodCutting) {
				ImprovedWoodCuttingButton.setEnabled(false);
				ImprovedWoodCuttingLabel1.setForeground(NEWGREY);
				ImprovedWoodCuttingLabel2.setForeground(NEWGREY);
			}
			if(Operations >= OpsNeededImprovedLeadMolding) {
				ImprovedLeadMoldingButton.setEnabled(true);
				ImprovedLeadMoldingLabel2.setForeground(BLACK);
				ImprovedLeadMoldingLabel1.setForeground(BLACK);
			}
			else if(Operations < OpsNeededImprovedLeadMolding) {
				ImprovedLeadMoldingButton.setEnabled(false);
				ImprovedLeadMoldingLabel2.setForeground(NEWGREY);
				ImprovedLeadMoldingLabel1.setForeground(NEWGREY);
				
			}
			
			if(Slot2 > 1) {
				Slot2Obj1.setBounds(355, 345, 300, 60);
				Slot2Obj2.setBounds(337, 365, 300, 60);
				Slot2Obj3.setBounds(320, 350, 300, 70);
			}
			if(Slot3 > 1) {
				Slot3Obj1.setBounds(365, 415, 300, 60);
				Slot3Obj2.setBounds(355, 435, 300, 60);
				Slot3Obj3.setBounds(320, 420, 300, 70);
			}
			if(Slot4 > 1) {
				Slot2Obj1.setBounds(1,1,1,1);
				Slot2Obj2.setBounds(1,1,1,1);
				Slot2Obj3.setBounds(1,1,1,1);
				Slot4 -=1;
			}
			if(Slot5 > 1) {
				Slot2Obj1.setBounds(1,1,1,1);
				Slot2Obj2.setBounds(1,1,1,1);
				Slot2Obj3.setBounds(1,1,1,1);
				Slot5 -=1;
			}
			if(Slot6 > 1) {
				Slot2Obj1.setBounds(1,1,1,1);
				Slot2Obj2.setBounds(1,1,1,1);
				Slot2Obj3.setBounds(1,1,1,1);
				Slot6 -=1;
			}
			
			if(Pencils >= 50) {
				if(PencilLabel.isVisible()) {
				AutoAssemblerBuy.setVisible(true);
				AutoAssemblerLabel.setVisible(true);
				AutoAssemblerCostLabel.setVisible(true);
				}
			}
			if(Pencils >= TrustUp) {
				Trust+=1;
				if(Trust < 5) {
				TrustUp+= 1000;
				}
				else if(Trust >=5) {
					TrustUp += 3000;
				}
				TrustLabel.setText("Trust: " + number.format(Trust));
				Up1TrustAt.setText("+1 Trust at: " + number.format(TrustUp) + " clips");
			}
			
			if(Pencils >= 100) {
				if(AchievementsLabel.isVisible()) {
					PencilAchieve1.setBorder(border2);
					PencilAchieve1.setForeground(BLACK);
					PencilAchieve1.setBackground(GREEN);
				}
			}
			if(Pencils >= 500) {
				if(AchievementsLabel.isVisible()) {
					PencilAchieve2.setBorder(border2);
					PencilAchieve2.setForeground(BLACK);
					PencilAchieve2.setBackground(GREEN);
				}
			}
			if(Pencils >= 1000) {
				if(AchievementsLabel.isVisible()) {
					PencilAchieve3.setBorder(border2);
					PencilAchieve3.setForeground(BLACK);
					PencilAchieve3.setBackground(GREEN);
				}
			}
			if(Pencils >= 2500) {
				if(AchievementsLabel.isVisible()) {
					PencilAchieve4.setBorder(border2);
					PencilAchieve4.setForeground(BLACK);
					PencilAchieve4.setBackground(GREEN);
				}
			}
			if(Pencils >= 5000) {
				if(AchievementsLabel.isVisible()) {
					PencilAchieve5.setBorder(border2);
					PencilAchieve5.setForeground(BLACK);
					PencilAchieve5.setBackground(GREEN);
				}
			}
			if(Pencils >= 10000) {
				if(AchievementsLabel.isVisible()) {
					PencilAchieve6.setBorder(border2);
					PencilAchieve6.setForeground(BLACK);
					PencilAchieve6.setBackground(GREEN);
				}
			}
			if(Pencils >= 100000) {
				if(AchievementsLabel.isVisible()) {
					PencilAchieve7.setBorder(border2);
					PencilAchieve7.setForeground(BLACK);
					PencilAchieve7.setBackground(GREEN);
				}
			}
			
			if(Pencils >= 1000000) {
				if(AchievementsLabel.isVisible()) {
					PencilAchieve8.setBorder(border2);
					PencilAchieve8.setForeground(BLACK);
					PencilAchieve8.setBackground(GREEN);
				}
			}
			if(MaterialsDepleted >= 1000) {
				if(AchievementsLabel.isVisible()) {
					MaterialsDepletedAchieve1.setBorder(border2);
					MaterialsDepletedAchieve1.setForeground(BLACK);
					MaterialsDepletedAchieve1.setBackground(DARKBLUE);
				}
			}
			if(MaterialsDepleted >= 2500) {
				if(AchievementsLabel.isVisible()) {
					MaterialsDepletedAchieve2.setBorder(border2);
					MaterialsDepletedAchieve2.setForeground(BLACK);
					MaterialsDepletedAchieve2.setBackground(DARKBLUE);
				}
			}
			if(MaterialsDepleted >= 5000) {
				if(AchievementsLabel.isVisible()) {
					MaterialsDepletedAchieve3.setBorder(border2);
					MaterialsDepletedAchieve3.setForeground(BLACK);
					MaterialsDepletedAchieve3.setBackground(DARKBLUE);
				}
			}
			if(MaterialsDepleted >= 10000) {
				if(AchievementsLabel.isVisible()) {
					MaterialsDepletedAchieve4.setBorder(border2);
					MaterialsDepletedAchieve4.setForeground(BLACK);
					MaterialsDepletedAchieve4.setBackground(DARKBLUE);
				}
			}
			if(MaterialsDepleted >= 50000) {
				if(AchievementsLabel.isVisible()) {
					MaterialsDepletedAchieve5.setBorder(border2);
					MaterialsDepletedAchieve5.setForeground(BLACK);
					MaterialsDepletedAchieve5.setBackground(DARKBLUE);
				}
			}
			if(MaterialsDepleted >= 100000) {
				if(AchievementsLabel.isVisible()) {
					MaterialsDepletedAchieve6.setBorder(border2);
					MaterialsDepletedAchieve6.setForeground(BLACK);
					MaterialsDepletedAchieve6.setBackground(DARKBLUE);
				}
			}
			if(MaterialsDepleted >= 500000) {
				if(AchievementsLabel.isVisible()) {
					MaterialsDepletedAchieve7.setBorder(border2);
					MaterialsDepletedAchieve7.setForeground(BLACK);
					MaterialsDepletedAchieve7.setBackground(DARKBLUE);
				}
			}
			
			if(MaterialsDepleted >= 1000000) {
				if(AchievementsLabel.isVisible()) {
					MaterialsDepletedAchieve8.setBorder(border2);
					MaterialsDepletedAchieve8.setForeground(BLACK);
					MaterialsDepletedAchieve8.setBackground(DARKBLUE);
				}
			}
			
			if(Pencils >= 2000) {
				if(PencilLabel.isVisible()) {
				ComputationalResourcesLabel.setVisible(true);
				ComputationalResourcesSeparator.setVisible(true);
				TrustLabel.setVisible(true);
				Up1TrustAt.setVisible(true);
				ProcessorsButton.setVisible(true);
				ProcessorsLabel.setVisible(true);
				MemoryButton.setVisible(true);
				MemoryLabel.setVisible(true);
				OperationsLabel.setVisible(true);
				CreativityLabel.setVisible(true);
				ProjectsLabel.setVisible(true);
				ProjectsSeparator.setVisible(true);
				if(UpgradeA == true) {
					ImprovedAutoAssemblerLabel1.setVisible(true);
					ImprovedAutoAssemblerLabel2.setVisible(true);
					ImprovedAutoAssemblersButton.setVisible(true);
					Slot1Obj1 = ImprovedAutoAssemblerLabel1;
					Slot1Obj2 = ImprovedAutoAssemblerLabel2;
					Slot1Obj3 = ImprovedAutoAssemblersButton;
					
				}
				if (UpgradeB == true) {
					ImprovedWoodCuttingLabel1.setVisible(true);
					ImprovedWoodCuttingLabel2.setVisible(true);
					ImprovedWoodCuttingButton.setVisible(true);
					Slot2Obj1 = ImprovedWoodCuttingLabel1;
					Slot2Obj2 = ImprovedWoodCuttingLabel2;
					Slot2Obj3 = ImprovedWoodCuttingButton;
				}
				if (UpgradeC == true) {
					ImprovedLeadMoldingButton.setVisible(true);
					ImprovedLeadMoldingLabel2.setVisible(true);
					ImprovedLeadMoldingLabel1.setVisible(true);
					Slot3Obj1 = ImprovedLeadMoldingLabel1;
					Slot3Obj2 = ImprovedLeadMoldingLabel2;
					Slot3Obj3 = ImprovedLeadMoldingButton;
				}
				}
			}
			if(TrustUsed < Trust) {
				ProcessorsButton.setEnabled(true);
			}
			else if(TrustUsed >= Trust) {
				ProcessorsButton.setEnabled(false);
			}
			if(TrustUsed < Trust) {
				MemoryButton.setEnabled(true);
			}
			else if(TrustUsed >= Trust) {
				MemoryButton.setEnabled(false);
			}
			if(WoodAmt >= 2 && LeadAmt >= 1) {
				MakePencil.setEnabled(true);
			}
			else if (WoodAmt <= 2 || LeadAmt <= 1) {
				MakePencil.setEnabled(false);
			}
			if(Funds >= UpgradeMarketingCost) {
				MarketingUpgrade.setEnabled(true);
			}
			else if (Funds <= UpgradeMarketingCost) {
				MarketingUpgrade.setEnabled(false);
			}
			if(Funds >= WoodCost) {
				WoodBuy.setEnabled(true);
			}
			else if (Funds <= WoodCost) {
				WoodBuy.setEnabled(false);
			}
			if(Funds >= LeadCost) {
				LeadBuy.setEnabled(true);
			}
			else if (Funds <= LeadCost) {
				LeadBuy.setEnabled(false);
			}
			if(Funds >= AssemblerCost) {
				AutoAssemblerBuy.setEnabled(true);
			}
			else if (Funds <= AssemblerCost) {
				AutoAssemblerBuy.setEnabled(false);
			}
		}
		
	}
	
	public static void fill()
	{//Beginning of fill
		int counter = 0;
		
		while(counter<=100) 
		{//Beginning of while
			bar.setValue(counter);
			try {//Beginning of try
				//Make invisble while loading
				Thread.sleep(10);
				Load.setBounds(850, 610, 80, 25);
				}//End of try
			
			catch (InterruptedException e) 
			{//Beginning of catch
				e.printStackTrace();
			}//End of catch
			
			counter +=1;
		}//End of while
		Load.setVisible(true);
	}//End of fill
	
	public static void SellCalcs() {
		//Sells every segment of time and  keeps from going negative
		if(Pencils >= 2000) {
			while(Operations < MaxOperations) 
			{//Beginning of while
				try {
					Thread.sleep((long) TrustRate);
					Operations +=1;
				}
				
				catch (InterruptedException e) 
				{//Beginning of catch
					e.printStackTrace();
				}//End of catch
				OperationsLabel.setText("Operations: " + number.format(Operations) + "/" + number.format(MaxOperations));
			}//End of while
		}
		if (WoodAmt >= AssemblerAmt && LeadAmt >= AssemblerAmt) {
			if (AssemblerAmt >= 1) {
			Pencils += -1*(AssemblerAmt-(SellDemand+AssemblerAmt));
			Inventory += AssemblerAmt;
			WoodAmt -= AssemblerAmt*2;
			LeadAmt -= AssemblerAmt;
			MaterialsDepleted += AssemblerAmt*3;
			d = true;
			}
		}
		//Sells remaining few 
		else if(WoodAmt < AssemblerAmt || LeadAmt < AssemblerAmt) {
			if (AssemblerAmt >= 1 && d == true) {	
			Pencils += (AssemblerAmt - SellDemand);
			Inventory += WoodAmt/2;
			WoodAmt -= WoodAmt;
			LeadAmt -= LeadAmt;
			PencilsPerSecondValue = AssemblerAmt/5;
			d = false;
			}
		}
		if(Inventory ==  0) {
		}
		else if(Inventory > 0) {
			if(Inventory == 1)
			{
				if (Demand > 0 && Demand <= 1000) {
					SellDemand =1;
				}
				if (Demand > 1000 && Demand <= 2000) {
					SellDemand =1;
				}
				if (Demand > 2000 && Demand <= 3000) {
					SellDemand =1;
				}
				if (Demand > 3000 && Demand <= 4000) {
					SellDemand =1;
				}
				if (Demand > 4000 && Demand <= 5000) {
					SellDemand =1;
				}
				if (Demand > 5000) {
					SellDemand =1;
				}
			}
			else if (Inventory == 2) {
				if (Demand > 0 && Demand <= 1000) {
					SellDemand =1;
				}
				if (Demand > 1000 && Demand <= 2000) {
					SellDemand =2;
				}
				if (Demand > 2000 && Demand <= 3000) {
					SellDemand =2;
				}
				if (Demand > 3000 && Demand <= 4000) {
					SellDemand =2;
				}
				if (Demand > 4000 && Demand <= 5000) {
					SellDemand =2;
				}
				if (Demand > 5000) {
					SellDemand =2;
				}
			}
			else if (Inventory == 3) {
				if (Demand > 0 && Demand <= 1000) {
					SellDemand =1;
				}
				if (Demand > 1000 && Demand <= 2000) {
					SellDemand =2;
				}
				if (Demand > 2000 && Demand <= 3000) {
					SellDemand =3;
				}
				if (Demand > 3000 && Demand <= 4000) {
					SellDemand =3;
				}
				if (Demand > 4000 && Demand <= 5000) {
					SellDemand =3;
				}
				if (Demand > 5000) {
					SellDemand =3;
				}
			}
			else if (Inventory == 4) {
				if (Demand > 0 && Demand <= 1000) {
					SellDemand =1;
				}
				if (Demand > 1000 && Demand <= 2000) {
					SellDemand =2;
				}
				if (Demand > 2000 && Demand <= 3000) {
					SellDemand =3;
				}
				if (Demand > 3000 && Demand <= 4000) {
					SellDemand =4;
				}
				if (Demand > 4000 && Demand <= 5000) {
					SellDemand =4;
				}
				if (Demand > 5000) {
					SellDemand =4;
				}
			}
			else if (Inventory >= 5 && Inventory <= 9) {
				if (Demand > 0 && Demand <= 1000) {
					SellDemand =1;
				}
				if (Demand > 1000 && Demand <= 2000) {
					SellDemand =2;
				}
				if (Demand > 2000 && Demand <= 3000) {
					SellDemand =3;
				}
				if (Demand > 3000 && Demand <= 4000) {
					SellDemand =4;
				}
				if (Demand > 4000 && Demand <= 5000) {
					SellDemand =5;
				}
				if (Demand > 5000) {
					SellDemand =5;
				}
			}
			else if (Inventory >= 10) {
				if (Demand > 0 && Demand <= 1000) {
					SellDemand =1;
				}
				if (Demand > 1000 && Demand <= 2000) {
					SellDemand =2;
				}
				if (Demand > 2000 && Demand <= 3000) {
					SellDemand =3;
				}
				if (Demand > 3000 && Demand <= 4000) {
					SellDemand =4;
				}
				if (Demand > 4000 && Demand <= 5000) {
					SellDemand =5;
				}
				if (Demand > 5000) {
					SellDemand =10;
				}
			}
			Inventory -= SellDemand;
			InventorySubbed = SellDemand;
			Funds += InventorySubbed*Price;
			InventoryLabel.setText("Unsold Inventory: " + number.format(Inventory));
			FundsLabel.setText("Available Funds: " + money.format(Funds));
			PencilLabel.setText("Pencils: " + number.format(Pencils));
			WoodAmtLabel.setText(number.format(WoodAmt) + " pieces");
			LeadAmtLabel.setText(number.format(LeadAmt) + " rods");
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{//Beginning of actionPerformed
		
		//Button Calculate
		if (e.getActionCommand() == Actions.LOAD.name())
		{//Beginning of if
			Game();
			Load.setBounds(640, 10, 80, 25);
		}//End of if
		
		//Button Tax Brackets
		else if (e.getActionCommand() == Actions.SAVE.name())
		{//Beginning of else if
			
		}//End of else if
		
		//Return
		else if (e.getActionCommand() == Actions.RETURN.name())
		{//Beginning of else if
			Game();
			Save.setVisible(true);
			Load.setVisible(true);
			Options.setVisible(true);
			Back.setVisible(false);
			
			PencilLabel.setVisible(true);
			GUImodeLabel.setVisible(false);
			GUImode1Label.setVisible(false);
			GUImode2Label.setVisible(false);
			GUImode3Label.setVisible(false);
			GUImode4Label.setVisible(false);
			GUImode5Label.setVisible(false);
			GUImode6Label.setVisible(false);
			GUImode7Label.setVisible(false);
		}//End of else if
		
		//Quit GUI + End code
		else if (e.getActionCommand() == Actions.QUIT.name())
		{//Beginning of else if
			frame.dispose();
		}//End of else if
		else if (e.getActionCommand() == Actions.DEV.name())
		{//Beginning of else if
			Funds = 100000;
			Pencils = 2000;
			PencilLabel.setText("Pencils: " + number.format(Pencils));
			FundsLabel.setText("Available Funds: " + money.format(Funds));
		}//End of else if
		else if (e.getActionCommand() == Actions.ACHIEVEMENTS.name())
		{
			achievements();
		}
		//Go back to top
		else if (e.getActionCommand() == Actions.OPTIONS.name())
		{//Beginning of else if
			options();
		}//End of else if
		else if (e.getActionCommand() == Actions.GUIMODE1.name())
		{//Beginning of else if
			frame.setSize(1280, 800);
		}//End of else if
		else if (e.getActionCommand() == Actions.GUIMODE2.name())
		{//Beginning of else if
			frame.setSize(2048,1280);
		}//End of else if
		else if (e.getActionCommand() == Actions.GUIMODE3.name())
		{//Beginning of else if
			frame.setSize(1650,1050);
		}//End of else if
		else if (e.getActionCommand() == Actions.GUIMODE4.name())
		{//Beginning of else if
			frame.setSize(1440,900);
		}//End of else if
		else if (e.getActionCommand() == Actions.GUIMODE5.name())
		{//Beginning of else if
			frame.setSize(1152,720);
		}//End of else if
		else if (e.getActionCommand() == Actions.GUIMODE6.name())
		{//Beginning of else if
			frame.setSize(1024,768);
		}//End of else if
		else if (e.getActionCommand() == Actions.GUIMODE7.name())
		{//Beginning of else if
			frame.setSize(800,600);
		}//End of else if
		else if (e.getActionCommand() == Actions.MAKEPENCIL.name())
		{//Beginning of else if
			if (WoodAmt >= 2 && LeadAmt >= 1) {
			Pencils +=1;
			Inventory += 1;
			WoodAmt -= 2;
			LeadAmt -= 1;
			MaterialsDepleted += 3;
			PencilLabel.setText("Pencils: " + number.format(Pencils));
			InventoryLabel.setText("Unsold Inventory: " + number.format(Inventory));
			WoodAmtLabel.setText(number.format(WoodAmt) + " pieces");
			LeadAmtLabel.setText(number.format(LeadAmt) + " rods");
			}
		}//End of else if
		else if (e.getActionCommand() == Actions.PRICEDOWN.name())
		{//Beginning of else if
		
		if (Price >=0.01) {
			
			
			if (Price >= 0.01 && Price <=0.05) {
				Demand += 1000;
			}
			else if(Price >= 0.06 && Price <=0.10) {
				Demand += 500;
			}
			else if(Price >= 0.11 && Price <=0.15) {
				Demand += 300;
			} 
			else if(Price >= 0.16 && Price <=0.20) {
				Demand += 200;
			} 
			else if(Price >= 0.21 && Price <=0.25) {
				Demand += 100;
			}
			else if(Price >= 0.26 && Price <=0.30) {
				Demand += 50;
			}
			else if(Price >= 0.31) {
				Demand += 25;
			}
			Price -= 0.01;
		}
		DemandShow = Demand/100;
		
		DemandLabel.setText("Public Demand: " + number.format(DemandShow) +"%");
		PricePerPencilLabel.setText("Price per Pencil: " +money.format(Price));
		}
		else if (e.getActionCommand() == Actions.PRICEUP.name())
		{//Beginning of else if
		
		if (Demand >=1) {
		
		if (Price >= 0.01 && Price <=0.05) {
			Demand -= 1000;
		}
		else if(Price >= 0.06 && Price <=0.10) {
			Demand -= 500;
		}
		else if(Price >= 0.11 && Price <=0.15) {
			Demand -= 300;
		} 
		else if(Price >= 0.16 && Price <=0.20) {
			Demand -= 200;
		} 
		else if(Price >= 0.21 && Price <=0.25) {
			Demand -= 100;
		}
		else if(Price >= 0.26 && Price <=0.30) {
			Demand -= 50;
		}
		else if(Price >= 0.31) {
			Demand -= 25;
		}
		else if(Price == 1.44) {
		}
		Price += 0.01;
		}
		
		DemandShow = Demand/100;
		
		DemandLabel.setText("Public Demand: " + number.format(DemandShow) +"%");
		PricePerPencilLabel.setText("Price per Pencil: " +money.format(Price));
		}
		else if (e.getActionCommand() == Actions.MARKETINGUPGRADE.name())
		{//Beginning of else if
		if (Funds >= UpgradeMarketingCost) {
			MarketingLvl += 1;
			Funds -= UpgradeMarketingCost;
			Demand += 200;
			DemandShow = Demand/100;
			UpgradeMarketingCost += UpgradeMarketingCost;
			MarketingUpgradeCost.setText("Cost: " + money.format(UpgradeMarketingCost));
			MarketingLvlLabel.setText("Level: " + number.format(MarketingLvl));
			DemandLabel.setText("Public Demand: " + number.format(DemandShow) +"%");
			FundsLabel.setText("Available Funds: " + money.format(Funds));
		}
		}
		else if (e.getActionCommand() == Actions.WOOD.name())
		{
		if (Funds >= WoodCost) {
			WoodAmt += WoodRefil;
			Funds -= WoodCost;
			WoodAmtLabel.setText(number.format(WoodAmt) + " pieces");
			FundsLabel.setText("Available Funds: " + money.format(Funds));
		}
		}	
		else if (e.getActionCommand() == Actions.LEAD.name())
		{
		if (Funds >= LeadCost) {
			LeadAmt += LeadRefil;
			Funds -= LeadCost;
			LeadAmtLabel.setText(number.format(LeadAmt) + " rods");
			FundsLabel.setText("Available Funds: " + money.format(Funds));
		}
		}
			
		else if (e.getActionCommand() == Actions.ASSEMBLERBUY.name())
		{
		if (Funds >= AssemblerCost) {
			AssemblerAmt += 1;
			Funds -= AssemblerCost;
			AssemblerCost += AssemblerCost * .05;
			AutoAssemblerLabel.setText(number.format(AssemblerAmt));
			AutoAssemblerCostLabel.setText("Cost: " + money.format(AssemblerCost));
			FundsLabel.setText("Available Funds: " + money.format(Funds));
			PencilsPerSecondValue = AssemblerAmt;
			PencilsPerSecond.setText("Pencils per Second: " + seminumber.format(PencilsPerSecondValue));
		}
		}
		else if (e.getActionCommand() == Actions.PROCESSORS.name())
		{//Beginning of else if
			if(TrustUsed < Trust) {
				Processors+= 1;
				TrustUsed += 1;
				if (TrustRate > 0) {
				TrustRate -= 5;
				}
				OperationsLabel.setText("Operations: " + number.format(Operations) + "/" + number.format(MaxOperations));
				ProcessorsLabel.setText(number.format(Processors));
			}
		}//End of else if
		else if (e.getActionCommand() == Actions.MEMORY.name())
		{//Beginning of else if
			if(TrustUsed < Trust) {
			MaxOperations+= 1000;
			Memory+= 1;
			TrustUsed += 1;
			OperationsLabel.setText("Operations: " + number.format(Operations) + "/" + number.format(MaxOperations));
			MemoryLabel.setText(number.format(Memory));
			}
		}//End of else if
		else if (e.getActionCommand() == Actions.IMPROVEDAUTOASSEMBLERS.name())
		{//Beginning of else if
			if(Operations >= OpsNeededImprovedAutoAssemblers) {
				Operations -= OpsNeededImprovedAutoAssemblers;
				UpgradeA = false;
				Slot2 += 1;
				Slot3 += 1;
				Slot4 += 1;
				Slot5 += 1;
				Slot6 += 1;
				ImprovedAutoAssemblerLabel1.setVisible(false);
				ImprovedAutoAssemblerLabel2.setVisible(false);
				ImprovedAutoAssemblersButton.setVisible(false);
			}
		}//End of else if
		else if (e.getActionCommand() == Actions.IMPROVEDWOODCUTTING.name())
		{//Beginning of else if
			if(Operations >= OpsNeededImprovedWoodCutting) {
				Operations -= OpsNeededImprovedWoodCutting;
				UpgradeB = false;
				Slot3 += 1;
				Slot4 += 1;
				Slot5 += 1;
				Slot6 += 1;
				WoodRefil += 1000;
				ImprovedWoodCuttingLabel1.setVisible(false);
				ImprovedWoodCuttingLabel2.setVisible(false);
				ImprovedWoodCuttingButton.setVisible(false);
			}
		}//End of else if
		else if (e.getActionCommand() == Actions.IMPROVEDLEADMOLDING.name())
		{//Beginning of else if
			if(Operations >= OpsNeededImprovedLeadMolding) {
				Operations -= OpsNeededImprovedLeadMolding;
				UpgradeC = false;
				Slot4 += 1;
				Slot5 += 1;
				Slot6 += 1;
				WoodRefil += 500;
				ImprovedLeadMoldingLabel1.setVisible(false);
				ImprovedLeadMoldingLabel2.setVisible(false);
				ImprovedLeadMoldingButton.setVisible(false);
			}
		}//End of else if
	}//End of actionPerformed
}//End of Clicker_Game
