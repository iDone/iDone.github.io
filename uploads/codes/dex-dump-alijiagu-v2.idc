static main(void)
{
  auto fp, dex_addr,end_addr;

  auto path = "d:\\classes-.dex";   //dump��dex�ļ�·��
	
  fp = fopen(path, "wb"); //�򿪻򴴽�һ���ļ�
	
  end_addr = r0 + r1;             //dex��ַ //dex��ַ + dex�ļ���С
	
  for (dex_addr = r0; dex_addr < end_addr; dex_addr ++)
  {
    fputc(Byte(dex_addr), fp);  //���ֽڽ���dump�������ļ���
  }
  fclose(fp); //�ر��ļ����
  Message("\nDump Dex files succeeded: %s. \n--Coded by B.S.\n\n", path);
}	