import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://genesis.dutatani.id/si_petani/login.php?pesan=Mohon%20Login')

WebUI.setText(findTestObject('Object Repository/Pengujian Insert Petani Berhasil/input_ID User_id_user'), 'tester_otomasi')

WebUI.setEncryptedText(findTestObject('Object Repository/Pengujian Insert Petani Berhasil/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Pengujian Insert Petani Berhasil/input_Password_btn btn-primary btn-lg'))

WebUI.click(findTestObject('Object Repository/Pengujian Insert Petani Berhasil/a_Pendataan Petani'))

WebUI.setText(findTestObject('Object Repository/Pengujian Insert Petani Berhasil/input_Id User_id_user (1)'), 'PT-002')

WebUI.setText(findTestObject('Object Repository/Pengujian Insert Petani Berhasil/input_Nama Petani_nama_petani'), 'Joji Jojo')

WebUI.setText(findTestObject('Object Repository/Page_/input_Tanggal Lahir_tanggal_lahir'), '11051997')

WebUI.setText(findTestObject('Object Repository/Pengujian Insert Petani Berhasil/input_Nama Istri  Suami_nama_istri'), 'Rose')

WebUI.setText(findTestObject('Object Repository/Pengujian Insert Petani Berhasil/input_Alamat Petani_alamat_petani'), 'Jl. Magelang Km 5')

WebUI.selectOptionByValue(findTestObject('Object Repository/Pengujian Insert Petani Berhasil/select_Provinsi                            _919ea7'), 
    'DI YOGYAKARTA', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Pengujian Insert Petani Berhasil/select_KabupatenKABUPATEN BANTULKABUPATEN G_999db8'), 
    'KABUPATEN SLEMAN', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Pengujian Insert Petani Berhasil/select_KecamatanMOYUDANMINGGIRSEYEGANGODEAN_9010d9'), 
    'SLEMAN', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Pengujian Insert Petani Berhasil/select_Desa  KelurahanCATUR HARJOPANDOWO HA_343a22'), 
    'PANDOWO HARJO', true)

WebUI.setText(findTestObject('Object Repository/Pengujian Insert Petani Berhasil/input_Nomor Telepon_nomor_telpon'), '081672846381')

WebUI.selectOptionByValue(findTestObject('Object Repository/Pengujian Insert Petani Berhasil/select_SD                                  _d31312'), 
    'S2', true)

WebUI.setText(findTestObject('Object Repository/Pengujian Insert Petani Berhasil/input_Jumlah Lahan_jml_lahan'), '500')

WebUI.setText(findTestObject('Object Repository/Pengujian Insert Petani Berhasil/input_Jumlah Tanggungan_jumlah_tanggungan'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Pengujian Insert Petani Berhasil/input_Jumlah Tenaga Kerja Musiman_jml_tng_k_49b205'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Pengujian Insert Petani Berhasil/input_Email_email'), 'joji@gmail.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Pengujian Insert Petani Berhasil/select_Islam                               _f363b0'), 
    'Katolik', true)

WebUI.setText(findTestObject('Object Repository/Pengujian Insert Petani Berhasil/textarea_Deskripsi Keahlian_deskripsi_keahlian'), 
    'Bisa Apa Saja')

WebUI.click(findTestObject('Object Repository/Pengujian Insert Petani Berhasil/label_Aktif'))

WebUI.click(findTestObject('Object Repository/Pengujian Insert Petani Berhasil/label_Laki-laki'))

WebUI.click(findTestObject('Object Repository/Pengujian Insert Petani Berhasil/input_Password_btn btn-primary btn-lg'))

WebUI.setText(findTestObject('Object Repository/Pengujian Insert Petani Berhasil/input_Cetak Daftar_input_cari'), 'Joji')

WebUI.click(findTestObject('Object Repository/Pengujian Insert Petani Berhasil/input_Cetak Daftar_cari'))

WebUI.click(findTestObject('Object Repository/Pengujian Insert Petani Berhasil/a_Detail'))

WebUI.click(findTestObject('Object Repository/Pengujian Insert Petani Berhasil/a_Keluar'))

WebUI.closeBrowser()

