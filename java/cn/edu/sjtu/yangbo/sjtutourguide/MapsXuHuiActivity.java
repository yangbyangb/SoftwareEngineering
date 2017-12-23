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

public class MapsXuHuiActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    boolean mapReady = false;

    MarkerOptions dongMen;
    LatLng dongMenLatLng = new LatLng(31.1987820606, 121.4366246895);
    MarkerOptions tuShuGuan;
    LatLng tuShuGuanLatLng = new LatLng(31.1989150606, 121.4358306895);
    MarkerOptions qianTu;
    LatLng qianTuLatLng = new LatLng(31.2011460606, 121.4356646895);
    MarkerOptions xinShangYuan;
    LatLng xinShangYuanLatLng = new LatLng(31.1997204210, 121.4343148470);
    MarkerOptions zhongYuan;
    LatLng zhongYuanLatLng = new LatLng(31.1997204210, 121.4351356030);
    MarkerOptions tiYuGuan;
    LatLng tiYuGuanLatLng = new LatLng(31.1989449537, 121.4336925745);
    MarkerOptions haoRanKeJiDaSha;
    LatLng haoRanKeJiDaShaLatLng = new LatLng(31.1980593531, 121.4349210262);
    MarkerOptions baiNianXiaoQing;
    LatLng baiNianXiaoQingLatLng = new LatLng(31.1990585565, 121.4347658028);
    MarkerOptions baoZhaoLong;
    LatLng baoZhaoLongLatLng = new LatLng(31.1998385565, 121.4332098028);
    MarkerOptions liaoKaiYuan;
    LatLng liaoKaiYuanLatLng = new LatLng(31.1994205565, 121.4324858028);
    MarkerOptions yinShuiSiYuan;
    LatLng yinShuiSiYuanLatLng = new LatLng(31.1997835565, 121.4317828028);
    MarkerOptions zhiXinXiZhai;
    LatLng zhiXinXiZhaiLatLng = new LatLng(31.2001045565, 121.4318898028);
    MarkerOptions dianYuan;
    LatLng dianYuanLatLng = new LatLng(31.2010275565, 121.4331448028);
    MarkerOptions lieShiMu;
    LatLng lieShiMuLatLng = new LatLng(31.1984435565, 121.4342768028);
    MarkerOptions caiLiao;
    LatLng caiLiaoLatLng = new LatLng(31.1977595565, 121.4343418028);
    MarkerOptions nanYangDaLou;
    LatLng nanYangDaLouLatLng = new LatLng(31.1988695565, 121.4294548028);
    MarkerOptions renWen;
    LatLng renWenLatLng = new LatLng(31.1979745565, 121.4317348028);
    MarkerOptions shiTang;
    LatLng shiTangLatLng = new LatLng(31.1991445565, 121.4317888028);
    MarkerOptions gongChengGuan;
    LatLng gongChengGuanLatLng = new LatLng(31.2006535565, 121.4338318028);
//    MarkerOptions ;
//    LatLng LatLng = new LatLng();

    static final CameraPosition SJTU_XuHui = CameraPosition.builder()
            .target(new LatLng(31.1992845082, 121.4348244667))
            .zoom(17)
            .bearing(0)
            .tilt(30)
            .build();

    @Override
    public Resources getResources() {
        return super.getResources();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_min_hang);

        qianTu = new MarkerOptions().position(qianTuLatLng).title("钱学森图书馆")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.library));
        tuShuGuan = new MarkerOptions().position(tuShuGuanLatLng).title("老图书馆（今校史馆）")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.library));
        dongMen = new MarkerOptions().position(dongMenLatLng).title("东门")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.gate));
        xinShangYuan = new MarkerOptions().position(xinShangYuanLatLng).title("新上院")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.book_open_page_variant));
        zhongYuan = new MarkerOptions().position(zhongYuanLatLng).title("中院")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.book_open_page_variant));
        tiYuGuan = new MarkerOptions().position(tiYuGuanLatLng).title("体育馆")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.soccer));
        haoRanKeJiDaSha = new MarkerOptions().position(haoRanKeJiDaShaLatLng).title("浩然科技大厦")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.domain));
        baiNianXiaoQing = new MarkerOptions().position(baiNianXiaoQingLatLng).title("百年校庆里程碑")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.pillar));
        baoZhaoLong = new MarkerOptions().position(baoZhaoLongLatLng).title("包兆龙图书馆")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.library));
        liaoKaiYuan = new MarkerOptions().position(liaoKaiYuanLatLng).title("廖凯原法学院")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.school));
        yinShuiSiYuan = new MarkerOptions().position(yinShuiSiYuanLatLng).title("饮水思源")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.monument));
        zhiXinXiZhai = new MarkerOptions().position(zhiXinXiZhaiLatLng).title("执信西斋")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.home_variant));
        dianYuan = new MarkerOptions().position(dianYuanLatLng).title("电子信息与电气工程学院")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.school));
        lieShiMu = new MarkerOptions().position(lieShiMuLatLng).title("史霄雯穆汉祥二烈士之墓")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.mountain));
        caiLiao = new MarkerOptions().position(caiLiaoLatLng).title("材料学院")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.school));
        nanYangDaLou = new MarkerOptions().position(nanYangDaLouLatLng).title("南洋大楼")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.domain));
        renWen = new MarkerOptions().position(renWenLatLng).title("人文学院")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.school));
        shiTang = new MarkerOptions().position(shiTangLatLng).title("食堂")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.food_fork_drink));
        gongChengGuan = new MarkerOptions().position(gongChengGuanLatLng).title("工程馆")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.robot));
//                = new MarkerOptions().position().title("")
//                .icon(BitmapDescriptorFactory.fromResource(R.drawable.));

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mapReady = true;
        mMap.addMarker(qianTu);
        mMap.addMarker(tuShuGuan);
        mMap.addMarker(dongMen);
        mMap.addMarker(xinShangYuan);
        mMap.addMarker(zhongYuan);
        mMap.addMarker(tiYuGuan);
        mMap.addMarker(haoRanKeJiDaSha);
        mMap.addMarker(baiNianXiaoQing);
        mMap.addMarker(baoZhaoLong);
        mMap.addMarker(liaoKaiYuan);
        mMap.addMarker(yinShuiSiYuan);
        mMap.addMarker(zhiXinXiZhai);
        mMap.addMarker(dianYuan);
        mMap.addMarker(lieShiMu);
        mMap.addMarker(caiLiao);
        mMap.addMarker(nanYangDaLou);
        mMap.addMarker(renWen);
        mMap.addMarker(shiTang);
//        mMap.addMarker();
        mMap.addPolyline(new PolylineOptions().geodesic(true)
                .add(dongMenLatLng)
                .add(new LatLng(31.1986680606, 121.4360406895))
                .add(new LatLng(31.1986400606, 121.4357126895))
                .add(new LatLng(31.1986170606, 121.4352736895))
                .add(new LatLng(31.1977040606, 121.4352996895))
                .add(new LatLng(31.1976765565, 121.4346668028))
                .add(new LatLng(31.1976085565, 121.4335348028))
                .add(new LatLng(31.1976125565, 121.4334168028))
                .add(new LatLng(31.1976215565, 121.4330088028))
                .add(new LatLng(31.1974335565, 121.4326758028))
                .add(new LatLng(31.1974385565, 121.4324178028))
                .add(new LatLng(31.1976815565, 121.4320208028))
                .add(new LatLng(31.1978835565, 121.4319298028))
                .add(new LatLng(31.1978695565, 121.4316188028))
                .add(new LatLng(31.1977725565, 121.4314768028))
                .add(new LatLng(31.1976125565, 121.4314118028))
                .add(new LatLng(31.1975255565, 121.4313268028))
                .add(new LatLng(31.1974975565, 121.4304898028))
                .add(new LatLng(31.1979235565, 121.4306638028))
                .add(new LatLng(31.1994835565, 121.4312028028))
                .add(new LatLng(31.1994935565, 121.4320558028))
                .add(new LatLng(31.1995255565, 121.4323618028))
                .add(new LatLng(31.2000765565, 121.4323558028))
                .add(new LatLng(31.2001085565, 121.4326938028))
                .add(new LatLng(31.2000995565, 121.4338368028))
                .add(new LatLng(31.1995485565, 121.4338688028))
                .add(new LatLng(31.1995990606, 121.4356016895))
                .add(new LatLng(31.2000030606, 121.4355486895))
                .add(new LatLng(31.2009110606, 121.4355106895))
                .add(new LatLng(31.2009060606, 121.4351436895))
                .add(new LatLng(31.2014660606, 121.4351036895))
//                .add(new LatLng())
                .width(10)
                .color(0xff2962ff));

        flyTo(SJTU_XuHui);
    }

    private void flyTo(CameraPosition target) {
        mMap.moveCamera(CameraUpdateFactory.newCameraPosition(target));
    }
}
