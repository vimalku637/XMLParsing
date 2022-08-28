package com.ctl.xmlparsing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.json.JSONObject;
import org.json.XML;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.tvTextView);

        parseXMLData();
    }

    private void parseXMLData() {
        String xmlFormat="<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><PidData><Resp errCode=\"0\" errInfo=\"\" fCount=\"1\" fType=\"0\" nmPoints=\"54\" qScore=\"2\"/><Data type=\"X\">MjAyMi0wOC0yN1QxNzo0NzowMz5Stmz2309QcPC1msg7nC+nJklvWONgP/HjmURsSMu4/pr1b+t969CWQ7xDmOHnmF92tETM/yPNOKXWyhV91X4bdIjmvcNhIOtFATeC7KYlRY0JW7AzQKx3dvZbJUJAcWfkm+rPctiP40MwPBHTPgKkl9BZBX9strEuHEALJMplkHU1HniH7psjhICNnWCzfUAvxQGZMQbAvLLj/lQ75/962a31lTQDwoRLQaQ/XGcmeKTtVcMot0dIGYSiOtRQ07auxDUzUN3E4GMH2daV1CGrGpyn6f+dyApUcjUOhsMafP1lJ4bt6JOTcnxUkGt718E+z85qIpeLCExRO4Bt/R4bNGGi5E7kIVgWx8DcEy17fGSpCsA+58Pf60YDY7eQAwLGyhAm0njlnzV5FIVa0nHEYwz02OXDlZZmUjoZA4SThAH5+R+V4gMcKoyptdj0nrP3W1Hvh/7G/lnal5fxp0LuNclb0sVC005VPdiY7DhFFuJEOH5JPFBcE4l9paaBA7x6bV9PgGfeorMWD7xKA36f0QqOtk+/X/yt9KcMgShC0J00CLuhS/m/RV7e2Vfj1UFKmEcae1i2KJEgSRdCgZTEpg+wuO33PFtkPskfDIoA+PpD/isCFs9wlS8ArRn1lXhrGCDvf6msRKtCdL6kPu0z0fbkYow1F1MKO85diEgyM9G3mxSz/zaAFngz2TZrReqWu3Ulc0pM5bR03rC3d+9VobCDac7UG0VmxyKGX9J4rSU86F58ulTTdDa9XgE3BK+btkb6LQpIjnAVS//MvjrPQ4RrixnQ6C5NJO6MIHmFHwi8RCqVu8q/nlpakEjN6UPCXgNjWqCb6Du4enGgAdK0Yfq8wmN/vYK4Sy6V3wone0EHwqAWTeHieW4hunWJ9+qIisFoz/Ped6Jkf3rjPFIVRf2WmJdPUKeoC4HOKJ4CYMXLofhTuE0Cl2bQboP0eXp6xg9N4O48H2cDQ9Nsrg9qR8isvnXuDqp4jIifqRE8JATLcXRrumHhu5ZDPxxx/3+78WCOJ10ph8XQzwkboQc3gdKValAkfwniq2Jtcy6XIC+83MmReId6fr7wtQB8XhpwEqi4RBh1JNTbEmktl2dvAsEBsOS+9uZSiSuzamiSVGVlSWzXTq1+dOc6q7dzcg9n6QovD6KysP6plVvtSzRawXSEu6OExWAbYUbNSG1NXzREdalfemFYtuRqIPF2qMTgRhymXMitclsC0+rNbY/OqwOfOHX/9u6XH7qAW4qA3ifbQI+hkKwXZr9pw7qyZOjB14GOO0IRvMSGNeA4YE3AbpzVLfwYCd1z6jrCIg72EnILfjZY7cI86GniF2vCVhzWlZu4er7Erb17+jMSZoWUYXGRSFJPuN50Uld8O7pYhsDSEC8BfpkaiOvMP+w2nMjZD7vlaL3rUeljDqRhpZqhcC4xG/NkmaCK0G9JBl7CEpH87UoLang7mC1YchBAlmrVvRFSJ84hRhokPbge7FRDW3uRb/vrzQh9vvlB120I3Ua5amW3Kww=</Data><Skey ci=\"20221021\">nWf6VPn87sUeEL9VZ7Tzm0/cCrqK3jvFYlHS/5Xnkc/8zMbIO/n/QdFGV7aR4ADBLW+6fGlCNwbsWR0sbxKimZ0G9UaM4DTlZsw8KpAsZMOXAF3nlc+IOv6S0FsWFrOseeUj0kPkXcfwYRNlsA4nlEuoGrB9n3/LAMA2N5kih8bLIUlV7n6KqBgIPJituJ1Y6FMqATWMlTRDJUD2WeJA+GkpWSJwLOIjt/zgN+GJ04p25pSoi86M4faqU0YypzD1KhEf9r6g1oprre2ajXZTrcsUx6mSQI7hpRb1K4VIn+U0eCqKtHstP672NGH5ZaczBi4cRR2Ho47QbHB4vseiQQ==</Skey><Hmac>zd0w0ZkNMgeEUpxt0EIokRSnmEm0C6wEEnEeI1gySYJvDtzM8IpQkr6lhmceKGBA</Hmac><DeviceInfo dpId=\"STARTEK.ACPL\" rdsId=\"ACPL.AND.001\" rdsVer=\"2.0.4\" dc=\"e0613d24-a2a0-4317-8543-656412d9e898\" mi=\"FM220U\" mc=\"MIIDfjCCAmagAwIBAgIDNInIMA0GCSqGSIb3DQEBCwUAMHQxHTAbBgNVBAMTFEJJSkFZIEFNQVJOQVRIIFNJTkhBMRAwDgYDVQQIEwdHVUpBUkFUMREwDwYDVQQLEwhESVJFQ1RPUjEhMB8GA1UEChMYQUNDRVNTIENPTVBVVEVDSCBQVlQgTFREMQswCQYDVQQGEwJJTjAeFw0yMjA4MjUxODE2NDdaFw0yMjA5MjQxODE2NDdaMFExCzAJBgNVBAYTAklOMRAwDgYDVQQIDAdHdWphcmF0MQ0wCwYDVQQKDARVU0VSMQ0wCwYDVQQLDARVU0VSMRIwEAYDVQQDDAlQUk9EX1VTRVIwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQCOpjkSVQ7yCOCtwCkGbfSzj5pe76zFsAlTb9Lb3wN1+FEjZK5OTlF5o8xI0T+AGtkS0MA2FGjA3mb6Y4dORdoxwANC+LyNDipHwPHfw1L4/7Qe2JhBjxkr5vzVyUPc4lv1/Am/l1cZZMYr8yzM8TtUH2a6nTtQOe3aU3+dzNRfT/8VVQT2weost0Q2yzlFPByl6JXx8CRB4scWFAscGneLrJVYHXKhD8jS5iElr8wKf7Yxt+OkxvxMtr4wIznHJrda90jFoWvCL+eVV90/RPOu1SzS17UQ8LTOt5LlPu5d9Lxwg518tDpTv/+KnZJ7ybGFoHwRM6GTLggQl85nRdBhAgMBAAGjPDA6MAwGA1UdEwQFMAMBAf8wCwYDVR0PBAQDAgGGMB0GA1UdDgQWBBRTL+9a+mUkdQ+D8gfnZtEM5euIIjANBgkqhkiG9w0BAQsFAAOCAQEAuJ26JkAsXVQPD6tTQSQWIsuLf4Fn2SzPKy/TDxsRT949jbgpBsYEvfsYEg+yGYHaIU33EhGy0WHGfFkH16/XjziFuecW5XgNtbKdlP8BPXkM1c40LLmB9wUEEtQyRg+xNfAbxoBrwD36jkmP/yHQIGNdiosAxURFlJr2UiD3p5q6PFLyZMj8Q8E7/NrRttQlgcC8ntrFeuhCv1ouJ+BsvuNPt1dVRelV6ITYEnufzHXf0wciyomTfgRdeBFirhrnhVNlNidLfi0XwxEnGB0aQi5xi1ilM1EvMF+RFfhaonOUbSsVd5rpiyw4TMZnmvuGDoqxAwP0a2DmaAewA5q2mQ==\"><additional_info><Param name=\"srno\" value=\"B47951534\"/><Param name=\"DeviceType\" value=\"Open\"/><Param name=\"sysid\" value=\"729a8c1506f3cc4d8d02816d7a234879\"/><Param name=\"ts\" value=\"2022-08-27T17:47:03+5:30\"/></additional_info></DeviceInfo></PidData>";
        try {
            JSONObject json = XML.toJSONObject(xmlFormat);
            Log.e("TAG>>>", "parseXMLData: "+json.toString());
            JSONObject jsonObject=new JSONObject(json.toString());
            JSONObject jsonObjectPidData=jsonObject.getJSONObject("PidData");
            JSONObject jsonObjectResp=jsonObjectPidData.getJSONObject("Resp");
            String _errCode=jsonObjectResp.getString("errCode");
            String _errInfo=jsonObjectResp.getString("errInfo");
            String _fCount=jsonObjectResp.getString("fCount");
            String _fType=jsonObjectResp.getString("fType");
            String _nmPoints=jsonObjectResp.getString("nmPoints");
            String _qScore=jsonObjectResp.getString("qScore");

            textView.setText(
                    _errCode+"\n"
                    +_errInfo+"\n"
                            +_fCount+"\n"
                            +_fType+"\n"
                            +_nmPoints+"\n"
                            +_qScore);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}