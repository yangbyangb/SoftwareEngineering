package cn.edu.sjtu.yangbo.sjtutourguide;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsMinHangActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    boolean mapReady = false;

    MarkerOptions xinTu;
    LatLng xinTuLatLng = new LatLng(31.0257422416, 121.4373993874);
    MarkerOptions baoTu;
    LatLng baoTuLatLng = new LatLng(31.0218523461, 121.4301017195);
    MarkerOptions tuoXieMen;
    LatLng tuoXieMenLatLng = new LatLng(31.0176273461, 121.4309037195);
    MarkerOptions siYuanHu;
    LatLng siYuanHuLatLng = new LatLng(31.0202653461, 121.4293717195);
    MarkerOptions guangTi;
    LatLng guangTiLatLng = new LatLng(31.0190083461, 121.4275367195);
    MarkerOptions jingJingTang;
    LatLng jingJingTangLatLng = new LatLng(31.0182543461, 121.4296397195);
    MarkerOptions nanTi;
    LatLng nanTiLatLng = new LatLng(31.0216283461, 121.4334487195);
    MarkerOptions shangYuan;
    LatLng shangYuanLatLng = new LatLng(31.0197063461, 121.4309757195);
    MarkerOptions zhongYuan;
    LatLng zhongYuanLatLng = new LatLng(31.0204143461, 121.4313077195);
    MarkerOptions xiaoYiYuan;
    LatLng xiaoYiYuanLatLng = new LatLng(31.0186673461, 121.4340757195);
    MarkerOptions tuYaQiang, tuYaQiang2, tuYaQiang3;
    LatLng tuYaQiangLatLng = new LatLng(31.0197893461, 121.4348377195);
    LatLng tuYaQiang2LatLng = new LatLng(31.0254312853, 121.4324686095);
    LatLng tuYaQiang3LatLng = new LatLng(31.0275452853, 121.4314386095);
    MarkerOptions zhiWuYuan;
    LatLng zhiWuYuanLatLng = new LatLng(31.0277919048, 121.4361943407);
    MarkerOptions xueFu;
    LatLng xueFuLatLng = new LatLng(31.0285072853, 121.4327476095);
    MarkerOptions zhiYuanYouYong;
    LatLng zhiYuanYouYongLatLng = new LatLng(31.0205663461, 121.4267167195);
    MarkerOptions huoTi;
    LatLng huoTiLatLng = new LatLng(31.0266642522, 121.4245364683);
    MarkerOptions nanMen;
    LatLng nanMenLatLng = new LatLng(31.0226687420, 121.4454386030);
    MarkerOptions dongMen;
    LatLng dongMenLatLng = new LatLng(31.0288899474, 121.4484939730);
    MarkerOptions dianYuan;
    LatLng dianYuanLatLng = new LatLng(31.0251759048, 121.4414713407);
    MarkerOptions jiDong;
    LatLng jiDongLatLng = new LatLng(31.0257829474, 121.4474859730);
    MarkerOptions dianCao;
    LatLng dianCaoLatLng = new LatLng(31.0249106114, 121.4440146063);
    MarkerOptions ruanJianXueYuan;
    LatLng ruanJianXueYuanLatLng = new LatLng(31.0223546114, 121.4423306063);
    MarkerOptions weiDianZi;
    LatLng weiDianZiLatLng = new LatLng(31.0229906114, 121.4439866063);
    MarkerOptions xingZhengB;
    LatLng xingZhengBLatLng = new LatLng(31.0270179048, 121.4404813407);
    MarkerOptions chengJiMeiShuGuan;
    LatLng chengJiMeiShuGuanLatLng = new LatLng(31.0210753461, 121.4289327195);
    MarkerOptions hanZeHu;
    LatLng hanZeHuLatLng = new LatLng(31.0248703461, 121.4344997195);
    MarkerOptions zhiYuanHu;
    LatLng zhiYuanHuLatLng = new LatLng(31.0263289048, 121.4433373407);
    MarkerOptions tongDeHu;
    LatLng tongDeHuLatLng = new LatLng(31.0262902853, 121.4336136095);

    static final CameraPosition SJTU_MinHang = CameraPosition.builder()
            .target(new LatLng(31.0252273805,121.4337730408))
            .zoom(16)
            .bearing(0)
            .tilt(45)
            .build();

    @Override
    public Resources getResources() {
        return super.getResources();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_min_hang);

        xinTu  = new MarkerOptions().position(xinTuLatLng).title("新图书馆")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.library));
        baoTu  = new MarkerOptions().position(baoTuLatLng).title("包玉刚图书馆")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.library));
        tuoXieMen  = new MarkerOptions().position(tuoXieMenLatLng).title("拖鞋门")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.gate));
        siYuanHu = new MarkerOptions().position(siYuanHuLatLng).title("思源湖")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.waves));
        guangTi = new MarkerOptions().position(guangTiLatLng).title("光明体育场（光体）")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.soccer));
        jingJingTang = new MarkerOptions().position(jingJingTangLatLng).title("菁菁堂")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.theater));
        nanTi = new MarkerOptions().position(nanTiLatLng).title("南区体育馆（南体）")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.soccer));
        shangYuan = new MarkerOptions().position(shangYuanLatLng).title("上院")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.book_open_page_variant));
        zhongYuan = new MarkerOptions().position(zhongYuanLatLng).title("中院")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.book_open_page_variant));
        xiaoYiYuan = new MarkerOptions().position(xiaoYiYuanLatLng).title("校医院")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.stethoscope));
        tuYaQiang = new MarkerOptions().position(tuYaQiangLatLng).title("涂鸦墙")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.drawing));
        tuYaQiang2 = new MarkerOptions().position(tuYaQiang2LatLng).title("涂鸦墙")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.drawing));
        tuYaQiang3 = new MarkerOptions().position(tuYaQiang3LatLng).title("涂鸦墙")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.drawing));
        zhiWuYuan = new MarkerOptions().position(zhiWuYuanLatLng).title("植物园")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.pine_tree));
        xueFu = new MarkerOptions().position(xueFuLatLng).title("学生服务中心（学服）")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.account_multiple));
        zhiYuanYouYong = new MarkerOptions().position(zhiYuanYouYongLatLng).title("致远游泳健身馆")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.pool));
        huoTi = new MarkerOptions().position(huoTiLatLng).title("霍英东体育中心（新体育馆）")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.soccer));
        nanMen = new MarkerOptions().position(nanMenLatLng).title("南门（凯旋门）")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.gate));
        dongMen = new MarkerOptions().position(dongMenLatLng).title("东门（庙门）")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.gate));
        dianYuan = new MarkerOptions().position(dianYuanLatLng).title("电子信息与电气工程学院")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.school));
        jiDong = new MarkerOptions().position(jiDongLatLng).title("机械与动力工程学院")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.school));
        dianCao = new MarkerOptions().position(dianCaoLatLng).title("电院大草坪")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.nature));
        ruanJianXueYuan = new MarkerOptions().position(ruanJianXueYuanLatLng).title("软件学院")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.school));
        weiDianZi = new MarkerOptions().position(weiDianZiLatLng).title("微电子学院")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.school));
        xingZhengB = new MarkerOptions().position(xingZhengBLatLng).title("行政B楼")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.domain));
        chengJiMeiShuGuan = new MarkerOptions().position(chengJiMeiShuGuanLatLng).title("程及美术馆")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.drawing));
        hanZeHu = new MarkerOptions().position(hanZeHuLatLng).title("涵泽湖")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.waves));
        zhiYuanHu = new MarkerOptions().position(zhiYuanHuLatLng).title("致远湖")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.waves));
        tongDeHu = new MarkerOptions().position(tongDeHuLatLng).title("同德湖")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.waves));

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mapReady = true;
        mMap.addMarker(xinTu);
        mMap.addMarker(baoTu);
        mMap.addMarker(tuoXieMen);
        mMap.addMarker(siYuanHu);
        mMap.addMarker(guangTi);
        mMap.addMarker(jingJingTang);
        mMap.addMarker(nanTi);
        mMap.addMarker(shangYuan);
        mMap.addMarker(zhongYuan);
        mMap.addMarker(xiaoYiYuan);
        mMap.addMarker(tuYaQiang);
        mMap.addMarker(tuYaQiang2);
        mMap.addMarker(tuYaQiang3);
        mMap.addMarker(zhiWuYuan);
        mMap.addMarker(xueFu);
        mMap.addMarker(zhiYuanYouYong);
        mMap.addMarker(huoTi);
        mMap.addMarker(nanMen);
        mMap.addMarker(dongMen);
        mMap.addMarker(dianYuan);
        mMap.addMarker(jiDong);
        mMap.addMarker(dianCao);
        mMap.addMarker(ruanJianXueYuan);
        mMap.addMarker(weiDianZi);
        mMap.addMarker(xingZhengB);
        mMap.addMarker(chengJiMeiShuGuan);
        mMap.addMarker(hanZeHu);
        mMap.addMarker(zhiYuanHu);
        mMap.addMarker(tongDeHu);
        mMap.addPolyline(new PolylineOptions().geodesic(true)
                .add(new LatLng(31.0176273461,121.4309037195))
                .add(new LatLng(31.0185615165,121.4304953814))
                .add(new LatLng(31.0189752733,121.4314341545))
                .add(new LatLng(31.0192189293,121.4316380024))
                .add(new LatLng(31.0195131546,121.4317721128))
                .add(new LatLng(31.0200786162,121.4318633080))
                .add(new LatLng(31.0216324690,121.4314877987))
                .add(new LatLng(31.0218226255,121.4325681407))
                .add(new LatLng(31.0222326255,121.4338121407))
                .add(new LatLng(31.0225306255,121.4346841407))
                .add(new LatLng(31.0225966255,121.4360811407))
                .add(new LatLng(31.0221866255,121.4374551407))
                .add(new LatLng(31.0224646255,121.4385781407))
                .add(new LatLng(31.0243413347,121.4446757421))
                .add(new LatLng(31.0251073347,121.4457447421))
                .add(new LatLng(31.0262363347,121.4461757421))
                .add(new LatLng(31.0279303347,121.4456017421))
                .add(new LatLng(31.0286113347,121.4445777421))
                .add(new LatLng(31.0288674351,121.4434437439))
                .add(new LatLng(31.0288214351,121.4427247439))
                .add(new LatLng(31.0265026255,121.4354431407))
                .add(new LatLng(31.0278836255,121.4348271407))
                .add(new LatLng(31.0284796255,121.4345671407))
                .add(new LatLng(31.0274966255,121.4314321407))
                .add(new LatLng(31.0262075721,121.4272957940))
                .add(new LatLng(31.0259565721,121.4265057940))
                .add(new LatLng(31.0244785721,121.4271387940))
                .add(new LatLng(31.0236475721,121.4273767940))
                .add(new LatLng(31.0232955721,121.4279877940))
                .add(new LatLng(31.0225105721,121.4277717940))
                .add(new LatLng(31.0221855721,121.4279427940))
                .add(new LatLng(31.0219025721,121.4280597940))
                .add(new LatLng(31.0195136255,121.4293971407))
                .add(new LatLng(31.0184166667,121.4298820154))
                .add(new LatLng(31.0185615165,121.4304953814))
                .width(10)
                .color(0xff2962ff));

        flyTo(SJTU_MinHang);
    }

    private void flyTo(CameraPosition target)
    {
        mMap.moveCamera(CameraUpdateFactory.newCameraPosition(target));
    }
}
