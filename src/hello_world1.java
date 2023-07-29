package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view.QLSVview;

public class QLSVcontrol implements ActionListener{
	private QLSVview qlsVview ;
	public QLSVcontrol(QLSVview qlsVview) {
		this.qlsVview=qlsVview;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if(src.equals("Thêm")) {
			try {
				this.qlsVview.themsinhvien();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			this.qlsVview.qlsv.setLuachon("Thêm");
			
		}
		else if(src.equals("Lưu")) {
			if(this.qlsVview.qlsv.getLuachon().equals("")||this.qlsVview.qlsv.getLuachon().equals("Thêm")) {
				try {
				this.qlsVview.luusinhvien();
				this.qlsVview.themsinhvien();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
			}
			else if(this.qlsVview.qlsv.getLuachon().equals("Chỉnh sửa")) {
				try {
						this.qlsVview.chinhsua();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			
			}
		}
		else if(src.equals("Chỉnh sửa")){
				this.qlsVview.hienthiSVdaChon();
				this.qlsVview.qlsv.setLuachon("Chỉnh sửa");
			}
		else if(src.equals("Xóa")) {
			try {
				this.qlsVview.xoasv();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
		else if(src.equals("Lọc")) {
			try {
				this.qlsVview.locsinhvien();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		else if(src.equals("Hủy bỏ")) {
			try {
				this.qlsVview.huybo();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		else if(src.equals("Exit")) {
			int choice = JOptionPane.showConfirmDialog(qlsVview,"Bạn có muốn thoát khỏi chương trình không ?","Exit",JOptionPane.YES_NO_OPTION);
			if(choice == JOptionPane.YES_OPTION) {
				System.exit(0);
			}
			
		}
		else if(src.equals("About me")) {
			JOptionPane.showMessageDialog(qlsVview,"Đây là chương trình quản lý sinh viên","About me",JOptionPane.INFORMATION_MESSAGE);
		}
		else if(src.equals("Open")) {
			this.qlsVview.thuchienopen();
		}
		else if(src.equals("Save")) {
			this.qlsVview.thuchiensave(src);
		}
		
		}
		
	}


