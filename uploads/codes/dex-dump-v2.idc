static main(void)
{
  auto fp, dex_addr,end_addr;

  auto path = "d:\\classes-.dex";   //dump的dex文件路径
	
  fp = fopen(path, "wb"); //打开或创建一个文件
	
  end_addr = r4 + r5;             //dex基址 //dex基址790B5000 + dex文件大小0x0004BC38
	
  for (dex_addr = r4; dex_addr < end_addr; dex_addr ++)
  {
    fputc(Byte(dex_addr), fp);  //按字节将其dump到本地文件中
  }
  fclose(fp); //关闭文件句柄
  Message("\nDump Dex files succeeded: %s. \n--Coded by B.S.\n\n", path);
}	