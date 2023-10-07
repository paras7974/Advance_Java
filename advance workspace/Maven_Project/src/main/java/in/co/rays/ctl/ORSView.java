package in.co.rays.ctl;
/**
 * Contains ORS View and Controller URI
 *
 * @author Paras Mahajan
 
 */
public interface ORSView {
	// Its a Marker Interface; its not contain any method
	public String APP_CONTEXT = "/ORSProject4";

    public String LAYOUT_VIEW = "/BaseLayout.jsp";
    public String PAGE_FOLDER = "/jsp";

    public String JAVA_DOC_VIEW = APP_CONTEXT + "/doc/index.html";

    public String ERROR_VIEW = PAGE_FOLDER + "/ErrorView500.jsp";

    public String Marksheet_View = PAGE_FOLDER + "/MarksheetView.jsp";
    public String Marksheet_List_VIEW = PAGE_FOLDER + "/MarksheetListView.jsp";
    public String GET_Marksheet_View = PAGE_FOLDER + "/GetMarksheetView.jsp";
    public String User_View = PAGE_FOLDER + "/UserView.jsp";
    public String User_List_View = PAGE_FOLDER + "/UserListView.jsp";
    public String College_View = PAGE_FOLDER + "/CollegeView.jsp";
    public String College_List_VIEW = PAGE_FOLDER + "/CollegeListView.jsp";
    public String Student_View = PAGE_FOLDER + "/StudentView.jsp";
    public String Student_List_View = PAGE_FOLDER + "/StudentListView.jsp";
    public String Role_View = PAGE_FOLDER + "/RoleView.jsp";
    public String Role_List_View = PAGE_FOLDER + "/RoleListView.jsp";
    public String USER_Registration_View = PAGE_FOLDER + "/UserRegistrationView.jsp";
    public String LogIn_View = PAGE_FOLDER + "/LoginView.jsp";
    public String Welcome_View = PAGE_FOLDER + "/WelcomeView.jsp";
    public String Change_Password_VIEW = PAGE_FOLDER + "/ChangePasswordView.jsp";
    public String My_Profile_View = PAGE_FOLDER + "/MyProfileView.jsp";
    public String Forgate_Password_View = PAGE_FOLDER + "/ForgetPasswordView.jsp";
    public String Marksheet_Merit_LIST_View = PAGE_FOLDER + "/MarksheetMeritListView.jsp";
    public String Error_Ctl = APP_CONTEXT + "/ErrorCtl";
    public String Marksheet_Ctl = APP_CONTEXT + "/ctl/MarksheetCtl";
    public String Marksheet_List_Ctl = APP_CONTEXT + "/ctl/MarksheetListCtl";
    public String UserCtl = APP_CONTEXT + "/ctl/UserCtl";
    public String User_List_Ctl = APP_CONTEXT + "/ctl/UserListCtl";
    public String College_Ctl = APP_CONTEXT + "/ctl/CollegeCtl";
    public String College_List_Ctl = APP_CONTEXT + "/ctl/CollegeListCtl";
    public String Course_Ctl_Ctl = APP_CONTEXT + "/ctl/CourseCtl";
    public String Student_Ctl = APP_CONTEXT + "/ctl/StudentCtl";
    public String Student_List_Ctl = APP_CONTEXT + "/ctl/StudentListCtl";
    public String Role_Ctl = APP_CONTEXT + "/ctl/RoleCtl";
    public String Role_List_Ctl = APP_CONTEXT + "/ctl/RoleListCtl";
    public String User_Registration_Ctl = APP_CONTEXT + "/UserRegistrationCtl";
    public String LogIn_Ctl = APP_CONTEXT + "/LoginCtl";
    public String Welcome_Ctl = APP_CONTEXT + "/WelcomeCtl";
    public String LogOut_Ctl = APP_CONTEXT + "/LoginCtl";
    public String Get_Marksheet_Ctl = APP_CONTEXT + "/ctl/GetMarksheetCtl";
    public String Change_Password_Ctl = APP_CONTEXT + "/ctl/ChangePasswordCtl";
    public String My_Profile_Ctl = APP_CONTEXT + "/ctl/MyProfileCtl";
    public String Forgate_Password_Ctl = APP_CONTEXT + "/ForgetPasswordCtl";
    public String Marksheet_Merit_List_Ctl = APP_CONTEXT + "/ctl/MarksheetMeritListCtl";
    public String Course_Ctl = APP_CONTEXT + "/ctl/CourseCtl";
    public String Course_View = PAGE_FOLDER + "/CourseView.jsp";
    public String Course_List_Ctl = APP_CONTEXT + "/ctl/CourseListCtl";
    public String Course_List_View = PAGE_FOLDER + "/CourseListView.jsp";
    public String Subject_Ctl = APP_CONTEXT + "/ctl/SubjectCtl";
    public String Subject_View = PAGE_FOLDER + "/SubjectView.jsp";
    public String Subject_List_Ctl = APP_CONTEXT + "/ctl/SubjectListCtl";
    public String Sbject_List_View = PAGE_FOLDER + "/SubjectListView.jsp";
    public String Timetable_Ctl = APP_CONTEXT + "/ctl/TimeTableCtl";
    public String Timetable_View = PAGE_FOLDER + "/TimeTableView.jsp";
    public String Timetable_List_Ctl = APP_CONTEXT + "/ctl/TimeTableListCtl";
    public String Timetable_List_View = PAGE_FOLDER + "/TimeTableListView.jsp";
    public String Faculty_Ctl = APP_CONTEXT + "/ctl/FacultyCtl";
    public String Faculty_View = PAGE_FOLDER + "/FacultyView.jsp";
    public String Faculty_List_Ctl = APP_CONTEXT + "/ctl/FacultyListCtl";
    public String Faculty_List_View = PAGE_FOLDER + "/FacultyListView.jsp";
}