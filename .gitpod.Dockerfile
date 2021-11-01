FROM gitpod/workspace-full-vnc
                    
USER gitpod

RUN sudo apt-get update && \
    sudo apt-get install -y libnss3-dev libvulkan1 firefox xterm && \
    sudo rm -rf /var/lib/apt/lists/* && \
    cd ~ && \
    mkdir wpilib && cd wpilib && \
    mkdir 2021 && cd 2021 && \
    wget https://github.com/wpilibsuite/allwpilib/releases/download/v2021.3.1/WPILib_Linux-2021.3.1.tar.gz && \ 
    tar -xf WPILib_Linux-2021.3.1.tar.gz && \
    cd tools && \
    java -jar ToolsUpdater.jar
    


# Install custom tools, runtime, etc. using apt-get
# For example, the command below would install "bastet" - a command line tetris clone:
#
# RUN sudo apt-get -q update && #     sudo apt-get install -yq bastet && #     sudo rm -rf /var/lib/apt/lists/*
#
# More information: https://www.gitpod.io/docs/config-docker/