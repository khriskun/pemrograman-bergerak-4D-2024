fun main() {

    var hargaBayar: Int
    var hargaKembali: Int
    var byr: Int
    var inp: Int
    var repeat = "Y"
    while (repeat.equals("Y") || repeat.equals("y")) {
        println("===============")
        println("Menu Kasir")
        println("===============")
        println("1. Paket 1 (Pecel Lele + Jus Jeruk)")
        println("2. Paket 2 (Ayam Penyet + Jus Alpukat)")
        println("3. Paket 3 (Nasi Bebek + Es Teh)")
        println("================")
        print("Pilih Menu: ")
        val choice = readLine()!!.toInt()

        when (choice) {
            1 -> {
                println("\n Total bayar Paket 1")
                println("---------------------------")
                val hargaLele = HargaMenu()
                println("Harga Spesial Jumbo:  ${hargaLele.hrgPecelLele}")
                println("Jus Jeruk: ${hargaLele.jusJeruk}")
                print("Pesan jus Jeruk(isi dengan angka): ")
                inp = readLine()?.toIntOrNull() ?: 0
                if (inp == 0) {
                    hargaBayar = hargaLele.hargaPecel(inp)
                    println("\n\nTotal harga yang dibayarkan: Rp. $hargaBayar")
                    print("Dibayar Rp. ")
                    byr = readLine()?.toIntOrNull() ?: 0
                    if (byr == 0) {
                        hargaKembali = byr - hargaBayar
                        println("Kembali Rp. $hargaKembali")
                    } else {
                        hargaKembali = byr - hargaBayar
                        println("Kembali Rp. $hargaKembali")
                    }

                } else {
                    hargaBayar = hargaLele.hargaPecel(inp)
                    println("\n\nTotal harga yang dibayarkan: Rp. $hargaBayar")
                    print("Dibayar Rp. ")
                    byr = readLine()?.toIntOrNull() ?: 0
                    if (byr == 0) {
                        hargaKembali = byr - hargaBayar
                        println("Kembali Rp. $hargaKembali")
                    } else {

                        hargaKembali = byr - hargaBayar
                        println("Kembali Rp. $hargaKembali")
                    }

                }
            }
            2 -> {
                println("\n Total bayar Paket 2")
                println("---------------------------")
                val harga = HargaMenu()
                println("Harga Spesial Jumbo:  ${harga.hrgAyamPenyet}")
                println("Jus Alpukat: ${harga.jusPokat}")
                print("Pesan jus alpukat(isi dengan angka): ")
                inp = readLine()?.toIntOrNull() ?: 0
                if (inp == 0) {
                    hargaBayar = harga.hargaAyamPenyet(inp)
                    println("\n\nTotal harga yang dibayarkan: Rp. $hargaBayar")
                    print("Dibayar Rp. ")
                    byr = readLine()?.toIntOrNull() ?: 0
                    if (byr == 0) {
                        hargaKembali = byr - hargaBayar
                        println("Kembali Rp. $hargaKembali")
                    } else {
                        hargaKembali = byr - hargaBayar
                        println("Kembali Rp. $hargaKembali")
                    }

                } else {
                    hargaBayar = harga.hargaAyamPenyet(inp)
                    println("\n\nTotal harga yang dibayarkan: Rp. $hargaBayar")
                    print("Dibayar Rp. ")
                    byr = readLine()?.toIntOrNull() ?: 0
                    if (byr == 0) {
                        hargaKembali = byr - hargaBayar
                        println("Kembali Rp. $hargaKembali")
                    } else {

                        hargaKembali = byr - hargaBayar
                        println("Kembali Rp. $hargaKembali")
                    }

                }
            }
            3 -> {
                println("\n Total bayar Paket 3")
                println("---------------------------")
                val harga = HargaMenu()
                println("Harga Spesial Jumbo:  ${harga.hrgNasiBebek}")
                println("Es Teh: ${harga.EsTeh}")
                print("Pesan Es Teh(isi dengan angka): ")
                inp = readLine()?.toIntOrNull() ?: 0
                if (inp == 0) {
                    hargaBayar = harga.hargaNasiBebek(inp)
                    println("\n\nTotal harga yang dibayarkan: Rp. $hargaBayar")
                    print("Dibayar Rp. ")
                    byr = readLine()?.toIntOrNull() ?: 0
                    if (byr == 0) {
                        hargaKembali = byr - hargaBayar
                        println("Kembali Rp. $hargaKembali")
                    } else {
                        hargaKembali = byr - hargaBayar
                        println("Kembali Rp. $hargaKembali")
                    }

                } else {
                    hargaBayar = harga.hargaNasiBebek(inp)
                    println("\n\nTotal harga yang dibayarkan: Rp. $hargaBayar")
                    print("Dibayar Rp. ")
                    byr = readLine()?.toIntOrNull() ?: 0
                    if (byr == 0) {
                        hargaKembali = byr - hargaBayar
                        println("Kembali Rp. $hargaKembali")
                    } else {

                        hargaKembali = byr - hargaBayar
                        println("Kembali Rp. $hargaKembali")
                    }

                }
            }
            else -> println("Pilihan salah")

        }

        print("Transaksi selanjutnya? (Y/T)")
        repeat = readLine()!!.toString()
    }
}
class HargaMenu() {
    val hrgPecelLele: Int = 15000
    val jusJeruk: Int = 8000

    val hrgAyamPenyet: Int = 17000
    val jusPokat: Int = 7500

    val hrgNasiBebek: Int = 20000
    val EsTeh: Int = 5000

    fun hargaPecel(jmlPesananJeruk: Int): Int {
        val totalHrgJusJeruk: Int
        if (jmlPesananJeruk == 0) {
            totalHrgJusJeruk = hrgPecelLele + (jusJeruk * 1)
        } else {
            totalHrgJusJeruk = hrgPecelLele + (jusJeruk * jmlPesananJeruk)
        }
        return totalHrgJusJeruk
    }

    fun hargaAyamPenyet(jmlPesananPokat: Int): Int {
        val totalHrgJusPokat: Int
        if (jmlPesananPokat == 0) {
            totalHrgJusPokat = hrgAyamPenyet + (jusPokat * 1)
        } else {
            totalHrgJusPokat = hrgAyamPenyet + (jusPokat * jmlPesananPokat)
        }
        return totalHrgJusPokat
    }

    fun hargaNasiBebek(jmlPesananBebek: Int): Int {
        val totalEsTeh: Int
        if (jmlPesananBebek == 0) {
            totalEsTeh= hrgNasiBebek + (EsTeh * 1)
        } else {
            totalEsTeh = hrgNasiBebek + (EsTeh * jmlPesananBebek)
        }
        return totalEsTeh
    }
}