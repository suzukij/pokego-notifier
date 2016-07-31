package pokego;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class PokeVisionResponse {

    private String status;

    @JsonProperty("pokemon")
    private List<Pokemon> pokemons = new ArrayList<>();

    @Data
    public static class Pokemon {
        /** ID **/
        private String id;

        /** ポケモンID **/
        private String pokemonId;

        /** 緯度 **/
        private double latitude;

        /** 経度 **/
        private double longitude;

        /** 有効期限 **/
        @JsonProperty("expiration_time")
        private long expirationTime;


        public String getName() {
            return nameMap.get(pokemonId);
        }

        public LocalDateTime getExpiration() {
            return LocalDateTime.ofInstant(Instant.ofEpochSecond(expirationTime), ZoneId.systemDefault());
        }

        public String getIconUrl(){
            return "https://ugc.pokevision.com/images/pokemons/" + pokemonId + ".png";
        }

        public String getPokevisionUrl(){
            return "https://pokevision.com/#/@" + latitude + "," + longitude;
        }

        /** ポケモン名マップ **/
        private static Map<String, String> nameMap = new HashMap<>();
        static {
            nameMap.put("1", "フシギダネ");
            nameMap.put("2", "フシギソウ");
            nameMap.put("3", "フシギバナ");
            nameMap.put("4", "ヒトカゲ");
            nameMap.put("5", "リザード");
            nameMap.put("6", "リザードン");
            nameMap.put("7", "ゼニガメ");
            nameMap.put("8", "カメール");
            nameMap.put("9", "カメックス");
            nameMap.put("10", "キャタピー");
            nameMap.put("11", "トランセル");
            nameMap.put("12", "バタフリー");
            nameMap.put("13", "ビードル");
            nameMap.put("14", "コクーン");
            nameMap.put("15", "スピアー");
            nameMap.put("16", "ポッポ");
            nameMap.put("17", "ピジョン");
            nameMap.put("18", "ピジョット");
            nameMap.put("19", "コラッタ");
            nameMap.put("20", "ラッタ");
            nameMap.put("21", "オニスズメ");
            nameMap.put("22", "オニドリル");
            nameMap.put("23", "アーボ");
            nameMap.put("24", "アーボック");
            nameMap.put("25", "ピカチュウ");
            nameMap.put("26", "ライチュウ");
            nameMap.put("27", "サンド");
            nameMap.put("28", "サンドパン");
            nameMap.put("29", "ニドラン♀");
            nameMap.put("30", "ニドリーナ");
            nameMap.put("31", "ニドクイン");
            nameMap.put("32", "ニドラン♂");
            nameMap.put("33", "ニドリーノ");
            nameMap.put("34", "ニドキング");
            nameMap.put("35", "ピッピ");
            nameMap.put("36", "ピクシー");
            nameMap.put("37", "ロコン");
            nameMap.put("38", "キュウコン");
            nameMap.put("39", "プリン");
            nameMap.put("40", "プクリン");
            nameMap.put("41", "ズバット");
            nameMap.put("42", "ゴルバット");
            nameMap.put("43", "ナゾノクサ");
            nameMap.put("44", "クサイハナ");
            nameMap.put("45", "ラフレシア");
            nameMap.put("46", "パラス");
            nameMap.put("47", "パラセクト");
            nameMap.put("48", "コンパン");
            nameMap.put("49", "モルフォン");
            nameMap.put("50", "ディグダ");
            nameMap.put("51", "ダグトリオ");
            nameMap.put("52", "ニャース");
            nameMap.put("53", "ペルシアン");
            nameMap.put("54", "コダック");
            nameMap.put("55", "ゴルダック");
            nameMap.put("56", "マンキー");
            nameMap.put("57", "オコリザル");
            nameMap.put("58", "ガーディ");
            nameMap.put("59", "ウインディ");
            nameMap.put("60", "ニョロモ");
            nameMap.put("61", "ニョロゾ");
            nameMap.put("62", "ニョロボン");
            nameMap.put("63", "ケーシィ");
            nameMap.put("64", "ユンゲラー");
            nameMap.put("65", "フーディン");
            nameMap.put("66", "ワンリキー");
            nameMap.put("67", "ゴーリキー");
            nameMap.put("68", "カイリキー");
            nameMap.put("69", "マダツボミ");
            nameMap.put("70", "ウツドン");
            nameMap.put("71", "ウツボット");
            nameMap.put("72", "メノクラゲ");
            nameMap.put("73", "ドククラゲ");
            nameMap.put("74", "イシツブテ");
            nameMap.put("75", "ゴローン");
            nameMap.put("76", "ゴローニャ");
            nameMap.put("77", "ポニータ");
            nameMap.put("78", "ギャロップ");
            nameMap.put("79", "ヤドン");
            nameMap.put("80", "ヤドラン");
            nameMap.put("81", "コイル");
            nameMap.put("82", "レアコイル");
            nameMap.put("83", "カモネギ");
            nameMap.put("84", "ドードー");
            nameMap.put("85", "ドードリオ");
            nameMap.put("86", "パウワウ");
            nameMap.put("87", "ジュゴン");
            nameMap.put("88", "ベトベター");
            nameMap.put("89", "ベトベトン");
            nameMap.put("90", "シェルダー");
            nameMap.put("91", "パルシェン");
            nameMap.put("92", "ゴース");
            nameMap.put("93", "ゴースト");
            nameMap.put("94", "ゲンガー");
            nameMap.put("95", "イワーク");
            nameMap.put("96", "スリープ");
            nameMap.put("97", "スリーパー");
            nameMap.put("98", "クラブ");
            nameMap.put("99", "キングラー");
            nameMap.put("100", "ビリリダマ");
            nameMap.put("101", "マルマイン");
            nameMap.put("102", "タマタマ");
            nameMap.put("103", "ナッシー");
            nameMap.put("104", "カラカラ");
            nameMap.put("105", "ガラガラ");
            nameMap.put("106", "サワムラー");
            nameMap.put("107", "エビワラー");
            nameMap.put("108", "ベロリンガ");
            nameMap.put("109", "ドガース");
            nameMap.put("110", "マタドガス");
            nameMap.put("111", "サイホーン");
            nameMap.put("112", "サイドン");
            nameMap.put("113", "ラッキー");
            nameMap.put("114", "モンジャラ");
            nameMap.put("115", "ガルーラ");
            nameMap.put("116", "タッツー");
            nameMap.put("117", "シードラ");
            nameMap.put("118", "トサキント");
            nameMap.put("119", "アズマオウ");
            nameMap.put("120", "ヒトデマン");
            nameMap.put("121", "スターミー");
            nameMap.put("122", "バリヤード");
            nameMap.put("123", "ストライク");
            nameMap.put("124", "ルージュラ");
            nameMap.put("125", "エレブー");
            nameMap.put("126", "ブーバー");
            nameMap.put("127", "カイロス");
            nameMap.put("128", "ケンタロス");
            nameMap.put("129", "コイキング");
            nameMap.put("130", "ギャラドス");
            nameMap.put("131", "ラプラス");
            nameMap.put("132", "メタモン");
            nameMap.put("133", "イーブイ");
            nameMap.put("134", "シャワーズ");
            nameMap.put("135", "サンダース");
            nameMap.put("136", "ブースター");
            nameMap.put("137", "ポリゴン");
            nameMap.put("138", "オムナイト");
            nameMap.put("139", "オムスター");
            nameMap.put("140", "カブト");
            nameMap.put("141", "カブトプス");
            nameMap.put("142", "プテラ");
            nameMap.put("143", "カビゴン");
            nameMap.put("144", "フリーザー");
            nameMap.put("145", "サンダー");
            nameMap.put("146", "ファイヤー");
            nameMap.put("147", "ミニリュウ");
            nameMap.put("148", "ハクリュー");
            nameMap.put("149", "カイリュー");
            nameMap.put("150", "ミュウツー");
            nameMap.put("151", "ミュウ");
            nameMap.put("152", "チコリータ");
            nameMap.put("153", "ベイリーフ");
            nameMap.put("154", "メガニウム");
            nameMap.put("155", "ヒノアラシ");
            nameMap.put("156", "マグマラシ");
            nameMap.put("157", "バクフーン");
            nameMap.put("158", "ワニノコ");
            nameMap.put("159", "アリゲイツ");
            nameMap.put("160", "オーダイル");
            nameMap.put("161", "オタチ");
            nameMap.put("162", "オオタチ");
            nameMap.put("163", "ホーホー");
            nameMap.put("164", "ヨルノズク");
            nameMap.put("165", "レディバ");
            nameMap.put("166", "レディアン");
            nameMap.put("167", "イトマル");
            nameMap.put("168", "アリアドス");
            nameMap.put("169", "クロバット");
            nameMap.put("170", "チョンチー");
            nameMap.put("171", "ランターン");
            nameMap.put("172", "ピチュー");
            nameMap.put("173", "ピィ");
            nameMap.put("174", "ププリン");
            nameMap.put("175", "トゲピー");
            nameMap.put("176", "トゲチック");
            nameMap.put("177", "ネイティ");
            nameMap.put("178", "ネイティオ");
            nameMap.put("179", "メリープ");
            nameMap.put("180", "モココ");
            nameMap.put("181", "デンリュウ");
            nameMap.put("182", "キレイハナ");
            nameMap.put("183", "マリル");
            nameMap.put("184", "マリルリ");
            nameMap.put("185", "ウソッキー");
            nameMap.put("186", "ニョロトノ");
            nameMap.put("187", "ハネッコ");
            nameMap.put("188", "ポポッコ");
            nameMap.put("189", "ワタッコ");
            nameMap.put("190", "エイパム");
            nameMap.put("191", "ヒマナッツ");
            nameMap.put("192", "キマワリ");
            nameMap.put("193", "ヤンヤンマ");
            nameMap.put("194", "ウパー");
            nameMap.put("195", "ヌオー");
            nameMap.put("196", "エーフィ");
            nameMap.put("197", "ブラッキー");
            nameMap.put("198", "ヤミカラス");
            nameMap.put("199", "ヤドキング");
            nameMap.put("200", "ムウマ");
            nameMap.put("201", "アンノーン");
            nameMap.put("202", "ソーナンス");
            nameMap.put("203", "キリンリキ");
            nameMap.put("204", "クヌギダマ");
            nameMap.put("205", "フォレトス");
            nameMap.put("206", "ノコッチ");
            nameMap.put("207", "グライガー");
            nameMap.put("208", "ハガネール");
            nameMap.put("209", "ブルー");
            nameMap.put("210", "グランブル");
            nameMap.put("211", "ハリーセン");
            nameMap.put("212", "ハッサム");
            nameMap.put("213", "ツボツボ");
            nameMap.put("214", "ヘラクロス");
            nameMap.put("215", "ニューラ");
            nameMap.put("216", "ヒメグマ");
            nameMap.put("217", "リングマ");
            nameMap.put("218", "マグマッグ");
            nameMap.put("219", "マグカルゴ");
            nameMap.put("220", "ウリムー");
            nameMap.put("221", "イノムー");
            nameMap.put("222", "サニーゴ");
            nameMap.put("223", "テッポウオ");
            nameMap.put("224", "オクタン");
            nameMap.put("225", "デリバード");
            nameMap.put("226", "マンタイン");
            nameMap.put("227", "エアームド");
            nameMap.put("228", "デルビル");
            nameMap.put("229", "ヘルガー");
            nameMap.put("230", "キングドラ");
            nameMap.put("231", "ゴマゾウ");
            nameMap.put("232", "ドンファン");
            nameMap.put("233", "ポリゴン2");
            nameMap.put("234", "オドシシ");
            nameMap.put("235", "ドーブル");
            nameMap.put("236", "バルキー");
            nameMap.put("237", "カポエラー");
            nameMap.put("238", "ムチュール");
            nameMap.put("239", "エレキッド");
            nameMap.put("240", "ブビィ");
            nameMap.put("241", "ミルタンク");
            nameMap.put("242", "ハピナス");
            nameMap.put("243", "ライコウ");
            nameMap.put("244", "エンテイ");
            nameMap.put("245", "スイクン");
            nameMap.put("246", "ヨーギラス");
            nameMap.put("247", "サナギラス");
            nameMap.put("248", "バンギラス");
            nameMap.put("249", "ルギア");
            nameMap.put("250", "ホウオウ");
            nameMap.put("251", "セレビィ");
            nameMap.put("252", "キモリ");
            nameMap.put("253", "ジュプトル");
            nameMap.put("254", "ジュカイン");
            nameMap.put("255", "アチャモ");
            nameMap.put("256", "ワカシャモ");
            nameMap.put("257", "バシャーモ");
            nameMap.put("258", "ミズゴロウ");
            nameMap.put("259", "ヌマクロー");
            nameMap.put("260", "ラグラージ");
            nameMap.put("261", "ポチエナ");
            nameMap.put("262", "グラエナ");
            nameMap.put("263", "ジグザグマ");
            nameMap.put("264", "マッスグマ");
            nameMap.put("265", "ケムッソ");
            nameMap.put("266", "カラサリス");
            nameMap.put("267", "アゲハント");
            nameMap.put("268", "マユルド");
            nameMap.put("269", "ドクケイル");
            nameMap.put("270", "ハスボー");
            nameMap.put("271", "ハスブレロ");
            nameMap.put("272", "ルンパッパ");
            nameMap.put("273", "タネボー");
            nameMap.put("274", "コノハナ");
            nameMap.put("275", "ダーテング");
            nameMap.put("276", "スバメ");
            nameMap.put("277", "オオスバメ");
            nameMap.put("278", "キャモメ");
            nameMap.put("279", "ペリッパー");
            nameMap.put("280", "ラルトス");
            nameMap.put("281", "キルリア");
            nameMap.put("282", "サーナイト");
            nameMap.put("283", "アメタマ");
            nameMap.put("284", "アメモース");
            nameMap.put("285", "キノココ");
            nameMap.put("286", "キノガッサ");
            nameMap.put("287", "ナマケロ");
            nameMap.put("288", "ヤルキモノ");
            nameMap.put("289", "ケッキング");
            nameMap.put("290", "ツチニン");
            nameMap.put("291", "テッカニン");
            nameMap.put("292", "ヌケニン");
            nameMap.put("293", "ゴニョニョ");
            nameMap.put("294", "ドゴーム");
            nameMap.put("295", "バクオング");
            nameMap.put("296", "マクノシタ");
            nameMap.put("297", "ハリテヤマ");
            nameMap.put("298", "ルリリ");
            nameMap.put("299", "ノズパス");
            nameMap.put("300", "エネコ");
            nameMap.put("301", "エネコロロ");
            nameMap.put("302", "ヤミラミ");
            nameMap.put("303", "クチート");
            nameMap.put("304", "ココドラ");
            nameMap.put("305", "コドラ");
            nameMap.put("306", "ボスゴドラ");
            nameMap.put("307", "アサナン");
            nameMap.put("308", "チャーレム");
            nameMap.put("309", "ラクライ");
            nameMap.put("310", "ライボルト");
            nameMap.put("311", "プラスル");
            nameMap.put("312", "マイナン");
            nameMap.put("313", "バルビート");
            nameMap.put("314", "イルミーゼ");
            nameMap.put("315", "ロゼリア");
            nameMap.put("316", "ゴクリン");
            nameMap.put("317", "マルノーム");
            nameMap.put("318", "キバニア");
            nameMap.put("319", "サメハダー");
            nameMap.put("320", "ホエルコ");
            nameMap.put("321", "ホエルオー");
            nameMap.put("322", "ドンメル");
            nameMap.put("323", "バクーダ");
            nameMap.put("324", "コータス");
            nameMap.put("325", "バネブー");
            nameMap.put("326", "ブーピッグ");
            nameMap.put("327", "パッチール");
            nameMap.put("328", "ナックラー");
            nameMap.put("329", "ビブラーバ");
            nameMap.put("330", "フライゴン");
            nameMap.put("331", "サボネア");
            nameMap.put("332", "ノクタス");
            nameMap.put("333", "チルット");
            nameMap.put("334", "チルタリス");
            nameMap.put("335", "ザングース");
            nameMap.put("336", "ハブネーク");
            nameMap.put("337", "ルナトーン");
            nameMap.put("338", "ソルロック");
            nameMap.put("339", "ドジョッチ");
            nameMap.put("340", "ナマズン");
            nameMap.put("341", "ヘイガニ");
            nameMap.put("342", "シザリガー");
            nameMap.put("343", "ヤジロン");
            nameMap.put("344", "ネンドール");
            nameMap.put("345", "リリーラ");
            nameMap.put("346", "ユレイドル");
            nameMap.put("347", "アノプス");
            nameMap.put("348", "アーマルド");
            nameMap.put("349", "ヒンバス");
            nameMap.put("350", "ミロカロス");
            nameMap.put("351", "ポワルン");
            nameMap.put("352", "カクレオン");
            nameMap.put("353", "カゲボウズ");
            nameMap.put("354", "ジュペッタ");
            nameMap.put("355", "ヨマワル");
            nameMap.put("356", "サマヨール");
            nameMap.put("357", "トロピウス");
            nameMap.put("358", "チリーン");
            nameMap.put("359", "アブソル");
            nameMap.put("360", "ソーナノ");
            nameMap.put("361", "ユキワラシ");
            nameMap.put("362", "オニゴーリ");
            nameMap.put("363", "タマザラシ");
            nameMap.put("364", "トドグラー");
            nameMap.put("365", "トドゼルガ");
            nameMap.put("366", "パールル");
            nameMap.put("367", "ハンテール");
            nameMap.put("368", "サクラビス");
            nameMap.put("369", "ジーランス");
            nameMap.put("370", "ラブカス");
            nameMap.put("371", "タツベイ");
            nameMap.put("372", "コモルー");
            nameMap.put("373", "ボーマンダ");
            nameMap.put("374", "ダンバル");
            nameMap.put("375", "メタング");
            nameMap.put("376", "メタグロス");
            nameMap.put("377", "レジロック");
            nameMap.put("378", "レジアイス");
            nameMap.put("379", "レジスチル");
            nameMap.put("380", "ラティアス");
            nameMap.put("381", "ラティオス");
            nameMap.put("382", "カイオーガ");
            nameMap.put("383", "グラードン");
            nameMap.put("384", "レックウザ");
            nameMap.put("385", "ジラーチ");
            nameMap.put("386", "デオキシス");
            nameMap.put("387", "ナエトル");
            nameMap.put("388", "ハヤシガメ");
            nameMap.put("389", "ドダイトス");
            nameMap.put("390", "ヒコザル");
            nameMap.put("391", "モウカザル");
            nameMap.put("392", "ゴウカザル");
            nameMap.put("393", "ポッチャマ");
            nameMap.put("394", "ポッタイシ");
            nameMap.put("395", "エンペルト");
            nameMap.put("396", "ムックル");
            nameMap.put("397", "ムクバード");
            nameMap.put("398", "ムクホーク");
            nameMap.put("399", "ビッパ");
            nameMap.put("400", "ビーダル");
            nameMap.put("401", "コロボーシ");
            nameMap.put("402", "コロトック");
            nameMap.put("403", "コリンク");
            nameMap.put("404", "ルクシオ");
            nameMap.put("405", "レントラー");
            nameMap.put("406", "スボミー");
            nameMap.put("407", "ロズレイド");
            nameMap.put("408", "ズガイドス");
            nameMap.put("409", "ラムパルド");
            nameMap.put("410", "タテトプス");
            nameMap.put("411", "トリデプス");
            nameMap.put("412", "ミノムッチ");
            nameMap.put("413", "ミノマダム");
            nameMap.put("414", "ガーメイル");
            nameMap.put("415", "ミツハニー");
            nameMap.put("416", "ビークイン");
            nameMap.put("417", "パチリス");
            nameMap.put("418", "ブイゼル");
            nameMap.put("419", "フローゼル");
            nameMap.put("420", "チェリンボ");
            nameMap.put("421", "チェリム");
            nameMap.put("422", "カラナクシ");
            nameMap.put("423", "トリトドン");
            nameMap.put("424", "エテボース");
            nameMap.put("425", "フワンテ");
            nameMap.put("426", "フワライド");
            nameMap.put("427", "ミミロル");
            nameMap.put("428", "ミミロップ");
            nameMap.put("429", "ムウマージ");
            nameMap.put("430", "ドンカラス");
            nameMap.put("431", "ニャルマー");
            nameMap.put("432", "ブニャット");
            nameMap.put("433", "リーシャン");
            nameMap.put("434", "スカンプー");
            nameMap.put("435", "スカタンク");
            nameMap.put("436", "ドーミラー");
            nameMap.put("437", "ドータクン");
            nameMap.put("438", "ウソハチ");
            nameMap.put("439", "マネネ");
            nameMap.put("440", "ピンプク");
            nameMap.put("441", "ペラップ");
            nameMap.put("442", "ミカルゲ");
            nameMap.put("443", "フカマル");
            nameMap.put("444", "ガバイト");
            nameMap.put("445", "ガブリアス");
            nameMap.put("446", "ゴンベ");
            nameMap.put("447", "リオル");
            nameMap.put("448", "ルカリオ");
            nameMap.put("449", "ヒポポタス");
            nameMap.put("450", "カバルドン");
            nameMap.put("451", "スコルピ");
            nameMap.put("452", "ドラピオン");
            nameMap.put("453", "グレッグル");
            nameMap.put("454", "ドクロッグ");
            nameMap.put("455", "マスキッパ");
            nameMap.put("456", "ケイコウオ");
            nameMap.put("457", "ネオラント");
            nameMap.put("458", "タマンタ");
            nameMap.put("459", "ユキカブリ");
            nameMap.put("460", "ユキノオー");
            nameMap.put("461", "マニューラ");
            nameMap.put("462", "ジバコイル");
            nameMap.put("463", "ベロベルト");
            nameMap.put("464", "ドサイドン");
            nameMap.put("465", "モジャンボ");
            nameMap.put("466", "エレキブル");
            nameMap.put("467", "ブーバーン");
            nameMap.put("468", "トゲキッス");
            nameMap.put("469", "メガヤンマ");
            nameMap.put("470", "リーフィア");
            nameMap.put("471", "グレイシア");
            nameMap.put("472", "グライオン");
            nameMap.put("473", "マンムー");
            nameMap.put("474", "ポリゴンZ");
            nameMap.put("475", "エルレイド");
            nameMap.put("476", "ダイノーズ");
            nameMap.put("477", "ヨノワール");
            nameMap.put("478", "ユキメノコ");
            nameMap.put("479", "ロトム");
            nameMap.put("480", "ユクシー");
            nameMap.put("481", "エムリット");
            nameMap.put("482", "アグノム");
            nameMap.put("483", "ディアルガ");
            nameMap.put("484", "パルキア");
            nameMap.put("485", "ヒードラン");
            nameMap.put("486", "レジギガス");
            nameMap.put("487", "ギラティナ");
            nameMap.put("488", "クレセリア");
            nameMap.put("489", "フィオネ");
            nameMap.put("490", "マナフィ");
            nameMap.put("491", "ダークライ");
            nameMap.put("492", "シェイミ");
            nameMap.put("493", "アルセウス");
            nameMap.put("494", "ビクティニ");
            nameMap.put("495", "ツタージャ");
            nameMap.put("496", "ジャノビー");
            nameMap.put("497", "ジャローダ");
            nameMap.put("498", "ポカブ");
            nameMap.put("499", "チャオブー");
            nameMap.put("500", "エンブオー");
            nameMap.put("501", "ミジュマル");
            nameMap.put("502", "フタチマル");
            nameMap.put("503", "ダイケンキ");
            nameMap.put("504", "ミネズミ");
            nameMap.put("505", "ミルホッグ");
            nameMap.put("506", "ヨーテリー");
            nameMap.put("507", "ハーデリア");
            nameMap.put("508", "ムーランド");
            nameMap.put("509", "チョロネコ");
            nameMap.put("510", "レパルダス");
            nameMap.put("511", "ヤナップ");
            nameMap.put("512", "ヤナッキー");
            nameMap.put("513", "バオップ");
            nameMap.put("514", "バオッキー");
            nameMap.put("515", "ヒヤップ");
            nameMap.put("516", "ヒヤッキー");
            nameMap.put("517", "ムンナ");
            nameMap.put("518", "ムシャーナ");
            nameMap.put("519", "マメパト");
            nameMap.put("520", "ハトーボー");
            nameMap.put("521", "ケンホロウ");
            nameMap.put("522", "シママ");
            nameMap.put("523", "ゼブライカ");
            nameMap.put("524", "ダンゴロ");
            nameMap.put("525", "ガントル");
            nameMap.put("526", "ギガイアス");
            nameMap.put("527", "コロモリ");
            nameMap.put("528", "ココロモリ");
            nameMap.put("529", "モグリュー");
            nameMap.put("530", "ドリュウズ");
            nameMap.put("531", "タブンネ");
            nameMap.put("532", "ドッコラー");
            nameMap.put("533", "ドテッコツ");
            nameMap.put("534", "ローブシン");
            nameMap.put("535", "オタマロ");
            nameMap.put("536", "ガマガル");
            nameMap.put("537", "ガマゲロゲ");
            nameMap.put("538", "ナゲキ");
            nameMap.put("539", "ダゲキ");
            nameMap.put("540", "クルミル");
            nameMap.put("541", "クルマユ");
            nameMap.put("542", "ハハコモリ");
            nameMap.put("543", "フシデ");
            nameMap.put("544", "ホイーガ");
            nameMap.put("545", "ペンドラー");
            nameMap.put("546", "モンメン");
            nameMap.put("547", "エルフーン");
            nameMap.put("548", "チュリネ");
            nameMap.put("549", "ドレディア");
            nameMap.put("550", "バスラオ");
            nameMap.put("551", "メグロコ");
            nameMap.put("552", "ワルビル");
            nameMap.put("553", "ワルビアル");
            nameMap.put("554", "ダルマッカ");
            nameMap.put("555", "ヒヒダルマ");
            nameMap.put("556", "マラカッチ");
            nameMap.put("557", "イシズマイ");
            nameMap.put("558", "イワパレス");
            nameMap.put("559", "ズルッグ");
            nameMap.put("560", "ズルズキン");
            nameMap.put("561", "シンボラー");
            nameMap.put("562", "デスマス");
            nameMap.put("563", "デスカーン");
            nameMap.put("564", "プロトーガ");
            nameMap.put("565", "アバゴーラ");
            nameMap.put("566", "アーケン");
            nameMap.put("567", "アーケオス");
            nameMap.put("568", "ヤブクロン");
            nameMap.put("569", "ダストダス");
            nameMap.put("570", "ゾロア");
            nameMap.put("571", "ゾロアーク");
            nameMap.put("572", "チラーミィ");
            nameMap.put("573", "チラチーノ");
            nameMap.put("574", "ゴチム");
            nameMap.put("575", "ゴチミル");
            nameMap.put("576", "ゴチルゼル");
            nameMap.put("577", "ユニラン");
            nameMap.put("578", "ダブラン");
            nameMap.put("579", "ランクルス");
            nameMap.put("580", "コアルヒー");
            nameMap.put("581", "スワンナ");
            nameMap.put("582", "バニプッチ");
            nameMap.put("583", "バニリッチ");
            nameMap.put("584", "バイバニラ");
            nameMap.put("585", "シキジカ");
            nameMap.put("586", "メブキジカ");
            nameMap.put("587", "エモンガ");
            nameMap.put("588", "カブルモ");
            nameMap.put("589", "シュバルゴ");
            nameMap.put("590", "タマゲタケ");
            nameMap.put("591", "モロバレル");
            nameMap.put("592", "プルリル");
            nameMap.put("593", "ブルンゲル");
            nameMap.put("594", "ママンボウ");
            nameMap.put("595", "バチュル");
            nameMap.put("596", "デンチュラ");
            nameMap.put("597", "テッシード");
            nameMap.put("598", "ナットレイ");
            nameMap.put("599", "ギアル");
            nameMap.put("600", "ギギアル");
            nameMap.put("601", "ギギギアル");
            nameMap.put("602", "シビシラス");
            nameMap.put("603", "シビビール");
            nameMap.put("604", "シビルドン");
            nameMap.put("605", "リグレー");
            nameMap.put("606", "オーベム");
            nameMap.put("607", "ヒトモシ");
            nameMap.put("608", "ランプラー");
            nameMap.put("609", "シャンデラ");
            nameMap.put("610", "キバゴ");
            nameMap.put("611", "オノンド");
            nameMap.put("612", "オノノクス");
            nameMap.put("613", "クマシュン");
            nameMap.put("614", "ツンベアー");
            nameMap.put("615", "フリージオ");
            nameMap.put("616", "チョボマキ");
            nameMap.put("617", "アギルダー");
            nameMap.put("618", "マッギョ");
            nameMap.put("619", "コジョフー");
            nameMap.put("620", "コジョンド");
            nameMap.put("621", "クリムガン");
            nameMap.put("622", "ゴビット");
            nameMap.put("623", "ゴルーグ");
            nameMap.put("624", "コマタナ");
            nameMap.put("625", "キリキザン");
            nameMap.put("626", "バッフロン");
            nameMap.put("627", "ワシボン");
            nameMap.put("628", "ウォーグル");
            nameMap.put("629", "バルチャイ");
            nameMap.put("630", "バルジーナ");
            nameMap.put("631", "クイタラン");
            nameMap.put("632", "アイアント");
            nameMap.put("633", "モノズ");
            nameMap.put("634", "ジヘッド");
            nameMap.put("635", "サザンドラ");
            nameMap.put("636", "メラルバ");
            nameMap.put("637", "ウルガモス");
            nameMap.put("638", "コバルオン");
            nameMap.put("639", "テラキオン");
            nameMap.put("640", "ビリジオン");
            nameMap.put("641", "トルネロス");
            nameMap.put("642", "ボルトロス");
            nameMap.put("643", "レシラム");
            nameMap.put("644", "ゼクロム");
            nameMap.put("645", "ランドロス");
            nameMap.put("646", "キュレム");
            nameMap.put("647", "ケルディオ");
            nameMap.put("648", "メロエッタ");
            nameMap.put("649", "ゲノセクト");
            nameMap.put("650", "ハリマロン");
            nameMap.put("651", "ハリボーグ");
            nameMap.put("652", "ブリガロン");
            nameMap.put("653", "フォッコ");
            nameMap.put("654", "テールナー");
            nameMap.put("655", "マフォクシー");
            nameMap.put("656", "ケロマツ");
            nameMap.put("657", "ゲコガシラ");
            nameMap.put("658", "ゲッコウガ");
            nameMap.put("659", "ホルビー");
            nameMap.put("660", "ホルード");
            nameMap.put("661", "ヤヤコマ");
            nameMap.put("662", "ヒノヤコマ");
            nameMap.put("663", "ファイアロー");
            nameMap.put("664", "コフキムシ");
            nameMap.put("665", "コフーライ");
            nameMap.put("666", "ビビヨン");
            nameMap.put("667", "シシコ");
            nameMap.put("668", "カエンジシ");
            nameMap.put("669", "フラベベ");
            nameMap.put("670", "フラエッテ");
            nameMap.put("671", "フラージェス");
            nameMap.put("672", "メェークル");
            nameMap.put("673", "ゴーゴート");
            nameMap.put("674", "ヤンチャム");
            nameMap.put("675", "ゴロンダ");
            nameMap.put("676", "トリミアン");
            nameMap.put("677", "ニャスパー");
            nameMap.put("678", "ニャオニクス");
            nameMap.put("679", "ヒトツキ");
            nameMap.put("680", "ニダンギル");
            nameMap.put("681", "ギルガルド");
            nameMap.put("682", "シュシュプ");
            nameMap.put("683", "フレフワン");
            nameMap.put("684", "ペロッパフ");
            nameMap.put("685", "ペロリーム");
            nameMap.put("686", "マーイーカ");
            nameMap.put("687", "カラマネロ");
            nameMap.put("688", "カメテテ");
            nameMap.put("689", "ガメノデス");
            nameMap.put("690", "クズモー");
            nameMap.put("691", "ドラミドロ");
            nameMap.put("692", "ウデッポウ");
            nameMap.put("693", "ブロスター");
            nameMap.put("694", "エリキテル");
            nameMap.put("695", "エレザード");
            nameMap.put("696", "チゴラス");
            nameMap.put("697", "ガチゴラス");
            nameMap.put("698", "アマルス");
            nameMap.put("699", "アマルルガ");
            nameMap.put("700", "ニンフィア");
            nameMap.put("701", "ルチャブル");
            nameMap.put("702", "デデンネ");
            nameMap.put("703", "メレシー");
            nameMap.put("704", "ヌメラ");
            nameMap.put("705", "ヌメイル");
            nameMap.put("706", "ヌメルゴン");
            nameMap.put("707", "クレッフィ");
            nameMap.put("708", "ボクレー");
            nameMap.put("709", "オーロット");
            nameMap.put("710", "バケッチャ");
            nameMap.put("711", "パンプジン");
            nameMap.put("712", "カチコール");
            nameMap.put("713", "クレベース");
            nameMap.put("714", "オンバット");
            nameMap.put("715", "オンバーン");
            nameMap.put("716", "ゼルネアス");
            nameMap.put("717", "イベルタル");
            nameMap.put("718", "ジガルデ");
            nameMap.put("719", "ディアンシー");
            nameMap.put("720", "フーパ");
        }
    }

}
