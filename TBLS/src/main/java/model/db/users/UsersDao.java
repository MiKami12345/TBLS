package model.db.users;

public class UsersDao {

    public UsersDao() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("ドライバが見つかりません");
        }
    }

    // Update
//    public void insert(Users user) throws SQLException {
//        String sql = "INSERT INTO users (name, age) VALUES (?, ?)";
//        try (Connection conn = getConnection();
//             PreparedStatement pstmt = conn.prepareStatement(sql)) {
//
//            pstmt.setString(1, user.getName());
//            pstmt.setInt(2, user.getAge());
//            pstmt.executeUpdate();
//        }
//    }

    // その他のCRUDメソッドは前回と同様でOK
}
