package Simple;

import java.util.Scanner;

public class SimpleHome {

	public static void main(String[] args) {
		boolean login = false;
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		String SingID = "";
		String SingPW = "";
		String LoginID = "";
		String LoginPW = "";
		String Name = "";
		String Admin="";
		boolean ACard=false;
		String APass="qwe123";
		// MyInfomation
		int HpMax = 200;
		int HpMin = 190;
		int Level = 1;

		// shop
		int Shop = 0;
		int WeaUp=0;
		int ShoBox = 0;
		int buy = 0;
		int buyO = 0;
		int ShoBo1 = 0;
		int BoxSave = 0;
		int S1 = 30;
		int K1 = 100;
		int G1 = 20;
		int GetS = 0;
		int GetK = 0;
		int GetG = 0;
		int Up = 0;
		int Go = 0;
		int gang = 0;
		int Get = 0;
		int Heal = 0;
		String BoxNam = "";
		// 은행
		int Money = 0;
		int Bank = 0;
		int BankIn = 0;
		int Chol = 0;
		String BankCh = "";
		String Ok = "확인";
		String Cancel = "취소";
		//game
		int BHmax=2500;
		int BHmin=1500;
		float Boss=(float)(Math.random()*BHmax)+BHmin;
		int BossBu=(int)(Math.random()*5)+1;
		int BossAT=10;
		int hit=0;
		int Stack=0;
		int d1=0;
		//내정보
		
		boolean run = true;

		while (run) {
			if(ACard==true) {System.out.printf("관리자창%n1.회원리스트");}
			else {
			if (login == false) {
				System.out.printf("1.회원가입 2.로그인 0.종료%n선택 : ");
			} else {
				System.out.printf("1.정보수정 2.shop 3.은행 4.game 5.내 정보 6.로그아웃 0.종료%n%s님 잔액 : %,d 원 무기 %s 선택 : ", Name,Money, BoxNam);
			}
			}
			if (sc.hasNextInt()) {
				menu = sc.nextInt();
			} else {
				System.out.println("숫자만 입력해주세요.");
			}
			sc.nextLine();

			switch (menu) {
			case 1:
				if (login == false) {
					System.out.println("회원가입");
					System.out.printf("Name : ");
					Name = sc.nextLine();
					System.out.printf("Id : ");
					SingID = sc.nextLine();
					System.out.printf("Pw : ");
					SingPW = sc.nextLine();
					System.out.println("");
					System.out.println("가입완료");
					System.out.printf("Name : %s %n", Name);
					System.out.printf("ID : %s %n", SingID);
					System.out.printf("PW : %s %n", SingPW);
				}

				else {
					System.out.println("수정 전에 재로그인을 해주세요.");
					System.out.printf("Id : ");
					SingID = sc.nextLine();
					System.out.printf("Pw : ");
					SingPW = sc.nextLine();
					System.out.println();
					if (LoginID.equals(SingID)) {
						if (LoginPW.equals(SingPW)) {
							System.out.println("로그인 완료");
							System.out.println("수정 할 ID/PW를 입력해주세요.");
							System.out.printf("Id : ");
							LoginID = sc.nextLine();
							System.out.printf("Pw : ");
							LoginPW = sc.nextLine();
							SingID = LoginID;
							SingPW = LoginPW;
							System.out.println("수정 완료");
							System.out.printf("Name : %s %n", Name);
							System.out.printf("ID : %s %n", SingID);
							System.out.printf("PW : %s %n", SingPW);
						}

					}
					if (!login) {
						System.out.println("다시 시도해주세요.");
					}

				}
				break;
			case 2:
				if (login == false) {
					System.out.println("로그인");
					System.out.printf("Id : ");
					LoginID = sc.nextLine();
					System.out.printf("Pw : ");
					LoginPW = sc.nextLine();
					System.out.println();
					if (SingID.equals(LoginID)) {
						if (SingPW.equals(LoginPW)) {
							System.out.println("로그인 완료");
							login = true;
							break;
						}

					}
					if (!login) {
						System.out.println("고객정보가 맞지 않거나 없는 정보 입니다.");
					}
				}

				else {
					System.out.println("shop");
					System.out.printf("1.상자\t2.무기 강화 3.체력회복\t4.무기삭제\t5.강화횟수복구%n");
					System.out.println("");
					System.out.printf("900원\t1000원\t \t\t2000원\t1500원%n선택 : ");
					if (sc.hasNextInt()) {
						Shop = sc.nextInt();
					}
					switch (Shop) {
					case 1:
						if(Get==0) {
						System.out.println("900원입니다 구매는 1번 구매 취소는 아무키나 눌러주세요.");
						if (sc.hasNextInt()) {
							buy = sc.nextInt();
						} else {
							System.out.println("숫자만 입력해주세요");
						}
						if (buy == 1) {
							if (Money - 900 < 0) {
								System.out.println("금액 부족");
								continue;
							} else {
								System.out.println("구매 완료");
								ShoBox = (int) (Math.random() * 3) + 1;
								if (ShoBox == 1) {
									BoxNam = "샷건";
									GetS++;
									Get++;
								} else if (ShoBox == 2) {
									BoxNam = "소총";
									GetG++;
									Get++;
								} else if (ShoBox == 3) {
									BoxNam = "칼";
									GetK++;
									Get++;
								}

								System.out.printf("무기 : %s 획득%n", BoxNam);
							Money-=900;}
						} else {
							System.out.println("홈페이지로 돌아갑니다");
						}
						}
						else {System.out.println("무기는 1개까지만 장착이 가능합니다.");}

						break;
					case 2:
						if (Get == 1) {
							System.out.println("무기 강화");
							System.out.printf("강화는 최대 9번만 가능합니다%n시도 한 횟수 %d 번 %n", Up);
							if (Up == 9) {
								System.out.println("더 이상 강화는 불가능합니다.");
								continue;
							}
							for (Up = WeaUp; Up < 9; Up++) {
								System.out.printf("0번은 취소 1번은 강화 입니다.");
								Go = sc.nextInt();
								if (Money - 1000 < 0) {
									System.out.println("금액 부족");
									break;
								}
								int Muup = (int) (Math.random() * 2) + 1;
								if (Go == 1) {
									if (Muup == 1) {
										System.out.println("강화 성공");
										G1 += 3;
										S1 += 5;
										K1 += 10;
										Money -= 1000;
										gang++;
										WeaUp++;
									} else if (Muup == 2) {
										System.out.println("강화 실패");
										Money -= 1000;
										WeaUp++;
									}
								}
								else if(Go==0) {System.out.printf("강화 취소%n"); break;}

							}
							System.out.printf("%s %d강%n", BoxNam, gang);
						} 
						else if(Get>=2) {
							System.out.println("무기는 2개 이상 지닐 수 없습니다.");
						}
						else {
							System.out.printf("무기 구매를 해주세요.%n홈페이지로 이동됩니다.%n");
							break;
						}
						break;
					case 3:
						System.out.printf("1.25%%회복\t2.50%%회복\t3.100%%회복%n");
						System.out.println("---------------------------------");
						System.out.printf("300원\t 550원\t 1050원%n선택 : ");
						if (sc.hasNextInt()) {
							buy = sc.nextInt();
						} else {
							System.out.println("숫자만 입력해주세요");
						}
						if (HpMin < HpMax) {
							if (buy == 1) {
								if (Money - 300 < 0) {
									System.out.println("금액 부족");
									continue;
								} else {
									System.out.printf("체력이 25%% 회복 되었습니다.%n");
									HpMin += HpMax * 0.25;
									if (HpMin > HpMax) {
										HpMin = HpMax;
										System.out.printf("hp : %d/%d %n", HpMin, HpMax);
										Money -=300;
									} else {
										System.out.printf("hp : %d/%d %n", HpMin, HpMax);
										Money -=300;
									}
								}
							} else if (buy == 2) {
								if (Money - 550 < 0) {
									System.out.println("금액 부족");
									continue;
								} else {
									System.out.printf("체력이 50%% 회복 되었습니다.%n");
									HpMin += HpMax * 0.5;
									if (HpMin > HpMax) {
										HpMin = HpMax;
										System.out.printf("hp : %d/%d %n", HpMin, HpMax);
										Money -=550;
									} else {
										System.out.printf("hp : %d/%d %n", HpMin, HpMax);
										Money -=550;
									}
								}
							} else if (buy == 3) {
								if (Money - 1050 < 0) {
									System.out.println("금액 부족");
									continue;
								} else {
									System.out.printf("체력이 100%% 회복 되었습니다.%n");
									HpMin=HpMax;
										System.out.printf("hp : %d/%d %n", HpMin, HpMax);
										Money -=1050;
								}
							}
						} else {
							System.out.printf("체력이 가득 찼습니다.%n");
							continue;
						}
						break;
					case 4:
						if(Get>=1) {
							if (Money - 2000 < 0) {
							System.out.println("금액 부족");
							continue;}
							else {
						System.out.println("무기를 삭제했습니다.");
						Get--;
						Up=0;
						WeaUp=0;
						gang=0;
						BoxNam="";
						Money-=2000;}
						}
						break;
					case 5:
						if(Get>=1) {
						if (Money - 1500 < 0) {
							System.out.println("금액 부족");
							continue;
						}
						else {System.out.printf("강화 횟수 1회 차감 됐습니다.%n");
						Money-=1500; 
						Up--;
						WeaUp--;}
						}
						else {System.out.printf("무기를 구매해주세요.");}
						break;

					}
				}
				break;
			case 3:
				if (login == false) {
					System.out.println("비회원은 1~3번만 입력해주세요.");
				}

				else {
					System.out.println("은행 방문 전 재 로그인을 해주세요");
					System.out.printf("Id : ");
					SingID = sc.nextLine();
					System.out.printf("Pw : ");
					SingPW = sc.nextLine();
					System.out.println();
					if (LoginID.equals(SingID)) {
						if (LoginPW.equals(SingPW)) {
							boolean BankRun = true;
							while (BankRun) {
								System.out.println("은행");
								System.out.printf("");
								System.out.printf("1.입금 2.출금 3.잔액 4.홈페이지%n잔액 : %,d 원 선택 : ", Money);
								Bank = sc.nextInt();
								switch (Bank) {
								case 1:
									System.out.println("입금 선택");
									System.out.printf("금액을 넣어주세요. : ");
									BankIn = sc.nextInt();
									System.out.printf("입금액 : %,d 원 맞으면 \"확인\" 틀리면 \"취소\"를 눌러주세요%n선택: ", BankIn);
									if (sc.hasNextLine()) {
										BankCh = sc.next();
										if (Ok.equals(BankCh)) {
											Money += BankIn;
											System.out.printf("금액 입금 완료 잔액 : %,d 원%n", Money);
											BankRun = false;
										} else if (Cancel.equals(BankCh)) {
											System.out.printf("거래가 취소 되었습니다.%n홈페이지로 돌아갑니다.");
											BankRun = false;
										} else {
											System.out.println("확인과 취소를 정확히 눌러주세요.");
											continue;
										}
									}

									break;
								case 2:
									System.out.println("출금 선택");
									System.out.printf("금액을 입력해주세요. : ");
									BankIn = sc.nextInt();
									System.out.printf("출금 하려는 액수 : %,d 원 맞으면 \"확인\" 틀리면 \"취소\"를 눌러주세요%n선택: ", BankIn);
									if (sc.hasNextLine()) {
										BankCh = sc.next();
										if (Ok.equals(BankCh)) {
											Chol = Money - BankIn;
											if (Chol <= 0) {
												System.out.println("금액 부족");
												continue;
											}
											System.out.printf("금액 입금 완료 잔액 : %,d 원%n", Money);
											System.out.println("----------------");
											break;
										} else if (Cancel.equals(BankCh)) {
											System.out.println("거래가 취소 되었습니다. 홈페이지로 돌아갑니다");
											BankRun = false;
										} else {
											System.out.println("확인과 취소를 정확히 눌러주세요.");
											continue;
										}
									}
									break;
								case 3:
									System.out.printf("잔액 : %,d원 %n", Money);
									continue;
								case 4:
									System.out.println("홈페이지로 이동");
									BankRun = false;
								}

							}
						}

					}

				}
				break;
			case 4:
				if (login == false) {
					System.out.println("비회원은 1~3번만 입력해주세요.");
				}
				else {
				if(Get>=1) {
				if(HpMin<=0) {System.out.println("상점에서 체력회복 해주세요.");}
				else {
					System.out.printf("보스 체력 : %.3f%n",Boss);
				while (run) {
					int Gun = (int) (Math.random() * G1) + 10;
					int Gun1=(int)(Math.random()*5)+4;
					int Shot = (int) (Math.random() * S1) + 15;
					int Shot1=(int)(Math.random()*4)+2;
					int Knife = (int) (Math.random() * K1) + 60;
					System.out.printf("무기 : %s %d강%n",BoxNam,gang);
					System.out.printf("공격은 1번 눌러주세요 :");
					hit=sc.nextInt();
					if(HpMin<=0) {
						System.out.println("Game Over");
						break;
					}
					if(Boss<=0) {
						Level++;
						Money+=300;
						HpMax+=50;
						Boss+=Boss=(float)(Math.random()*BHmax)+BHmin;
						Boss+=500;
						System.out.printf("win%nLevelUp : %d 체력 증가 : %d/%d %n300원획득%n보스가 강해집니다.%n",Level,HpMin,HpMax);
						break;
					}
					if(hit==1) {
					if(GetS==1) {
					Boss-=Shot*Shot1;
					d1=Shot*Shot1;
					System.out.printf("보스에게 준 피해량 : %d %n보스 hp : %.2f %n",d1,(float)Boss);
					HpMin-=BossAT;
					System.out.printf("피격당함%n내 hp : %d%n",HpMin);
					BossAT+=BossBu;
					System.out.printf("보스 공격력 증가 :%d%n",BossAT);
					Stack++;
					}
					else if(GetK==1) {
						Boss-=Knife;
						System.out.printf("보스에게 준 피해량 : %d %n보스 hp : %.2f %n",Knife,(float)Boss);
						HpMin-=BossAT;
						System.out.printf("피격당함%n내 hp : %d%n",HpMin);
						BossAT+=BossBu;
						System.out.printf("보스 공격력 증가 :%d%n",BossAT);
						Stack++;
						}
					else if(GetG==1) {
						Boss-=Gun*Gun1;
						d1=Gun*Gun1;
						System.out.printf("보스에게 준 피해량 : %d %n보스 hp : %.2f %n",d1,(float)Boss);
						HpMin-=BossAT;
						System.out.printf("피격당함%n내 hp : %d%n",HpMin);
						BossAT+=BossBu;
						System.out.printf("보스 공격력 증가 :%d%n",BossAT);
						Stack++;
						}
					}
					else{
						HpMin-=BossAT;
						System.out.printf("피격당함%n내 hp : %d",HpMin);
					}
					if(Stack==3) {System.out.println("보스 공격력이 원상복구 됩니다."); BossAT=10; Stack=0;}
				}
				}
				}
				else {System.out.printf("무기를 구매해주세요.");}
				}
				break;
				
			case 5:
				//내정보
				break;
			case 6:
				if (login == false) {
					System.out.println("비회원은 1~3번만 입력해주세요.");
				}
				else {System.out.println("로그아웃 선택");
				login=false;}

				break;

			case 0:
				System.out.println("종료 선택");
				run = false;
				break;

			default:
				break;

			}
		}
		System.out.println("종료");

	}
}
