package com.annonymous.ttaleum.modules.member.utils.response;


import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;


@Getter
@AllArgsConstructor
public class Result<T> {
  private HttpStatus code;
  private String message;
  private T data;

  // const response = await this.axios.get("http://localhost:8080/api/product/list");
  // const responseData = response.data;
  /*
  *
  * function MyPage() {
  *   // 변수
  *
  *   return (
  *     <div>
            <div className="Product">
              {responseData.statusCode == 200 ?
                {responseData.data.map((d) => {
                    <li>{d.productId}</li>
                    <li>{d.productName}</li>
                    <li>{d.productPrice}</li>
                    <li>{d.productName}</li>
                })
                : <div className="Image">
                    {responseData.data.map((d) => {
                      <li>{d.productId}</li>
                      <li>{d.productName}</li>
                      <li>{d.productPrice}</li>
                      <li>{d.productName}</li>
                  })
                }

        </div>


  *     </div>
  *   )
  * }
  *
  * */

  public static <T> Result<T> success(String message, T data) {
    return new Result<>(HttpStatus.OK, message, data);
  }

  public static <T> Result<T> failure(HttpStatus statusCode, String message, T data) {
    return new Result<>(statusCode, message, data);
  }

}
