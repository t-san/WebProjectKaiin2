package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import domain.SexEnum;
import vo.Kaiinn;

//---------------------------------------------
//会員管理
public class KaiinnMgr extends Dao
{
    public KaiinnMgr(Connection con)
    {
        super( con );
    }

    private static final String PUT_SQL = "INSERT INTO kaiin " +
            "( " +
            "kaiinNo, " +
            "name, " +
            "registDate, "
            + "sex ) " +
            "VALUES ( ?, ?, ?, ? )";

    private static final String ALLGET_SQL = "select "
            + "kaiinNo, "
            + "name, "
            + "registDate, "
            + "sex "
            + "from "
            + " kaiin";

    private static final String GET_SQL = "select "
            + "name "
            + ",registDate "
            + " ,sex "
            + " from "
            + " kaiin "
            + " where "
            + " kaiinNo = ? ";

    //-------------------------------
    public void put(Kaiinn k) throws SQLException
    {

        try (
                PreparedStatement stmt = con.prepareStatement( PUT_SQL );)
        {
            //SexEnum sex =k.getSex();
            /* Statementの作成 */
            stmt.setInt( 1, k.getKaiinNo() );
            stmt.setString( 2, k.getName() );
            stmt.setDate( 3, convertToSqlDate( k.getRegistDate() ) );
            stmt.setString( 4, k.getSex().name() );
            /* ｓｑｌ実行 */
            int numCount = stmt.executeUpdate();
        } catch (SQLException e)
        {
            throw e;
        }
    }

    //---------------------------------------------
    public Kaiinn get(int kaiinNo) throws SQLException
    {
        Kaiinn k = null;
        try (
                PreparedStatement stmt = con.prepareStatement( GET_SQL );)
        {
            /* Statementの作成 */
            stmt.setInt( 1, kaiinNo );

            /* ｓｑｌ実行 */
            ResultSet rset = stmt.executeQuery();

            while (rset.next())
            {
                k = new Kaiinn(
                        kaiinNo,
                        rset.getString( 1 ),
                        rset.getDate( 2 ),
                        SexEnum.valueOf( rset.getString( 3 ) ) );
            }
        } catch (SQLException e)
        {
            throw e;
        }
        return k;
    }

    //-------------------------------
    public Collection<Kaiinn> values() throws SQLException
    {
        List<Kaiinn> list = new ArrayList<Kaiinn>();
        try (
                PreparedStatement stmt = con.prepareStatement( ALLGET_SQL );)
        {
            /* ｓｑｌ実行 */
            ResultSet rset = stmt.executeQuery();

            while (rset.next())
            {
                Kaiinn k = new Kaiinn(
                        rset.getInt( 1 ),
                        rset.getString( 2 ),
                        rset.getDate( 3 ),
                        SexEnum.valueOf( rset.getString( 4 ) ) );

                list.add( k );
            }
        } catch (SQLException e)
        {
            throw e;
        }
        return list;
    }
}
