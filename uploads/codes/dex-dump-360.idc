static main(void)
{
	auto fp, begin, end, dexbyte;
	path = "d:\\classes-360.dex"  //文件路径
	fp = fopen(path, "wb"); //打开或创建一个文件
	begin =  0x78F0B008;              //dex基址
	end = begin + 0x941fc;            //dex基址 + dex文件大小
	for ( dexbyte = begin; dexbyte < end;dexbyte ++ )
	{
		fputc(Byte(dexbyte), fp);     //按字节将其dump到本地文件中
	}
	fclose(fp); //关闭文件句柄
        Message("\nDump Dex files succeeded: %s. \n--Coded by B.S.\n\n", path);
}