package test.com;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

public class ParseJwtTest {

    public static void main(String[] args) {
        String token = "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI4ODgiLCJzdWIiOiLlsI_nmb0iLCJpYXQiOjE1NTYwODc2MDh9.RGqBkrDoCRccrP_SA3Yh8wjTRQzYdkCnEj-CwgCb524";
        Claims claims = Jwts.parser().setSigningKey("itcast").parseClaimsJws(token).getBody();

        System.out.println("id:"+claims.getId());
        System.out.println("subject:"+claims.getSubject());
        System.out.println("IssuedAt:"+claims.getSubject());
    }

}
